package FechaSegundaTanda;

  /**
   * 
   * @author david
   *
   *    3. Crea una clase Fecha. Los objetos de la clase Fecha son fechas de tiempo y se crean de la forma:
   *
   *    Fecha f = Fecha(1, 10, 2020);
   *
   *    donde los par�metros que se le pasan al constructor son el d�a, el mes y el a�o respectivamente. Si la fecha creada es incorrecta mostraremos un mensaje de error en la salida est�ndar de errores (lo ideal ser�a lanzar una excepci�n, ya lo haremos cuando se vea en clase).
   *
   *    Crea m�todos para:
   *
   *    Saber si la fecha almacenada es correcta.
   *    Sumar y restar d�as a la fecha. 
   *    Comparar la fecha almacenada con otra, el m�todo devolver� un valor negativo si la fecha almacenada es ANTERIOR a la otra, 0 si son IGUALES y un valor positivo si es POSTERIOR.
   *    Saber si el a�o de la fecha almacenada es bisiesto.
   *    El m�todo toString() devuelve una cadena con el formato "<d�a del mes> de <nombre del mes> de <a�o>".
   *
   *
   *    Tanda dos : Modifica la clase Fracci�n y Fecha de la tanda de ejercicios anterior para que implementen equals() y las interfaces Comparable y Cloneable.
   *                Modifica la clase Fecha para que proporcione un m�todo est�tico que reste dos fechas y nos devuelva el n�mero de d�as comprendidos entre las dos.
   *
   *
   */

public class Fecha implements Comparable<Fecha>, Cloneable {

  /// Atributos ///

  private int a�o, mes, dia;

  /// Constructor ///

  Fecha(int dia, int mes, int a�o) {
    this.a�o = a�o;
    this.mes = mes;
    this.dia = dia;

    if (dia > 31 || dia <= 0) {
      System.err.println("El dia est� mal introducido.");
    }

    if (mes > 12 || mes <= 0) {
      System.err.println("El dia est� mal introducido.");
    }
  }

  /// Getters & Setters ///

  public int getA�o() {
    return a�o;
  }

  public void setA�o(int a�o) {
    this.a�o = a�o;
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
    result = prime * result + a�o;
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
    if (a�o != other.a�o)
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
    if (((this.a�o % 4 == 0) && (this.a�o % 100 != 0)) || (this.a�o % 400 == 0)) {
      return true;
    } else {
      return false;
    }
  }

  // Ejercicio 1 - Suma //

  public void sumar(int dia) {

    this.a�o = getA�o();

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
      this.a�o += 1;
    }

    // Ejercicio 1 - Resta //

  }

  public void restar(int dia) {

    this.a�o = getA�o();

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
      this.a�o -= 1;
    }

  }

  // Ejercicio 4 //

  /// Metodo ToString() ///
  @Override
  public String toString() {
    return getDia() + " del mes " + getMes() + " de " + getA�o();
  }

  @Override
  public int compareTo(Fecha aux) {
    return (this.dia + (this.mes * 100) + (this.a�o * 10000)) - (aux.dia + (aux.mes * 100) + (aux.a�o * 10000));
  }
  
  // funcion cloneable //
  public Fecha clone() {
    Fecha clon = new Fecha(this.dia, this.mes, this.a�o);
    return clon;
  }
/**  
  public static int restarFechas(Fecha otra) {
    
      
    }
   */ 
    
    
  }
  
  
  
  
  

