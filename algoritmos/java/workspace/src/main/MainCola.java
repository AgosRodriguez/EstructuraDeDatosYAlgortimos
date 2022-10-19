package colecciones.main;

import colecciones.cola.ColaArregloFijoo;

public class MainCola {

    public static void main (String[] args){
        
        ColaArregloFijoo<Integer> colaNueva = new ColaArregloFijoo<>(10);
        ColaArregloFijoo<Integer> colaNueva2 = new ColaArregloFijoo<>(10);

        colaNueva2.encolar(3);
        colaNueva2.encolar(5);
        colaNueva2.encolar(14);
        colaNueva2.encolar(10);

        colaNueva.encolar(3);
        colaNueva.encolar(5);
        colaNueva.encolar(14);
        colaNueva.encolar(10);

        System.out.println(colaNueva);
        colaNueva.desencolar();
        System.out.println(colaNueva);
      
        System.out.println(colaNueva.primero());

        System.out.println(colaNueva.equals(colaNueva2));
    }
    
}
