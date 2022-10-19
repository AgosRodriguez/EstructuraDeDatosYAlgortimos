package racional;

public class Racional {
    private long numerador;
    private long denominador;


    //CONSTRUCTOR 
    //El denominador siempre debe ser positivo y distinto de cero.
    public Racional(){
        denominador = 1;
    }

    public Racional(long numerador, long denominador){
		this.numerador = numerador;
		if (denominador > 0){
			this.denominador = denominador;
		}
	}

    //GETTER AND SETTER

    public void setNumerador(long numerador){
        this.numerador = numerador;
    }

    public long getNumerador(){
        return numerador;
    }

    public void serDenominador(long denominador){
        this.denominador = denominador;
    }

    public long getDenominador(){
        return denominador;
    }

    @Override 
    public String toString(){
        if(denominador == 1 || numerador == 0){
            return " " + numerador ;
        } else {
            return numerador + "/" + denominador;
        }
    }


    public Racional sumaRacional(Racional num){
        Racional num2 = new Racional(this.numerador, this.denominador); 
       
        num2.numerador = num.numerador +  num2.numerador;
        num2.denominador = num.denominador + num2.denominador;
        
        return num2;
    }

    public Racional restaRacional(Racional num){
        Racional num1 = new Racional (this.numerador, this.denominador);
      
        if(num1.denominador == num.denominador){
            num1.numerador = num1.numerador - num.numerador;
        }
        else{
            num1.numerador = (num1.numerador * num.denominador - num1.denominador * num.numerador);
            num1.denominador *= num.denominador;
        }
        
        return num1;
    }
}