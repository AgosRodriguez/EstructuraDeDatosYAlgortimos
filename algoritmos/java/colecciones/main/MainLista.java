package colecciones.main;

import colecciones.lista.ListaArreglo;

public class MainLista {
    
    public static void main(String[] args){
        ListaArreglo<Integer> a = new ListaArreglo<> (6);
        a.agregar(5);
        a.agregar(3);
        a.agregar(6);
        a.agregar(10);
        a.agregar(4);

        ListaArreglo<Integer> b = new ListaArreglo<> (4);
        b.agregar(45);
        b.agregar(14);
        b.agregar(2);


    System.out.println(a.cap());
    System.out.println(a.cantidad());
    System.out.println(b.obtener(3));

   if ( a.agregarTodos(b)){
    System.out.println("SE INSERTO EL ELEMENTO CORRECTAMENTE");
   } else {
    System.out.println("EL ELEMENTO NO PUDO SER AGREGADO");
    }
    System.out.println(a);
    Integer d = a.eliminar(a.cantidad()-1);
    System.out.println(d);
    System.out.println(a);
    System.out.println(a.subLista(0, 5));


    }    
    

}
