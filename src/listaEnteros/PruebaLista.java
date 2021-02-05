package listaEnteros;

import java.util.Scanner;

public class PruebaLista {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    // Valores que se deben introducir //
    
    int numIntroducido = 0;
    
    // Crearemos una lista de enteros || Definimos el array //    
    
    ListaEnteros[] lista = new ListaEnteros[5];
    
    System.out.println("A continuación deberás introducir número por número el contenido del array. ");
    
    for (int i = 0; i<5; i++) {
      
      lista[i] = new ListaEnteros();
      
      System.out.println("Introduce el entero número: " + i);
      
      numIntroducido = s.nextInt();
      
      (lista[i]).setNum(numIntroducido);
      
    }
    
    System.out.println("--------------");
    
    for (int i = 0; i < 5; i++) {
      System.out.println("Posición del array: " + i);
      System.out.println("Número que introduciste: " + lista[i].getNum() + "\n");
    }
    
    
  }

}
