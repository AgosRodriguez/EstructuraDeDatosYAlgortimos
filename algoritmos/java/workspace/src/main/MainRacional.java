package main;

import racional.Racional;

public class MainRacional{

    public static void main(String[] args) {
        Racional num1 = new Racional(1,7);
        Racional num2 = new Racional(5,7);

        Racional result = num1.restaRacional(num2);

        System.out.println(result);
        System.out.println(num2.restaRacional(num1));

        Racional num3 = new Racional(5,4);
        Racional num4 = new Racional(1,6);

        Racional resultado = num4.restaRacional(num3);
        
        System.out.println(resultado);

        Racional resultadoSuma = num2.sumaRacional(num3);

        System.out.println(resultadoSuma);

        Racional num5 = new Racional(5,0);
    
        System.out.println(num5);

        Racional num6 = new Racional();
        System.out.println(num6);
    }
}
