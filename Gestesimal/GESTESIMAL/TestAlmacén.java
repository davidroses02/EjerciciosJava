package GESTESIMAL;

public class TestAlmacén {

  public static void main(String[] args) {
    
    Articulo RonBarcelo = new Articulo("RonBarceló", 20.00, 25.00, 5, 12, 80);
    
    System.out.println(RonBarcelo);
    
    Articulo Pepsi = new Articulo("Pepsi", 5.20, 6.00, 5, 25, 80);
    
    System.out.println(Pepsi);
    
    /**
     * Recogemos la excepción de las unidades
     */
    try {
      
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }

    Pepsi.prueba();
    
    
  }
}
