/*1.- Crea una clase llamada Auto que contenga los siguientes elementos:
-Al menos 3 atributos de diferentes tipos.
-Constructor por defecto y sobrecarga de constructor
-Métodos getters y setters para encapsulamiento.

- 3 Métodos que pueda realizar un automóvil.
En otra clase de prueba, deberás instanciar 3 objetos, y con ellos mandar a llamar a cada uno de los
métodos realizados (Hacer uso también de los métodos set para poder cambiar su nombre y de los
métodos get para poder imprimir sus datos). Se puede o no hacer uso de la clase Scanner.*/


//me di una vuelta por netbeans, ahí crean los package y estos se escribe arriba
//ej.: package auto; --> como el nombre de la clase pero en minusculas

class MainE1{

//Solo una funcion main

	public static void main(String... Erick){ //¿Hay problema? Solo lo marque

	int autoRecibe=0;

//doy paso a la sobrecarga 
	Auto Auto1 = new Auto();
	Auto Auto2 = new Auto("Camaro","Amarillo",1);
	//autoRecibe=primerAuto.Auto();

	//ocupo el set y get, éste último lo imprimo con una funcion


	System.out.println("\n FAST FURIUS RANCHO");
	Auto2.muestraDatos();

	//3 metodos

	Auto2.encender();
	Auto2.claxon();
	Auto2.apagar();

	//Otra Clase

	//existe un metodo más eficiente
	OtraClase Otra1 = new OtraClase(50,0,"Mustang", "Rojo",65);
	Otra1.mostrarPorcentajes();

	OtraClase Otra2 = new OtraClase(50,0,"BMW", "Blanco",001);
	Otra2.mostrarPorcentajes();

	OtraClase Otra3 = new OtraClase(50,0,"Lobo", "Negro",98);
	Otra3.mostrarPorcentajes();

	}
}