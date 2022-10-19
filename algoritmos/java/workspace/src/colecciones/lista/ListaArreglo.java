package colecciones.lista;

import javax.swing.undo.CannotUndoException;

public class ListaArreglo<T> implements Lista<T>{
    
    public static final int MAXX_CAPACIDAD = 10;
    private Object[] arreglo;
    private int cantidad;
    private int cap;

    // CONSTRUCTOR //

    public ListaArreglo(){
        arreglo = new Object[MAXX_CAPACIDAD];
    } 

    public ListaArreglo(int capacidad){
        arreglo = new Object[capacidad];
        cantidad = 0;
        cap = capacidad;
    }

        // GETTERS //
     public Object arreglo(){
        return arreglo;
     }

     public int cantidad(){
        return cantidad;
     }

     public int cap(){
        return cap;
     }

    @Override
    public boolean agregar(T elem) {
        if(cantidad == arreglo.length){
            return false;
        } else {
            arreglo[cantidad] = elem;
            cantidad++;
            return true;
        }
    }

    @Override
    public boolean agregarTodos(Lista<T> otraLista) {
        if(((((ListaArreglo<T>) otraLista).cantidad() + cantidad) >= arreglo.length) || cantidad == arreglo.length){
            return false;
        } else {
            for(int i = 0; i < ((ListaArreglo<T>) otraLista).cantidad(); i++){
                arreglo[cantidad] =  ((ListaArreglo<T>) otraLista).obtener(i);
                cantidad ++;
            }
        }
        return true;
        
    }

    /* (non-Javadoc)
     * @see colecciones.lista.Lista#insertar(java.lang.Object, int)
     */
    @Override
    public boolean insertar(T elem, int indice) {
        if (cantidad == arreglo.length){
            return false;
        }
        if(indice >= 0 && indice < arreglo.length){
            if(indice == cantidad){
                arreglo[indice] = elem;
                cantidad++;
            } else {
                if (indice < cantidad){
                    for(int i = cantidad; i >= indice; i--){
                        arreglo[i+1] = arreglo[i];
                    }
                    arreglo[indice] = elem;
                    cantidad++;
                } else {
                    arreglo[cantidad] = elem;
                    cantidad ++;
                }
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T eliminar(int indice) {
    
        if(indice == cantidad-1){
            cantidad --;
            return (T) arreglo[indice];
        }  
        if(indice < cantidad){
            T aux = (T) arreglo[indice];
            for(int i = indice; i < cantidad; i++){
                arreglo[i] = arreglo[i+1];
            }
            cantidad --;
            return aux;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T obtener(int indice) {
        if(indice < cantidad){
            return (T) arreglo[indice];
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Lista<T> subLista(int desdeInd, int hastaInd) {
        ListaArreglo<T> subArreglo = new ListaArreglo<>();
        if((0 <= desdeInd && desdeInd < cantidad) && (desdeInd <= hastaInd && hastaInd < cantidad)){
            for(int i = desdeInd; i <= hastaInd; i++){
                subArreglo.agregar((T) arreglo[i]);             
            }
            return subArreglo;
        }
        return null;
    }

    @Override
    public boolean contiene(T elem) {
        for(int i = 0; i <= cantidad; i++){
            if(arreglo[i] == elem){
                return true;
            }
        }
        return false;
    }

    @Override
    public void vaciar() {
        cantidad = 0;
        
    }

    @Override
    public int elementos() {   
        return cantidad;
    }

    @Override
    public boolean esVacia() {
        return cantidad == 0;
    }

    @Override
    public boolean repOK() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
	public String toString() {
		String cadena = "[";

		for(int i=0; i<cantidad-1; i++){
			cadena += arreglo[i] + ", ";
		}
		cadena += arreglo[cantidad-1];
		cadena += "]";

		return cadena;
	}
    
}
