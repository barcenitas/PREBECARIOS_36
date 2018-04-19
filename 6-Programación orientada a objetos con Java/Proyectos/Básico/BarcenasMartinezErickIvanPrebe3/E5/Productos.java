import java.util.ArrayList;
import java.util.Scanner;

public class Productos extends Atiende{

String nProducto;
double pProducto;

public void Productos(){
}

public void setProductos(String nProducto, double pProducto){

	this.nProducto=nProducto;
	this.pProducto = pProducto;
}




public String getProductos(){

	return ("Nombre: "+nProducto);
	//+" Cantidad: "+pProducto); 
}





}

