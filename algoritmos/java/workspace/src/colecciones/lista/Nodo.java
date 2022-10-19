package colecciones.lista;

public class Nodo<T> {
    private T elem;
    private Nodo<T> siguiente;

    //Constructores

    public Nodo(T elem, Nodo<T> siguiente){
        this.elem = elem;
        this.siguiente = siguiente;
    }

    public Nodo(){
    }

    //Getters and Setters

    public void setElem(T elem){
        this.elem = elem;
    }

    public T getElem(){
        return elem;
    }

    public Nodo<T> getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }
}
