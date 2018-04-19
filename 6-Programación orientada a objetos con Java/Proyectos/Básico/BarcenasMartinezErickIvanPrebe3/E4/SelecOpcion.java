
import java.util.Scanner;


public class SelecOpcion extends Suma{

	String respuesta ="";
	
/*	String respuesta="";  
    int i=0;

        do{
            
        Scanner recoge = new Scanner(System.in);
        System.out.println("quieres jugar?");
        respuesta=recoge.next();
        
        System.out.println("Tu respuesta  es:"+ respuesta);
            
            
        }while(!respuesta.equalsIgnoreCase("Si"));


    System.out.println("Que emmpiece ");

*/

public void Menu(){


Scanner sc = new Scanner(System.in);
System.out.println("\nSelecciona una opcion: ");
System.out.print("\nsuma (+)\t|resta(-)\t|multiplicacion(*): ");	
	respuesta = sc.nextLine();



	//IngresaMatriz m1 = new IngresaMatriz();
	//m1.
	


	switch(respuesta){

				case "+": 
				System.out.println("\nsuma de matrices A[]+B[]: ");
				//Suma s1 = new Suma();
				sumaYa();

		break;
				case "-": 
				System.out.println("\nresta de matrices A[]-B[]: ");
				restaYa();
		break;
				case "*": 
				System.out.println("\nmultiplicacion de matrices A[]*B[]: ");
				multiplicaYa();
		break;
				default: 
				System.out.println("\nElige una opcion valida");
		break;


	}

}



}