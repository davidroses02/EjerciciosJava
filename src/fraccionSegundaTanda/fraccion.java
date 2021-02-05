package fraccionSegundaTanda;






public class fraccion implements Comparable<fraccion> {

  // Atributos ////
  
  double numerador, denominador;
  
  // Constructor ////
  
  fraccion (double numerador, double denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
    /** Comprueba los valores positivos? */
  }

  /// Getter & Setters ///
  
  public double getNumerador() {
    return this.numerador;
  }

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public double getDenominador() {
    return this.denominador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }
 
  /// -- Método Comprobar ? -- ///
  
  /// Ejercicio 2 ///
  
  @Override
  public String toString() {
    return "[numerador=" + ( "" + numerador) + ", denominador=" + ( "" + denominador) + "]"; 
  }
  
  
  // compareTo() //
  public int compareTo(fraccion arg0) {
     return (int) (this.numerador*arg0.denominador - arg0.numerador*this.denominador);
  };
  
  // Cloneable //
  
  public fraccion clone() {
    fraccion clon = new fraccion(this.numerador, this.denominador);
    return clon;
  }
   
  /// Ejercicio 3 ///
  
  public double modificarNumerador(double cambio) {
    this.numerador = cambio;
    return this.numerador + this.denominador; 
  }
  
  public double modificarDenominador(double cambio) {
    this.denominador = cambio;
    return this.numerador + this.denominador; 
  }
  
  /// Ejercicio 4 /// 
  
  public int division() {
    return (int) this.numerador / (int) this.denominador; 
  }
  
  /// Ejercicio 5 ///
  
  public void multiplicacion(double num) {
    fraccion aux = new fraccion(num, this.denominador);
    this.numerador = aux.numerador * this.numerador;
  }
  
  /// Ejercicio 6 ///
  
  public fraccion multiplica(double num, double denom) {
    return new fraccion (this.numerador * num, this.denominador * denom);
  }
  
  public fraccion suma(double num, double denom) {
    return new fraccion (this.numerador + num, this.denominador + denom);
  }
  
  public fraccion resta(double num, double denom) {
    return new fraccion (this.numerador - num, this.denominador - denom);
  }


 
    
  





}
