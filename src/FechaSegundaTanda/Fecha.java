package FechaSegundaTanda;

  /**
   * 
   * @author david
   *
   *    3. Crea una clase Fecha. Los objetos de la clase Fecha son fechas de tiempo y se crean de la forma:
   *
   *    Fecha f = Fecha(1, 10, 2020);
   *
   *    donde los parámetros que se le pasan al constructor son el día, el mes y el año respectivamente. Si la fecha creada es incorrecta mostraremos un mensaje de error en la salida estándar de errores (lo ideal sería lanzar una excepción, ya lo haremos cuando se vea en clase).
   *
   *    Crea métodos para:
   *
   *    Saber si la fecha almacenada es correcta.
   *    Sumar y restar días a la fecha. 
   *    Comparar la fecha almacenada con otra, el método devolverá un valor negativo si la fecha almacenada es ANTERIOR a la otra, 0 si son IGUALES y un valor positivo si es POSTERIOR.
   *    Saber si el año de la fecha almacenada es bisiesto.
   *    El método toString() devuelve una cadena con el formato "<día del mes> de <nombre del mes> de <año>".
   *
   *
   *    Tanda dos : Modifica la clase Fracción y Fecha de la tanda de ejercicios anterior para que implementen equals() y las interfaces Comparable y Cloneable.
   *                Modifica la clase Fecha para que proporcione un método estático que reste dos fechas y nos devuelva el número de días comprendidos entre las dos.
   *
   *
   */

public class Fecha implements Comparable<Fecha>, Cloneable {

  /// Atributos ///

  private int año, mes, dia;

  /// Constructor ///

  Fecha(int dia, int mes, int año) {
    this.año = año;
    this.mes = mes;
    this.dia = dia;

    if (dia > 31 || dia <= 0) {
      System.err.println("El dia está mal introducido.");
    }

    if (mes > 12 || mes <= 0) {
      System.err.println("El dia está mal introducido.");
    }
  }

  /// Getters & Setters ///

  public int getAño() {
    return año;
  }

  public void setAño(int año) {
    this.año = año;
  }

  public int getMes() {
    return mes;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public int getDia() {
    return dia;
  }

  public void setDia(int dia) {
    this.dia = dia;
  }

  // Equals() and Hashcode 
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + año;
    result = prime * result + dia;
    result = prime * result + mes;
    return result;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Fecha other = (Fecha) obj;
    if (año != other.año)
      return false;
    if (dia != other.dia)
      return false;
    if (mes != other.mes)
      return false;
    return true;
  }
    
  /// Ejercicios ///

  // Es bisiesto? //

  public boolean esBisiesto() {
    if (((this.año % 4 == 0) && (this.año % 100 != 0)) || (this.año % 400 == 0)) {
      return true;
    } else {
      return false;
    }
  }

  // Ejercicio 1 - Suma //

  public void sumar(int dia) {

    this.año = getAño();

    this.dia = getDia() + dia;

    if (this.dia > 31 && (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7
        || this.mes == 8 || this.mes == 10)) {
      this.dia = this.dia % 31;
      this.mes += 1;
    } else if (this.dia > 30
        && (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
      this.dia = this.dia % 30;
      this.mes += 1;
    }

    if (this.dia > 29 && this.mes == 2 && esBisiesto()) {
      this.dia = this.dia % 29;
      this.mes += 1;
    } else {
      this.dia = this.dia % 28;
      this.mes += 1;
    }

    if (this.dia > 31 && this.mes == 12) {
      this.dia = this.dia % 31;
      this.mes += 1;
      this.año += 1;
    }

    // Ejercicio 1 - Resta //

  }

  public void restar(int dia) {

    this.año = getAño();

    this.dia = getDia() - dia;


    if (this.dia <= 0 && (this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7
        || this.mes == 8 || this.mes == 10 || this.mes == 12)) {
      this.mes -= 1;
      this.dia = 31 - Math.abs(this.dia);

    } else {
      if (this.dia <= 0 && (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
        this.mes -= 1;
        this.dia = 30 - Math.abs(this.dia);
      }
    }

    if (this.dia <= 0 && this.mes == 2 && esBisiesto()) {
      this.dia = 29 - Math.abs(this.dia);
      this.mes -= 1;
    } else {
      this.dia = 28 - Math.abs(this.dia);
      this.mes -= 1;
    }

    if (this.dia <= 0 && this.mes == 1) {
      this.dia = 30 - Math.abs(this.dia);
      this.mes -= 1;
      this.año -= 1;
    }

  }

  // Ejercicio 4 //

  /// Metodo ToString() ///
  @Override
  public String toString() {
    return getDia() + " del mes " + getMes() + " de " + getAño();
  }

  @Override
  public int compareTo(Fecha aux) {
    return (this.dia + (this.mes * 100) + (this.año * 10000)) - (aux.dia + (aux.mes * 100) + (aux.año * 10000));
  }
  
  // funcion cloneable //
  public Fecha clone() {
    Fecha clon = new Fecha(this.dia, this.mes, this.año);
    return clon;
  }
/**  
  public static int restarFechas(Fecha otra) {
    
      
    }
   */ 
    
    
  }
  
  
  
  
  

