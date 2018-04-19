import java.util.Scanner;

public class Circulo{
//atributos
	private double ladoCirculo;
	private double radioCirculo;

	private double perimetroCirculo;
	private double areaCirculo;


/**final implica que el valor de la variable o de la referencia no puede cambiar.*/
	private final double PII = 3.1416;
//prefiero ocupar Math.PI


//creo el constructor por defecto

public Circulo(){

}


//metodos set

public void setLadoCirculo(double ladoCirculo){
this.ladoCirculo=ladoCirculo;	
}


public void setRadioCirculo(double radioCirculo){
this.radioCirculo=radioCirculo;
}



//declaro mis get

public double getLadoCirculo(){
return ladoCirculo;
}

public double getRadioCirculo(){
return radioCirculo;
}




//creo dos metodos
//public double areaCirculo(){
	//getLadoCirculo();
//}

//setLadoCirculo(double ladoCirculo)

//public double perimetroCirculo(){}


//metodos de calculos

public double areaCirculo(){
return Math.PI*(double)Math.pow(getRadioCirculo(), 2);
}

public double perimetroCirculo(){
return Math.PI*2*getRadioCirculo();
}





}