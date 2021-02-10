package ListaEnteros;

public class PruebaLista {

  public static void main(String[] args) {

    List lista = new List(1,2,3,4,5,6,7);
    
    System.out.println("Test clase -> Array base");
    
    System.out.println(lista);
    System.out.println("-------------");

    System.out.println("Insert con un parámetro: ");
    lista.insert(5);
    System.out.println(lista);
    System.out.println("-------------");

    System.out.println("Insert con dos parámetros: ");
    lista.insert(8,2);
    System.out.println(lista);
    System.out.println("-------------");

    System.out.println("Pop: ");
    System.out.println(lista.pop());
    System.out.println("-------------");

    System.out.println("Remove: ");
    System.out.println(lista.remove(2));
    System.out.println(lista);
    System.out.println("-------------");

    System.out.println("Borrar la lista: ");
    lista.clear();
    System.out.println(lista);
    System.out.println("-------------");
    
    System.out.println("¿La lista está vacia?");
    System.out.println(lista.isFull());
    
    
  }
}