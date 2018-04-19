import java.util.Scanner;

public class Cuadrado{
//atributos
	private double ladoCuadrado;

	private double perimetroCuadrado;
	private double areaCuadrado;

//creo el constructor por defecto

public Cuadrado(){

}

//metodos set

public void setLadoCuadrado(double ladoCuadrado){
this.ladoCuadrado=ladoCuadrado;	
}


//declaro mis get

public double getLadoCuadrado(){
return ladoCuadrado;
}




//creo dos metodos
//public double areaCirculo(){
	//getLadoCirculo();
//}

//setLadoCirculo(double ladoCirculo)


//metodos de calculos

public double areaCuadrado(){
return (double)Math.pow(getLadoCuadrado(), getLadoCuadrado());
}

public double perimetroCuadrado(){
return 4*getLadoCuadrado();	
}





}