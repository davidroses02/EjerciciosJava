package Fecha;

public class Fecha implements Comparable<Fecha> {

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

  public void suma(int dia) {

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

  public void resta(int dia) {

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
  

}
