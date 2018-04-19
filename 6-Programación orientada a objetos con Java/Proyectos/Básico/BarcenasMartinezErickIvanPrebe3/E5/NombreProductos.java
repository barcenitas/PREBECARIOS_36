import java.util.ArrayList;
import java.util.Scanner;

public class Productos{

String nProducto;

public void Productos(){
}

public void setProductos(String nProducto, int pProducto){

	this.nProducto=nProducto;
	this.pProducto = pProducto;
}


public String getProductos(){

	return nProducto;
}

public String toString(){ 
return ("Nombre: "+nombre+" Cantidad: "+cantidad); 
} 


}

