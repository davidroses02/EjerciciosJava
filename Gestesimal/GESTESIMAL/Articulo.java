package GESTESIMAL;

/**
  Clase Artículo que representa a los artículos del almacén.   
  Su estado será: código, descripción, precio de compra, precio de venta, número de unidades (nunca negativas), stock de seguridad y stock máximo.
  Como comportamiento: Consideramos que el código va a generarse de forma automática en el constructor, así no puede haber dos artículos con el mismo código. 
  Esto implica que no puede modificarse el código de un artículo, sí el resto de las propiedades. Podremos mostrar el artículo, por lo que necesito una 
  representación del artículo en forma de cadena (toString). 
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
     * Excepción. Las unidades cuando se crean los objetos deben ser positivas.
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

  // Métodos 
  

  
  
  
  
  
  
  
  
  
  
  
  
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
