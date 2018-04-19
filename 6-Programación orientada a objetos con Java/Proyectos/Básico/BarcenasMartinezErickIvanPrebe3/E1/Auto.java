
class Auto{

//Creamos los tres atributos, nos pide un modificador de acceso: private
	private String marca;
	private String color;
	private int modelo;


//Creo el constructor por defecto

	public Auto(){
	}


//Ahora sobrecargo el constructor con ---> sobrecarga de constructor
//--->Existe sobrecarga de metodos (creo n metodos con el mismo nombre 
//y diferentes parametros, entonces java elegira que metodo debe ejecutarse)

	public Auto(String marca,String color, int modelo){
	
	//Métodos setters 
	this.marca=marca;

	this.color=color;

	this.modelo=modelo;
	//	System.out.println("modelo:" +modelo);

	}

//Métodos getters 

public String getMarca(){
	return marca;
}

public String getColor(){
	return color;
}

public int getModelo(){
	return modelo;
}

//Funcion para imprimir todo junto

public void muestraDatos(){

	System.out.println("\nAuto \nMarca:"+getMarca()+"\tColor:"+getColor()+"\tModelo:"+getModelo());
}


//3 Métodos que pueda realizar un automóvil

public void encender(){

	System.out.println("\nEncendiendo");
}

public void apagar(){
	System.out.println("Apagando\n");
}

public void claxon(){
	System.out.println("claxon de Tarsan");
}

}






