package FechaSegundaTanda;

public class PruebaFecha {

  public static void main(String[] args) {
    
    // Objetos //
    
    Fecha fechaUno = new Fecha(2, 5, 2002);
    Fecha fechaDos = new Fecha(2, 5, 2002);
    
    /// EJERCICIOS /// 
    
    
    // Ejercicio 3 //
  
    System.out.println("Compara la fecha almacenada con otra. ");
    System.out.println("Comparo: " + fechaUno + " con: " + fechaDos + 
        " el resultado es: " + fechaUno.compareTo(fechaDos) + "\n");
    
    // Ejercicio 4 //
  
    System.out.println("Dice si la fecha pertenece a un año bisiesto: " + fechaUno.esBisiesto());

  }
}
