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
    
    // M�todo 1 //
    
    System.out.println("M�todo 1: Sumar y restar");
    System.out.println("Suma de: " + intervaloUno + " + " + intervaloTres + " = " + intervaloUno.sumarObjeto(intervaloTres));
    System.out.println("Resta de: " + intervaloUno + " - " + intervaloTres + " = " + intervaloUno.restaObjeto(intervaloTres) + "\n");
    
    // M�todo 2 //
    
    System.out.println("M�todo 2: Sumar y restar, horas, minutos y segundos");
    
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
    
    // M�todo 3 //
    System.out.println("M�todo 3: Cadena Tiempo");
    System.out.println(intervaloUno);
  }
}
