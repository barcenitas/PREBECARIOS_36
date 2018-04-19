/*9.- Realiza un programa que haga un claro ejemplo de Polimorfismo, estas clases pueden ser de tu
elección. Recuerda que polimorfismo no necesariamente es hacer una interfaz o hacer una clase
abstracta.
*/


public class MainE9{

	public static void main(String[] args){


		Robot r1 = new Darwin();
		Robot r2 = new Sophia();

		r1.habla();
		r2.habla();
	}

}