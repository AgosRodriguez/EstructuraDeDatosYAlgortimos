package colecciones.cola;

import java.util.Collection;

/**
* Implementación basada en arreglos de tamaño fijo de la interfaz {@code Cola}.
* @see colecciones.cola.Cola
*/
public class ColaArregloFijoo<T> implements Cola<T> {

	/**
	* Capacidad máxima por defecto ({@value #CAPACIDAD_POR_DEFECTO})
	*/
	public static final int CAPACIDAD_POR_DEFECTO = 20;
	private Object[] arreglo;
	private int elementos = 0;

	/**
	* Construye una nueva cola vacía con una capacidad máxima de {@value #CAPACIDAD_POR_DEFECTO}.
	*/
	public ColaArregloFijo() {
		this(CAPACIDAD_POR_DEFECTO);
	}

	/**
	* Construye una nueva cola vacía con una capacidad determinada mayor a 0.
	* @param capacidad la capacidad de la cola
	* @throws IllegalArgumentException si {@code capacidad} es menor o igual a 0 
	*/
	public ColaArregloFijo(int capacidad) {
		if (capacidad <= 0)
			throw new IllegalArgumentException("la capacidad debe ser un numero positivo (" + capacidad + ")");
		arreglo = new Object[capacidad];
	}

	/**
	* Construye una cola a partir de elementos en una colección.
	* Los elementos en la colección se encolan de izquierda a derecha.
	* La capacidad de la cola va a ser suficiente para por lo menos contener todos los elementos de la colección.
	* @param elems los elementos a agregar a la cola
	*/
	public ColaArregloFijo(Collection<T> elems) {
		if (elems == null)
			throw new IllegalArgumentException("elems es null");
		arreglo = new Object[Math.max(elems.size(), CAPACIDAD_POR_DEFECTO)];
		for (T e : elems) {
			encolar(e);	
		}
	}

	@Override
	public boolean esVacia() {
		return elementos == 0;	
	}

	@Override
	public int elementos() {
		return elementos;
	}

	@Override
	public boolean encolar(T elem) {
		if(arreglo.length == elementos){
			throw new IllegalArgumentException("Cola llena");
		}

		arreglo[elementos] = elem;
		elementos ++;
		return true;
		
	}


	@SuppressWarnings("unchecked")
	@Override
	public T desencolar() {
		if (esVacia()){
			throw new IllegalArgumentException("Cola vacia");
		} else {
			T aux = (T) arreglo[0];
			for(int i = 0; i < elementos; i++){
				arreglo[i] = arreglo[i+1];
			}
			elementos--;
			return aux;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public T primero() {
		if(esVacia()){
			throw new IllegalStateException("Cola Vacia");
		}
		return (T) arreglo[0];
	}

	@Override
	public void vaciar() {
		elementos = 0;	
	}

	@Override
	public boolean repOK() {
		throw new UnsupportedOperationException("Implementar y eliminar esta sentencia");	
	}

	@Override
	public String toString() {
		if(esVacia()){
			return "[]";
		}
		String a = "[";
		for(int i = 0; i < elementos-1; i++){
			a += arreglo[i] +", ";
		}
		 	a += arreglo[elementos-1];
			a += "]";

		return a;
	}


	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object other) {
		if(other == null){
			return false;
		}	
		if(other == this){
			return true;
		}
		if(!(other instanceof ColaArregloFijo)){
			return false;
		}

		ColaArregloFijo<T> nuevaCola = (ColaArregloFijo<T>) other;
		if(nuevaCola.elementos != elementos){
			return false;
		} else {
			for(int i = 0; i < elementos; i++){
				if(arreglo[i] != nuevaCola.elemento(i)){
					return false;
				}
			}
		}

		return true;
	}

	/**
	* Permite obtener un elemento del arreglo en un indice determinado realizando el casteo necesario.
	* @param index el indice del elemento a obtener
	*/
	@SuppressWarnings("unchecked")
   	private T elemento(int index) {
		if (index < 0 || index >= elementos){
			throw new IndexOutOfBoundsException("Error en el indice");
		} 

    	return (T) arreglo[index];
	}
}
