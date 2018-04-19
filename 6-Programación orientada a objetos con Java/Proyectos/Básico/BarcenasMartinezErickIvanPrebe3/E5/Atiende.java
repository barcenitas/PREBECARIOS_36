import java.util.ArrayList;
import java.util.Scanner;
public class Atiende{

private String nProducto;
private double pProducto;


//double pProducto;

public void Atiende(){
}


public void setProductos(String nProducto, double pProducto){

	this.nProducto=nProducto;
	this.pProducto = pProducto;
}

public String getProductos(){

	return ("Nombre: "+nProducto+" Cantidad: "+pProducto); 
}


public void atiende2(){

			Productos nP = new Productos();
        	Scanner sc1 = new Scanner(System.in);
        	Scanner sc2 = new Scanner(System.in);
        	System.out.print("Nombre del producto: ");
        	String nP1 = sc1.nextLine();
        	
        	System.out.print("\nPrecio del producto: \n");

        	double pP1= Double.parseDouble(sc1.nextLine());
        	
        	nP.setProductos(nP1,pP1);

}


public void muestra(){

        	ArrayList<String> aL1 = new ArrayList<String>();
        	Scanner sc1 = new Scanner(System.in);
        	

        	aL1.add(sc1.nextLine());
}


}
	