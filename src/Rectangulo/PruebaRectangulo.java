package Rectangulo;

public class PruebaRectangulo {

  public static void main(String[] args) {
    
    // Objetos //
    
    Rectangulo x = new Rectangulo(9, 5);
    Rectangulo y = new Rectangulo(6, 7);
    
    // Prueba Test //
    
    System.out.println("Hallamos el perimetro de x -> " + x + " = " + x.Perimetro());
    
    System.out.println("Hallamos el area de x -> " + x + " = " + x.area());
    
    System.out.println("Imprimimos el rectángulo.");
    x.Imprimir();
    
    System.out.println("Comparamos x -> " + x + " con y -> " + y + " = " + x.compareTo(y) );
    
    
    
  }

}
