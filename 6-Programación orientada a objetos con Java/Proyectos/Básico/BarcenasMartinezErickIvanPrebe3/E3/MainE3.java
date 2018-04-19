/*
3.- Realiza una clase llamada “Persona” que tenga los atributos: nombre, edad, estatura (metros) y peso (Kg). 

Utilizando la clase Scanner, el usuario deberá pedir los valores de los atributos
(accediendo a ellos por métodos set). 

Haz uso de las clases envolventes o Wrappers (Integer,
Double, etc…) 

Los datos ingresados deberán aparecer con una impresión de pantalla de la siguiente
manera:
Nombre de la persona: Nombre_dado
Edad: Edad_ingresada
Estatura: Estatura_ingresada (m)
Peso: Peso (kg)
*/

import java.util.Scanner;

public class MainE3{

public static void main(String... args){

	String VarProvisional1;
	Integer VarProvisional2;
	double VarProvisional3=0f;
	double VarProvisional4=0f;


	System.out.println("\nIngresa tu nombre: ");
	Scanner pedirValores1 = new Scanner(System.in);
	VarProvisional1=pedirValores1.nextLine();

	Persona p1 = new Persona();
	p1.setNombre(VarProvisional1);

	


	System.out.println("\nIngresa tu edad: ");
	Scanner pedirValores2 = new Scanner(System.in);
	VarProvisional2=Integer.parseInt(pedirValores2.nextLine());
	
	Persona p2 = new Persona();
	p2.setEdad(VarProvisional2);


	System.out.println("\nIngresa tu estatura (m): ");
	Scanner pedirValores3 = new Scanner(System.in);
	VarProvisional3=Double.parseDouble(pedirValores3.nextLine());
	
	Persona p3 = new Persona();
	p3.setEstatura(VarProvisional3);


	System.out.println("\nIngresa tu peso (kg): ");
	Scanner pedirValores4 = new Scanner(System.in);
	VarProvisional4=Double.parseDouble(pedirValores4.nextLine());
	
	Persona p4 = new Persona();
	p4.setPeso(VarProvisional4);

	System.out.println("\nNombre de la persona: "+p1.getNombre());
	System.out.println("\nEdad:                 "+p2.getEdad()+" m");
	System.out.println("\nEstatura:             "+p3.getEstatura()+" kg");
	System.out.println("\nPeso:                 "+p4.getPeso());





}


}