
import java.util.*;

/*
Fecha: 8/11/2020
Autor: David Rosas Alcaraz

Enunciado: Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax 2 + bx + c = 0 ).


Algoritmo:
    1.  Pedir los datos
    2.  Hacer los calculos 
    3.  Imprimir el reultado

Variables: a, b, c y s(Scanner)

*/

public class ejercicio5 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Ingresa los valores -> a, b y c. (En ese orden).");
    
    double a = s.nextInt();
    double b = s.nextInt();
    double c = s.nextInt();

    if ((a == 0) || (b == 0) || (c == 0)) {
      System.out.println("ERROR. Los valores que tienes que introducir, son mayores que 0.");
    } else {
    double x = (-b + Math.sqrt((Math.pow(b, 2)) * 4 * a * c)) / (2 * a);
    System.out.println("x = " + x);
    }


  }
}

