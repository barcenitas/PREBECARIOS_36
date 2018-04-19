public abstract class Aniamal {
    

    //declaramos los atributos
    private String nombre;
    private String alimento;
    
    //Genero el metodo constructor del padre
     
    //abstract --->polimorfismo


        public  Aniamal(){

    }
    public  Aniamal(String nombre, String alimento){
    //solo colocamos los sets
    this.nombre = nombre;
    this.alimento= alimento;
    }

    public String getNombre(){
    return nombre;
    }
    
    public String getAlimento(){
    return alimento;
    }
    
    //creo otras funcines para POLIMORFISMO
    //abstract solo funciona para las clases hijas
    //no se puede declarar el metodo
    
	//solo defino el metodo
    public abstract void alimentarse();


    public  void moverse(){
    System.out.println("El gato se mueve");
    }
}
