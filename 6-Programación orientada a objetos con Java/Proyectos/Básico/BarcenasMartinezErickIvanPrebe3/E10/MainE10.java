
public class MainE10{

public static void main(String[] args) {

	//creo una nueva instancia
	//polimorfismo
	Aniamal a1 = new Perro("Pastor","Canelo",3,"Buffet");
	a1.alimentarse();

	Aniamal b1 = new Gato();
	b1.alimentarse();

	//encapsulamiento
	Perro Perro1 = new Perro();
	Perro1.guau();
	//metodo
	b1.moverse();



    }
}