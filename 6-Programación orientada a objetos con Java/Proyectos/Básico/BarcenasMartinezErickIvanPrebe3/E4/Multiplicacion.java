import java.util.Scanner;
 public class Multiplicacion {


        int respuesta1;
    int respuesta2;
    int i, j;

    Scanner sc0 = new Scanner(System.in);

    public void multiplicaYa(){



  System.out.print("\nIngresa el tamanho de la matriz: ");

    respuesta1 = Integer.parseInt(sc0.nextLine());
    respuesta2 = respuesta1;

    int vector[][]  = new int[respuesta1][respuesta2];
    int vector2[][]  = new int[respuesta1][respuesta2];
    int vector3[][]  = new int[respuesta1][respuesta2];

         System.out.println("\nIngresa el valores de la matriz A[] :");
         for(i=0; i< (vector.length); i++){
            for(j=0; j< (vector.length); j++){
             System.out.print("\nIntroduzca el elemento [" + i + "," + j + "]: ");
                 vector[i][j] = sc0.nextInt();
                 
                }
                 
            }
            
            System.out.println("\nIngresa el valores de la matriz B[] :");
         for(i=0; i< (vector2.length); i++){
            for(j=0; j< (vector2.length); j++){
             System.out.print("\nIntroduzca el elemento [" + i + "," + j + "]: ");
                 vector2[i][j] = sc0.nextInt();
                 
                }
                  System.out.print("");
            }
               



            for (i=0; i<vector3.length; i++){
             for (j=0; j<vector3.length; j++){
                 vector3[i][j]= vector[i][j]*vector2[i][j];
                }
            }

        System.out.println("----------------------------\n");
        System.out.println("Multiplicacion de matrices:");
           //imprimirmos el vector
        for (i=0; i < vector3.length; i++) {
        System.out.print("|");
        for (j=0; j < vector3[i].length; j++) {
        //System.out.println ("[" + i + "," + j + "] = " + vector[i][j]);
        System.out.print(vector3[i][j]);
        if (j!=vector[i].length-1) System.out.print("\t");
      
        }
         System.out.print("|");
         System.out.println("");
                
            }
         System.out.println("");


}       
   } 



