/*
Fecha: 8/11/2020
Autor: David Rosas Alcaraz

Enunciado: Escribe un programa en que dado un número del 1 a 7 escriba el correspon-
diente nombre del día de la semana.


Algoritmo:
    1. Pedimos el numero de la semana
    2. Cada numero del 1 al 7 corresponde a un dia de la semana
    3. Hacemos los calculos
    4. Imprimimos los resultados

Variables: week, num 

*/

public class ejercicio2 {
  public static void main(String[] args) {
    System.out.println("### INTRODUCE UN NUMERO DEL 1 AL 7, TE DIRÉ EÑ DIA DE LA SEMANA CORRESPONDIENTE ###");

    String week;
    int num = Integer.parseInt(System.console().readLine());

    switch (num) {
      case 1:
        week = "Lunes";
        break;
      case 2:
        week = "Martes";
        break;
      case 3:
        week = "Miercoles";
        break;
      case 4:
        week = "Jueves";
        break;
      case 5:
        week = "Viernes";
        break;
      case 6:
        week = "Sabado";
        break;
      case 7:
        week = "Domingo";
      default:
        week = "Ese dia de la semana no existe";
      }
    
    System.out.println("El numero del dia: " + num + ". Y tu dia de la semana: " + week);
    }
  }
