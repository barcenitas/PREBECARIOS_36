/*8.- Crea una calculadora que haga operaciones entre dos números.
Las sumas que deberá soportar
serán suma, resta, multiplicación y división. 
El programa debe de contener un menú que me permita
elegir cualquier opción y la última de ellas debe ser para salir.
Si se termina una operación debo de
volver al menú de inicio. 
No debe haber forma de salirse del programa a menos que sea con la
opción salir. 
Considerar todas las excepciones posibles e implementarlas para evitar errores en
tiempo de ejecución. 
Considera: División entre cero, números demasiado grandes, cadenas en vez
de números, entre otras que a ti se te puedan ocurrir.
*/

import java.util.Scanner;
import java.util.ResourceBundle;

public class MainE8{


	public static void main(String[] args) {

		//defino mis atributos
		Scanner scanner = new Scanner(System.in);
		double res,var1, var2;

		Calculadora c1 = new Calculadora();

		int opcion;

		do{
			try{
			System.out.println("\n\n\nCalculadora PrebeCalcu");
			System.out.print("Ingresa el primer Numero: ");
		    var1 = scanner.nextDouble();
		    System.out.print("Ingresa el segundo Numero: ");
		    var2 = scanner.nextDouble();
		    System.out.println("Ingresa la opcion de la operacion que deseas realizar: ");
			System.out.print("\t1.Suma| \t2.Resta|\t3.Multiplicacion|\t4.Division|\t0.Exit\n");
		    opcion = scanner.nextInt();
			}catch(Exception ex){
				//ex.printStackTrace();
				throw new RuntimeException("Error verificando datos", ex);
			}finally{
				System.out.println("3 2 1 ...");
			}	

		    switch (opcion) {
		    	case 1:
				System.out.println("Suma");
				res=c1.suma(var1,var2);
				System.out.println("La suma es: "+res);
				break;
			case 2:
				System.out.println("Resta");
				res=c1.resta(var1,var2);
				System.out.println("La Resta es: "+res);
				break;
			case 3:
				System.out.println("Multiplicacion");
				res=c1.multiplicacion(var1,var2);
				System.out.println("La Multiplicacion es: "+res);
				break;
			case 4:
				System.out.println("Division");
				res=c1.division(var1,var2);
				System.out.println("La Division es: "+res);
				break;
			case 0:
				System.out.println("Saliendo .... ");
				break;

			default:
				System.out.println("Opcion invalida");
				break;
		    }
			
		}while(opcion!=0);

		System.out.println("Se termino la ejecucion del programa");
	}
}