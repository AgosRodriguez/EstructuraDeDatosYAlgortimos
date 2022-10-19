package colecciones.lista;

public class ListaEncadenadas<T> implements Lista<T>{
    private Nodo<T> nodo;
    private int incremento;
    
    public ListaEncadenadas (){

    }

    public ListaEncadenadas(Nodo<T> nodo){
        this.nodo = nodo;
    }

    // Getters and Setters
    public Nodo<T> getNodo() {
        return nodo;
    }
    public void setNodo(Nodo<T> nodo) {
        this.nodo = nodo;
    }
    public int getIncremento() {
        return incremento;
    }

public boolean agregar(T elem) {
    Nodo<T> nuevoNodo = new Nodo<T>(elem, null);
        
    if (nodo == null){  
        nodo.setSiguiente(nuevoNodo);
        incremento +=1;
        
        return true;
    } else {
        Nodo<T> aux = nodo;
        while (aux != null){
        aux = aux.getSiguiente();
        }
        aux.setSiguiente(nuevoNodo);
        incremento +=1;
        
        return true;
    }
}

@Override
public boolean agregarTodos(Lista<T> otraLista) {
    ListaEncadenadas<T> lista2 = (ListaEncadenadas<T>) otraLista;
    Nodo<T> aux = lista2.getNodo();

    if (nodo == null){
        
    } else {

    }
    return false;
}

@Override
public boolean insertar(T elem, int indice) {
    // TODO Auto-generated method stub
    return false;
}

@Override
public T eliminar(int indice) {
    // TODO Auto-generated method stub
    return null;
}

@Override
public T obtener(int indice) {
    // TODO Auto-generated method stub
    return null;
}

@Override
public Lista<T> subLista(int desdeInd, int hastaInd) {
    // TODO Auto-generated method stub
    return null;
}

@Override
public boolean contiene(T elem) {
    // TODO Auto-generated method stub
    return false;
}

@Override
public void vaciar() {
    // TODO Auto-generated method stub
    
}

@Override
public int elementos() {
    // TODO Auto-generated method stub
    return 0;
}

@Override
public boolean esVacia() {
    // TODO Auto-generated method stub
    return false;
}

@Override
public boolean repOK() {
    // TODO Auto-generated method stub
    return false;
} 

    //Implementacion de los metodos de mi interfaz lista

    
}
