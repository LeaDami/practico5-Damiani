
package practico5;

import java.util.Scanner;


public class Arreglo {
    public static void sumarLista(){
        int suma = 0;
 Scanner ent = new Scanner(System.in);   
        
        int [] numero = new int[5];
         for(int i = 0; i < 5; i++) {
              System.out.println("Ingresa el "+i+" numero:");
              numero[i] = ent.nextInt();
             suma += numero[i];
           }
          System.out.println("La suma total es: "+suma); 
    
          double promedio;
            promedio = suma / numero.length;
            System.out.println("El promedio es: "+promedio);
         }
   
    
    public static void  buscarMayor() {
        int [][] mat = {{5,3,2,1,7}, {3,4,6}, {9,1,4,3}};
        int numeroMayor;
        int i,j;
        numeroMayor = mat [0][0];
        for (i=0; i< mat.length; i++){
            for(j=0; j< mat.length;j++)
                
                if (mat[i][j] > numeroMayor) {
				numeroMayor = mat[i][j];
			}
        }
        System.out.println("El mayor es: " + numeroMayor);
        
        }
    
  
    public static void  cuentaVocales() {
      Scanner entrada = new Scanner(System.in);
       
       String frase;
       int contador = 0;
       
       System.out.println("Escribir una palabra: ");
		frase = entrada.nextLine();
       
       
       for(int x=0;x<frase.length();x++) {
 if ((frase.charAt(x)=='a') || (frase.charAt(x)=='e') || (frase.charAt(x)=='i') || (frase.charAt(x)=='o') || (frase.charAt(x)=='u')){ 
    contador++;
  }
}
       
       System.out.println("La palabra " + frase + " contiene " + contador + " vocales");
   }

    
    public static void cuentaCaracter(){
     Scanner entrada = new Scanner(System.in);
        String frase;
     int contador = 0;
     System.out.println("Escribir una frase: ");
		frase = entrada.nextLine();
      for (int x=0; x<frase.length(); x++) {
          if (frase.charAt(x)=='b'){
              contador++;
          }
          
      }
       System.out.println("La frase " + frase + " contiene  " + contador +  " veces  el caracter b");
 }
 
}


    
    

