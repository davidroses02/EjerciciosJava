package PrimeraTanda;

public class PruebaTiempo {

  public static void main(String[] args) {
    // Objeto Uno //
    Tiempo intervaloUno = new Tiempo(10, 90, 20);

    // Objeto Dos //
    Tiempo intervaloDos = new Tiempo(8, 4, 10);
    
    // Objeto Tres //
    Tiempo intervaloTres = new Tiempo(2, 58, 2);
    
    //--------------------------------------------//
    
    // Método 1 //
    
    System.out.println("Método 1: Sumar y restar");
    System.out.println("Suma de: " + intervaloUno + " + " + intervaloTres + " = " + intervaloUno.sumarObjeto(intervaloTres));
    System.out.println("Resta de: " + intervaloUno + " - " + intervaloTres + " = " + intervaloUno.restaObjeto(intervaloTres) + "\n");
    
    // Método 2 //
    
    System.out.println("Método 2: Sumar y restar, horas, minutos y segundos");
    
    System.out.println("- Sumamos 2 segundos a los segundos de intervaloUno ");
    intervaloUno.sumarSegundos(2); //Sumar Segundos// 
    System.out.print(intervaloUno + "\n");
    
    System.out.println("- Restamos 3 segundos a los segundos de intervaloUno: ");
    intervaloUno.restarSegundos(3);
    System.out.print(intervaloUno + "\n");
    
    /**
    intervaloUno.sumarMinutos(2);
    
    intervaloUno.restarMinutos(2);
    
    intervaloUno.sumarHoras(2);
    
    intervaloUno.restarHoras(2);
    */
    
    // Método 3 //
    System.out.println("Método 3: Cadena Tiempo");
    System.out.println(intervaloUno);
  }
}
