/*
5.- Una persona se dirige al PrebeMart a realizar sus compras semanales. Dicha persona no sabe
cuántos productos va a comprar y tampoco sabe su valor. Para poder ayudarlo deberás de
implementar dos ArrayList. Uno que contenga los nombres de los productos y otro que contenga
los precios de dichos productos. 

Tanto el nombre como el precio, deberán ser ingresados por el
usuario, y en seguida, deberán de ser ingresados a las Colecciones.


Al momento de pagar le aparece
una lista de todos los productos que ha llevado con su respectivo precio, sin embargo, se da cuenta
que sólo tiene $500.00, por lo que, si ha excedido su cuenta, deberá elegir unos productos y dejar
otros. Para lograr eso, debe poder acceder al índice del producto y así poder elegirlo para eliminarlo
de su lista, hasta que finalmente la cuenta sea menor o igual a los $500.00.

El programa debe de preguntar al usuario si desea agregar un producto a su lista, si es así deberá de
ingresar tanto el nombre como el precio a los ArrayList. En caso de que ya no quiera agregar más
productos, le aparecerá en pantalla la lista de todos los productos que ha llevado (nombre y precio)
así como la suma de los precios. Cuando aparezca la lista, deberá de tener dos opciones 1) Comprar
o 2) Dejar productos. Para la opción 1) Comprar, deberás de tener validaciones para ver si el dinero
que tiene es suficiente. Si el dinero es suficiente, deberá de imprimirse un mensaje que diga “Gracias
por su compra!”, en caso contrario debe mandarlo a la opción de “Dejar productos”. Si el usuario
elige la opción 2) Dejar productos (porque vio en la suma que el dinero no es suficiente) deberá
poder ver los índices de los productos en los ArrayList para así poder decidir cuál eliminar. Una vez
eliminados los productos, debes imprimir de nuevo la lista de productos a comprar con su precio y
darle a elegir de nuevo entre las dos opciones
*/

import java.util.ArrayList;
import java.util.Scanner;


public class MainE5{


	public static void main(String... Erick){
	
	String respuesta="";  
     int i=0;
/*
	NombreProductos n1 = new NombreProductos();
	n1.setNombreProductos();

	PrecioProductos n1 = new PrecioProductos();
	n1.setPrecioProductos();
*/
/*
	n1.getNombreProductos();
	n1.getPrecioProductos();
*/

        do{
            
        Scanner recoge = new Scanner(System.in);
        System.out.println("Agregar un producto [1]\t| Ver lista[2]\t|Borrar elemento[3]\t|Salir[0]");

        respuesta=recoge.nextLine();
        if(respuesta.equalsIgnoreCase("1")){
        	//int i=0;
        	
        	Atiende p1 = new Atiende();
        	p1.atiende2();
        	/*ArrayList<String> aL1 = new ArrayList<String>();
        	Scanner sc1 = new Scanner(System.in);
        	

        	aL1 .add(sc1.nextLine());
        	
        	*/
        	//i++;

        }else if(respuesta.equalsIgnoreCase("2")){
        	System.out.println("Lista:");


			/*Iterator it = aL1.iterator(); 
			while ( it.hasNext() ) { 
			Object objeto = it.next(); 
			Producto producto = (Producto)objeto; 
			System.out.println(producto); 
} */

        }else if(respuesta.equalsIgnoreCase("3")){
        	System.out.println("Borrar:");
        }
    	
        
        
    
            
        }while(!respuesta.equalsIgnoreCase("0"));



/*      ///
        Lista l1 = new Lista();
		l1.verlista();  
		*/




	}
}

