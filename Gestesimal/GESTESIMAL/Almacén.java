package GESTESIMAL;

import java.util.ArrayList;

public class Almacén extends Articulo {
  
  // Constructor ????
  
  public Almacén(String description, double priceBuy, double priceSale, int numUnits,
      int stockSecurity, int stockMax) {
    super(description, priceBuy, priceSale, numUnits, stockSecurity, stockMax);
  }
  
  // ArrayList  

  private ArrayList<Articulo> articulo = new ArrayList<Articulo>();
 
  // Getters and Setters

  public ArrayList<Articulo> getArticulo() {
    return articulo;
  }

  public void setArticulo(ArrayList<Articulo> articulo) {
    this.articulo = articulo;
  }
  
  // Métodos 

  public void prueba() {
    this.articulo.clear();
  }
  
}
