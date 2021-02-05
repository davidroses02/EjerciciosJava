package Rectangulo;

public class Rectangulo implements Comparable<Rectangulo>{

  // Atributos // 
  private int base;
  private int altura;
  
  // Constructor //

  public Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;

    if (base <= 0 || altura <= 0) {
      System.err.println("Error al introducir los valores de instancia.");

    
    
    
    }
  }
   
  // Getters and Setters //  
   
    public int getBase() {
      return base;
    }
    
    public void setBase(int base) {
      this.base = base;
    }
    
    public int getAltura() {
      return altura;
    }
    
    public void setAltura(int altura) {
      this.altura = altura;
    }
    
  // Métodos //
  
  // Ejercicio 1 //
  
   public int Perimetro() {
     return this.base*2 + this.altura*2;
   }
  
  // Ejercicio 2 //
  
  public int area() {
    return this.base*this.altura;
  }
  
  // Ejercicio 3 //
  
  public void Imprimir() {
    System.out.println("*".repeat(base));
    for (int i = 0; i < this.altura; i++) {
      System.out.println("*" + " ".repeat(base-2) + "*");
    }
    System.out.println("*".repeat(base));
  }
  
  // Ejercicio 4 -> compareTo() //
  
  @Override
  public int compareTo(Rectangulo arg) {
    return this.area() - arg.area();
  }

  /**
  // Ejercicio 5 -> cloneable //
  public void cloneable(Rectangulo arg) {
    
  }
  */
  
  
  
  // ToString //
  @Override
  public String toString() {
    return "[base=" + base + ", altura=" + altura + "]";
  }
  
  
































  }
