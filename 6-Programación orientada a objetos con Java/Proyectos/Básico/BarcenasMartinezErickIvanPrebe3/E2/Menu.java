import java.util.Scanner;

public class Menu{
	int opcion;

	double radio2f, radio3, lado4, lado5;

	public void Menu(){
		//System.out.println("Se creo objeto");
	}

	public void seleccionarMenu(){
		

		//do{

		System.out.println("\nElige una opcion:");
		System.out.println("Circulo: Area     (1)\t| Cuadrado: Area     (2)");
		System.out.println("Circulo: Perimetro(2)\t| Cuadrado: Perimetro(4)\n");
		Scanner recibeRespuesta = new Scanner(System.in);
		opcion = recibeRespuesta.nextInt();

		switch (opcion){

			case 1: 
				System.out.println("Circulo: Area ");
				Circulo c1 = new Circulo();
				Scanner pedirDatos1 = new Scanner(System.in);
				System.out.println("Ingresa radio: ");
				radio2 =Double.parseDouble(pedirDatos1.nextLine());
				Circulo cv = new Circulo();
				cv.setRadioCirculo(radio2);
				System.out.println("El area es: \t"+cv.areaCirculo());

				break;
			case 2: 
				System.out.println("Circulo: Perimetro ");
				Circulo c2 = new Circulo();
				Scanner pedirDatos2 = new Scanner(System.in);
				System.out.println("Ingresa radio: ");
				radio3 =Double.parseDouble(pedirDatos2.nextLine());
				Circulo cv2 = new Circulo();
				cv2.setRadioCirculo(radio3);
				System.out.println("El perimetro es: \t"+cv2.perimetroCirculo());

				break;

			case 3: 
	
				System.out.println("Cuadrado: Area ");
				Cuadrado c3 = new Cuadrado();
				Scanner pedirDatos3 = new Scanner(System.in);
				System.out.println("Ingresa lado: ");
				lado4 =Double.parseDouble(pedirDatos3.nextLine());
				Cuadrado cv3 = new Cuadrado();
				cv3.setLadoCuadrado(lado4);
				System.out.println("El area es: \t"+cv3.areaCuadrado());

				break;
			case 4: 
				System.out.println("Cuadrado: Perimetro ");
				Cuadrado c4 = new Cuadrado();
				Scanner pedirDatos4 = new Scanner(System.in);
				System.out.println("Ingresa lado: ");
				lado5 =Double.parseDouble(pedirDatos4.nextLine());
				Cuadrado cv4 = new Cuadrado();
				cv4.setLadoCuadrado(lado5);
				System.out.println("El perimetro es: \t"+cv4.perimetroCuadrado());
				break;

			default:
				System.out.println("Ingresa un numero entero");
				break;
		//}while(opcion!=5);
			
		}
	}
}