/*
Fecha: 8/11/2020
Autor: David Rosas Alcaraz

Enunciado: Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado.


Algoritmo:
    1. Pedimos la hora por teclado
    2. Creamos el algoritmo en código.
    3. Imprimimos el resultado.

Variables: time 

*/
public class ejercicio1 {
  public static void main(String[] args) {
    System.out.println("Dime una hora entre las 6 y las 5 de la madrugada.");;    
    int time = Integer.parseInt(System.console().readLine());
 
    if ((time >= 25) || (time >= -1)) {
      if ((time >= 0) && (time <= 5)) {
        System.out.println("Buena noches");    
      }
      
      if ((time >= 6) && (time <= 12)) {
        System.out.println("Buenos dias.");
      } 
      
      if ((time >= 13) && (time <= 20)) {
        System.out.println("Buenas tardes.");
      } 
      
      if ((time>= 21) && (time <= 24)) {
        System.out.println("Buenas noches.");
      }
    } else {
      System.out.println("ERROR, no se admiten números mayores a 24 o menores a 0.");
    }
  }
}