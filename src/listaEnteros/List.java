package listaEnteros;

/**
 * Esta clase implementará una estructura de datos tipo lista de números enteros.
 * 
 * Estado de los objetos:
 * 
 * - content: array de enteros donde guardaremos los elementos de la lista.
 * - size: número de elementos guardados en la lista.
 * 
 * Comportamiento:
 * 
 * - ListInteger(): crea una lista vacía cuyo tamaño máximo va a estar determinado por una constante 
 *  de la clase (10).
 *  
 * - ListInteger(ele1, ..., eleN): crea una lista con los elementos ele1 ... eleN.
 * 
 * - pop(): me devuelve el último elemento de la lista y lo saca de la lista.
 * 
 * - pop(posición): me devuelve el elemento que está en "posición" y lo saca de la lista.- 
 * 
 * - remove(elemento): borra la primera ocurrencia de "elemento" en la lista. Devolverá true o false
 *  en función del éxito de la operación.
 * 
 * - insert(elemento): añadir "elemento" al final de la lista. 
 *  Devolveremos true o false en función del éxito de la operación.
 * 
 * - insert(elemento, posición): añadir "elemento" en la posición "posición" de la lista.
 *  Devolveremos true o false en función del éxito de la operación.
 * 
 * - clear(): vacía la lista.
 * 
 * - isFull(): me dice si la lista está llena.
 * 
 * - isEmpty(): me dice si la lista está vacía.
 * 
 * - resize(): cambia el tamaño máximo de la lista si el nuevo tamaño máximo no es menor que
 *  el número de elementos que tiene. Devolveremos true o false en función del éxito de la operación. 
 *  
 * - size(): nos devuelve el número de elementos que hay en la lista.
 * 
 * - maxSize(): tamaño máximo de la lista.
 * 
 * 
 * @author Rafael del Castillo Gomariz
 *
 */

public class List{

  // variables de clase

  private static final int DEFAULT_SIZE = 10;

  // variables de instancia

  private int[] content;
  private int size;

  // Comportamiento

  // Constructores

  public List() {
    this.size = 0;
    this.content = new int[DEFAULT_SIZE];
  }

  public List(int ... content) {
    /*
     * Código para que:
     * 
     * 1. Comprobar si el número de parámetros que llegan es mayor que DEFAULT_SIZE, si lo es el tamaño
     * máximo de mi array aumenta a esta cantidad.
     * 
     * 2. Crear el nuevo array con el tamaño máximo y asignarle los elementos recibidos como parámetro.
     * 
     * 3. Poner el valor correcto de size.
     */

  }

  //resto métodos

  /**
   * Añade un elemento al final de la lista. 
   * 
   * @param element
   * @return éxito de la operación
   */
  public boolean insert(int element) {
    return false;
  }
  
  /**
   * Añade un elemento en la posición indicada de la lista.
   * @param element
   * @param pos
   * @return éxito de la operación
   */
  public boolean insert(int element, int pos) {
    return false;    
  }
  
 
  /**
   * Devuelve el último elemento de la lista y lo elimina.
   * @return último elemento de la lista
   */
  public int pop() {
    return 0;
  }
  
  /**
   * Borra la primera ocurrencia de un elemento en la lista.
   * 
   * @param element
   * @return éxito de la operación.
   */
  public boolean remove(int element) {
    return false;
  }
  
  /**
   * Vacía la lista.
   */
  public void clear() {
    
  }
  
  /**
   * 
   * @return si la lista está llena.
   */
  public boolean isFull() {
    return false;
  }
  
  /**
   * 
   * @return devuelve si la lista está vacía.
   */
  public boolean isEmpty() {
    return false;
  }
  
  /**
   * Cambia el tamaño máximo de la lista si el nuevo tamaño máximo no es menor que el número de elementos que tiene. 
   *  
   * @return éxito de la operación.
   */
  public boolean resize() {
    return false;
  }
  
  /**
   * 
   * @return número de elementos que hay en la lista.
   */
  public int size() {
    return 0;
  }
  
  /**
   * 
   * @return máximo número de elementos que caben en la lista.
   */
  public int maxSize() {
    return 0;
  }

}