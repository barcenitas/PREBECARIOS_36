
public class OtraClase extends Auto{

//instanciar 3 objetos, y mandar a llamar a cada uno de los
//métodos realizados

/*
	Auto Auto3 = new Auto();
	Auto Auto4 = new Auto();
	Auto Auto5 = new Auto();

*/


//creamos nustro metodo constructor

	private int antigravedad;
	private int danho;

	public OtraClase(int antigravedad, int danho,String marca,String color, int modelo){
		super(marca, color, modelo);
	//metodo set

	this.antigravedad=antigravedad;
	this.danho=danho;

	}

	//metodo get

	public int getAntigravedad(){
		return antigravedad;

	}

	public int getdanho(){
		return danho;

	}


	public void mostrarPorcentajes(){

	System.out.println("\nAuto"+"\nMarca:"+getMarca()+"\tColor:"+getColor()+"\tModelo:"+getModelo()+"\tDanho:"+getdanho()+"\t\tAntigravedad:"+getAntigravedad());

	}



}