package main;

import datos.Libro;

/**
* La clase {@code MainLibro} implementa una aplicación simple para mostrar el uso de {@code Libro}.
* Esta clase no usa parámetros, el comportamiento está completamente "hardcodeado" requiriendo modificiar y recompilar para hacer pruebas.
* @see datos.Libro
* @version 1.0
*/
public class MainLibro {

	/**
	* Experimenta con libros, sus métodos y la diferencia entre usar {@code equals()} y {@code ==}.
	* @param args : arguments for this main method, not used in this implementation.
	* @see Object#equals(Object)
	*/
	public static void main(String[] args) {
		Libro libro1 = new Libro("Isaac Asimov", "The Caves of Steel", 42);
		Libro libro2 = new Libro("Isaac Asimov", "The Caves of Steel", 42);
		Libro libro3 = new Libro("Isaac Asimov", "The Naked Sun", 47);
		System.out.println(libro1 + " \ny " + libro2 + "\nSon iguales usando equals? " + (libro1.equals(libro2)));
		System.out.println(libro1 + " \ny " + libro2 + "\nSon iguales usando ==? " + (libro1 == libro2));
		System.out.println(libro1 + " \ny " + libro3 + "\nSon iguales usando equals? " + (libro1.equals(libro3)));
		System.out.println(libro1 + " \ny " + libro3 + "\nSon iguales usando ==? " + (libro1 == libro3));
		Libro libro4 = new Libro(null, null, 0);
		System.out.println(libro4);
		Libro libro5 = null;
		System.out.println("\n\nCondicion ?? :" + (null == libro5)); // --> True
		Libro libro8 = new Libro(null, "Griego", 0);
		System.out.println("Libro 5: " + libro5);
		System.out.println("Libro 8: " + libro8);
 	} 

}
