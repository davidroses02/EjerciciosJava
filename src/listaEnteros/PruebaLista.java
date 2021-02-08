package listaEnteros;

public class PruebaLista {

  public static void main(String[] args) {

    List lista = new List(1,2,3,4,5,6,7);
    
    System.out.println("Test clase");
    
    System.out.println(lista);
    
    System.out.println("lalal");
    
    lista.insert(5);
    System.out.println(lista);
    
    lista.insert(8,2);
    System.out.println(lista);
  }

}
