public class Perro extends Aniamal {
    
    //Creamos nuestros atrinutos
        
    private String raza;
    private int edadP;
    private String ladra;

    //menciono todos los parametros
    public Perro(String raza, String nombre, int edadP, String alimento){
    //menciono los parametros de la clase padre sin su modo de acceso
        super(nombre, alimento);
        this.raza=raza;
        this.edadP=edadP;
    
    }
    

    public Perro(){

    }

    //retorno datos
    public int getEdadP(){
    return edadP;
    }
    
    public String getRaza(){
    return raza; 
    }
    //creo una fucnion que nos muestre todos los datos
    public void mostrar(){
    System.out.println(getRaza() + "-"+ getNombre() + "-" + getEdadP()+"-"+getAlimento());
    }
    


    //voy a sobreescribir
    @Override
    public void alimentarse(){
        System.out.println("Soy un perro y como chuletas");


    //Encapsulamiento

    }

       public void guau(){

        System.out.println("Guau");
    }
}
