package fraccion;

import java.util.Scanner;

public class pruebaFraccion {

  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);
    
    /// OBJETOS /// /// Paso 1 ///
    
    // Objeto Uno // 
    fraccion fraccionUno = new fraccion(8, 2);
    
    // Objeto Dos //
    fraccion fraccionDos = new fraccion(10, 2);
    
    //-----------------------------------------//
    
    /// Paso 2 ///
    
    System.out.println("M�todo 2. Obtener la fracci�n como cadena de caracteres. ");
    
    System.out.println("Fracci�n1 -> " + fraccionUno);
    System.out.println("Fracci�n2 -> " + fraccionDos + "\n");
    
    /// Paso 3 ///
    
    System.out.println("M�todo 3. Obtener y modificar numerador y denominador.");
    
    fraccionUno.modificarNumerador(80);
    System.out.println( "Modificamos el Numerador de fraccionUno: " + fraccionUno);
    
    fraccionUno.modificarDenominador(8);
    System.out.println( "Modificamos el Denominador de fraccionUno: " + fraccionUno + "\n");
    
    /// Paso 4 ///
    
    System.out.println("M�todo 4. Obtener resultado de la fracci�n (n�mero real).");
    
    System.out.println("Realizamos la divisi�n de la fraccionDos: " + fraccionDos.division());
    System.out.println("Realizamos la divisi�n de la fraccionUno: " + fraccionUno.division() + "\n");
   
    /// Paso 5 ///
    
    System.out.println("M�todo 5. Multiplicar la fracci�n "
        + "por un n�mero (el resultado es otro objeto fracci�n).");
    
    fraccionDos.multiplicacion(8);
    System.out.println(fraccionDos + "\n");
    
    /// Paso 6 ///
    
    System.out.println("M�todo 6. Multiplicar, sumar y restar fracciones");
    System.out.println(fraccionUno.multiplica(5, 5));
    
    System.out.println(fraccionUno.suma(5, 5));
    
    System.out.println(fraccionUno.resta(5, 5));
    

    
  }
}
