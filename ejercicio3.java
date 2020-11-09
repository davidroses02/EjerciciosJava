/*
Fecha: 8/11/2020
Autor: David Rosas Alcaraz

Enunciado: Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0 ).


Algoritmo:
    1. Pedir los datos. 
    2. Resolver la ecuación.

Variables: a, b, result

*/

public class ejercicio3 {
  public static void main(String[] args) {
    System.out.println("Introduce los siguientes valores:");
    
    System.out.println("Dame el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());

    System.out.println("Dame el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());

    double result;
    
    if (a != 0) {
      result = b / a;
      System.out.println("x = " + result);
    } else {
      System.out.println("Esta ecuación no tiene solución real.");
    }
  }
}


