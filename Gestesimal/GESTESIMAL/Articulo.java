package GESTESIMAL;

/**
  Clase Art�culo que representa a los art�culos del almac�n.   
  Su estado ser�: c�digo, descripci�n, precio de compra, precio de venta, n�mero de unidades (nunca negativas), stock de seguridad y stock m�ximo.
  Como comportamiento: Consideramos que el c�digo va a generarse de forma autom�tica en el constructor, as� no puede haber dos art�culos con el mismo c�digo. 
  Esto implica que no puede modificarse el c�digo de un art�culo, s� el resto de las propiedades. Podremos mostrar el art�culo, por lo que necesito una 
  representaci�n del art�culo en forma de cadena (toString). 
*/

/**
 * 
 * @author david
 *
 */

public class Articulo {
  
  // Atributos
  
  private int code = 0;
  private static int lastCode;
  private String description;
  private double priceBuy; 
  private double priceSale;
  private int numUnits;
  private int stockSecurity;
  private int stockMax;

  // Constructor
  
  public Articulo(String description, double priceBuy, double priceSale, int numUnits,
      int stockSecurity, int stockMax) {
    
    code = ++lastCode;
    
    this.description = description;
    this.priceBuy = priceBuy;
    this.priceSale = priceSale;
    this.numUnits = numUnits;
    
    /**
     * Excepci�n. Las unidades cuando se crean los objetos deben ser positivas.
     */
    if (this.numUnits < 0) {
        throw new RuntimeException("Las unidades de " + getDescription() + " deben ser positivas");
    }
    
    this.stockSecurity = stockSecurity;
    this.stockMax = stockMax;
    
  }

  // Getters and Setters
  
  public int getCode() {
    return code;
  }
  /**
  public void setCode(int code) {
    this.code = code;
  }
  */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPriceBuy() {
    return priceBuy;
  }

  public void setPriceBuy(double priceBuy) {
    this.priceBuy = priceBuy;
  }

  public double getPriceSale() {
    return priceSale;
  }

  public void setPriceSale(double priceSale) {
    this.priceSale = priceSale;
  }

  public int getNumUnits() {
    return numUnits;
  }

  public void setNumUnits(int numUnits) {
    this.numUnits = numUnits;
  }

  public int getStockSecurity() {
    return stockSecurity;
  }

  public void setStockSecurity(int stockSecurity) {
    this.stockSecurity = stockSecurity;
  }

  public int getStockMax() {
    return stockMax;
  }

  public void setStockMax(int stockMax) {
    this.stockMax = stockMax;
  }

  // M�todos 
  

  
  
  
  
  
  
  
  
  
  
  
  
  /**
   * -> ToString()
   */
  @Override
  public String toString() {
    return "Articulo [code=" + code + ", description=" + description + ", priceBuy=" + priceBuy
        + ", priceSale=" + priceSale + ", numUnits=" + numUnits + ", stockSecurity=" + stockSecurity
        + ", stockMax=" + stockMax + "]";
  }

 
}
