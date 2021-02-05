package Rectangulo;

public class PruebaCuadrado {

  public static void main(String[] args) {
    
    // Objetos //
    
    Rectangulo a = new Cuadrado(5, 5);
    Rectangulo b = new Cuadrado(6, 6);

    
    System.out.println("Hallamos el perimetro del cuadrado 'a' -> " + a + " = " + a.Perimetro());
    
    System.out.println("Hallamos el area de del cuadrado 'a' -> " + a + " = " + a.area());
    
    System.out.println("Imprimimos el cuadrado 'a'. " + a);
    a.Imprimir();
    
    System.out.println("Imprimimos el cuadrado 'b'. " + b);
    b.Imprimir();
    
    System.out.println("Comparamos a -> " + a + " con b -> " + b + " = " + a.compareTo(b));

    
    
    
  }

}
