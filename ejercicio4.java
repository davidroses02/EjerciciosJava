/*
Fecha: 8/11/2020
Autor: David Rosas Alcaraz

Enunciado: Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).


Algoritmo:
    1.  Pedir la nota al usuario
    2.  Crear los rangos necesarios--insuficiente-suficiente, etc
    3. Imprimir el resultado

Variables: note

*/

public class ejercicio4 {
  public static void main(String[] args) {
    System.out.println("Dime una nota del 1 al 10. Y te diré tu calificación.");
    double note = Double.parseDouble(System.console().readLine());

    if (note <= 10) {

      if ((note >= 0) && (note <= 4)) {
        System.out.println("Un " + note + " es un insuficiente."); 
      }

      if (note == 5) {
        System.out.println("Un " + note + " es un suficiente."); 
      }

      if (note == 6) {
        System.out.println("Un " + note + " es un bien."); 
      }

      if ((note == 7) || (note == 8)) {
        System.out.println("Un " + note + " es un notable.");     
      }

      if ((note == 9) || (note == 10)) {
        System.out.println("Un " + note + " es un sobresaliente.");    
      }
    
    } else {
      System.out.println("ERROR, tienes que introducir una nota del 0 al 10");
    }
  }
}

