package GESTESIMAL;

import java.util.ArrayList;

public class Almac�n extends Articulo {
  
  // Constructor ????
  
  public Almac�n(String description, double priceBuy, double priceSale, int numUnits,
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
  
  // M�todos 

  public void prueba() {
    this.articulo.clear();
  }
  
}
