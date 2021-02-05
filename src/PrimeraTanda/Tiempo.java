package PrimeraTanda;

public class Tiempo {
  
  // Atributos /////
  
  int horas, minutos, segundos;
  
  // Constructor /////
  
  Tiempo (int h, int m, int s) {     
    this.horas = h;
    this.minutos = m;
    this.segundos = s;
    this.comprobar();
  }
  
  /// getter ///
  
  int getHoras () {
    return this.horas;
  }
  
  int getMinutos () {
    return this.minutos;
  }
  
  int getSegundos () {
    return this.segundos;
  }
  
  /// Setter ///
  
  public void setHoras(int horas) {
    this.horas = horas;
    this.comprobar();
  }
  
  public void setMinutos(int minutos) {
    this.minutos = minutos;
    this.comprobar();
  }
  
  public void setSegundos(int segundos) {
    this.segundos = segundos;
    this.comprobar();
  }
  
  ///Método comprobar///
  
  /**
   * Comprueba y corrige el estado de los atributos del objeto.
   */
  private void comprobar() {
    
    if (minutos > 59) {
      int hor  = minutos / 60;
      horas += hor;
      minutos = minutos % 60;
    }
    
    if (segundos > 59) {
      int min  = segundos / 60;
      minutos += min;
      segundos = segundos % 60;
    }
    
    if (minutos < 1) {
      minutos = 0;
    }
    
    if (segundos < 1) {
      segundos = 0;
    }
  }
  
  ///Ejercicio 1///
  
  /**
   * Sumar y restar otro objeto de la clase Tiempo 
   * @return 
   */
  public Tiempo sumarObjeto(Tiempo intervalo) {
    return new Tiempo(this.horas + intervalo.horas, this.minutos + intervalo.minutos, 
        this.segundos + intervalo.segundos);
  }
  /**
   * 
   * RestaObjeto
   * @return
   */
  public Tiempo restaObjeto(Tiempo intervalo) {
    return new Tiempo(this.horas - intervalo.horas, this.minutos - intervalo.minutos, 
        this.segundos - intervalo.segundos);
  }
  
  ///Ejercicio 2///
  
  /**
   * Sumar Segundos
   * @param intervaloDos
   */
  public void sumarSegundos(int segundos) {
    this.segundos += segundos;
    this.comprobar();
  }
  
  /**
   * Restar Segundos
   * @param segundos
   */
  public void restarSegundos(int segundos) {
    this.segundos -= segundos;
    this.comprobar();
  }
  
  /**
   * Sumar minutos
   * @param Minutos
   */
  public void sumarMinutos(int minutos) {
    this.minutos += minutos;
    this.comprobar();
  }
  
  /**
   * Restar Minutos
   * @param minutos
   */
  public void restarMinutos(int minutos) {
    this.minutos -= minutos;
    this.comprobar();
  }
  
  /**
   * Sumar Horas
   * @param horas
   */
  public void sumarHoras(int horas) {
    this.horas += horas;
    this.comprobar();
  }
  
  /**
   * Restar Horas
   * @param horas
   */
  public void restarHoras(int horas) {
    this.horas -= horas;
    this.comprobar();
  }
  
  ///Ejercicio 3///
  
  /**
   * Metodo toString para sacar una salida formateada.
   * @return Salida formateada
   */
  @Override
  public String toString() {
    return this.horas + "h " + this.minutos + "m " + this.segundos + "s";
  }
}
