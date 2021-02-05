 package Rectangulo;

public class Cuadrado extends Rectangulo{

  // Atributos //
  
  private int lado1, lado2;
  
  // Constructor //
  
  public Cuadrado(int lado1, int lado2) {
    super(lado1, lado2);
    
    this.lado1 = lado1;
    this.lado2 = lado2;
    
    if (lado1 != lado2) {
      System.err.println("Los lados del cuadrado deben de ser iguales");
    }
  }  

}
