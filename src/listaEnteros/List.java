package ListaEnteros;

import java.util.Arrays;

/**
 * Esta clase implementarÃ¡ una estructura de datos tipo lista de nÃºmeros enteros.
 * 
 * Estado de los objetos:
 * 
 * - content: array de enteros donde guardaremos los elementos de la lista.
 * - size: nÃºmero de elementos guardados en la lista.
 * 
 * Comportamiento:
 * 
 * - ListInteger(): crea una lista vacÃ­a cuyo tamaÃ±o mÃ¡ximo va a estar determinado por una constante 
 *  de la clase (10).
 *  
 * - ListInteger(ele1, ..., eleN): crea una lista con los elementos ele1 ... eleN.
 * 
 * - pop(): me devuelve el Ãºltimo elemento de la lista y lo saca de la lista.
 * 
 * - pop(posiciÃ³n): me devuelve el elemento que estÃ¡ en "posiciÃ³n" y lo saca de la lista.- 
 * 
 * - remove(elemento): borra la primera ocurrencia de "elemento" en la lista. DevolverÃ¡ true o false
 *  en funciÃ³n del Ã©xito de la operaciÃ³n.
 * 
 * - insert(elemento): aÃ±adir "elemento" al final de la lista. 
 *  Devolveremos true o false en funciÃ³n del Ã©xito de la operaciÃ³n.
 * 
 * - insert(elemento, posiciÃ³n): aÃ±adir "elemento" en la posiciÃ³n "posiciÃ³n" de la lista.
 *  Devolveremos true o false en funciÃ³n del Ã©xito de la operaciÃ³n.
 * 
 * - clear(): vacÃ­a la lista.
 * 
 * - isFull(): me dice si la lista estÃ¡ llena.
 * 
 * - isEmpty(): me dice si la lista estÃ¡ vacÃ­a.
 * 
 * - resize(): cambia el tamaÃ±o mÃ¡ximo de la lista si el nuevo tamaÃ±o mÃ¡ximo no es menor que
 *  el nÃºmero de elementos que tiene. Devolveremos true o false en funciÃ³n del Ã©xito de la operaciÃ³n. 
 *  
 * - size(): nos devuelve el nÃºmero de elementos que hay en la lista.
 * 
 * - maxSize(): tamaÃ±o mÃ¡ximo de la lista.
 * 
 * 
 * @author Rafael del Castillo Gomariz
 *
 */

public class List implements Comparable<List> {

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


  /*
   * CÃ³digo para que:
   * 
   * 1. Comprobar si el nÃºmero de parÃ¡metros que llegan es mayor que DEFAULT_SIZE, si lo es el tamaÃ±o
   * mÃ¡ximo de mi array aumenta a esta cantidad.
   * 
   * 2. Crear el nuevo array con el tamaÃ±o mÃ¡ximo y asignarle los elementos recibidos como parÃ¡metro.
   * 
   * 3. Poner el valor correcto de size.
   */
  public List(int ... content) {
    this.size = content.length;

    if ( content.length > DEFAULT_SIZE ) {
      this.content = new int[content.length];
    } else {
      this.content = new int[DEFAULT_SIZE];
    }

    for (int i = 0; i < content.length; i++ ) {
      this.content[i] = content[i];
    }
  }

  /**
   * ToString()
   */
  @Override
  public String toString() {
    return "List [content=" + Arrays.toString(content) + ", size=" + size + "]";
  }

  @Override
  public int compareTo(List lista) {
    return this.size - lista.size;
  }

  /**
   * Getters and Setters
   */

  /**
   * 
   * @return
   */
  public int[] getContent() {
    return content;
  }

  /**
   * 
   * @param content
   */
  public void setContent(int[] content) {
    this.content = content;
  }

  /**
   * 
   * @return
   */
  public int getSize() {
    return size;
  }

  /**
   * 
   * @param size
   */
  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + Arrays.hashCode(content);
    result = prime * result + size;
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
    List other = (List) obj;
    if (!Arrays.equals(content, other.content))
      return false;
    if (size != other.size)
      return false;
    return true;
  }

  // Métodos //

  /**
   * AÃ±ade un elemento al final de la lista. 
   * 
   * @param element
   */
  public boolean insert(int element) { // booelan //
    int elementos = size() + 1;
    int tamaño = maxSize();

    if (elementos <= tamaño) { // Si es verdadero, es porque en el array hay espacios y podemos añadir un número sin problemas. //
      for (int i = 0; i < tamaño; i++) {
        if (i == elementos - 1) {
          this.content[i] = element;
          this.setSize(elementos);
          return true;
        }
      }
    } else { 
      return false;
    }


  }

  /**
   * AÃ±ade un elemento en la posiciÃ³n indicada de la lista.
   * @param element
   * @param pos
   * @return Ã©xito de la operaciÃ³n
   */
  public boolean insert(int element, int pos) {
    int elementos = size();
    int tamaño = maxSize();
    pos = pos - 1;
    
    if (elementos < tamaño || pos <= tamaño) {
      for (int i = tamaño; i > pos; i--) {
        if (i <= elementos) {
          this.content[i] = this.content[i-1];
          if (i == pos + 1) {
            this.content[i] = element;
            return true; 
          }
        } 
      }
    }
    return false;    
  }


  /**
   * Devuelve el Ãºltimo elemento de la lista y lo elimina.
   * @return Ãºltimo elemento de la lista
   */
  public int pop() {
    return 0;
  }

  /**
   * Borra la primera ocurrencia de un elemento en la lista.
   * 
   * @param element
   * @return Ã©xito de la operaciÃ³n.
   */
  public boolean remove(int element) {
    return false;
  }

  /**
   * VacÃ­a la lista.
   */
  public void clear() {

  }

  /**
   * 
   * @return si la lista estÃ¡ llena.
   */
  public boolean isFull() {
    return false;
  }

  /**
   * 
   * @return devuelve si la lista estÃ¡ vacÃ­a.
   */
  public boolean isEmpty() {
    return false;
  }

  /**
   * Cambia el tamaÃ±o mÃ¡ximo de la lista si el nuevo tamaÃ±o mÃ¡ximo no es menor que el nÃºmero de elementos que tiene. 
   *  
   * @return Ã©xito de la operaciÃ³n.
   */
  public boolean resize() {
    return false;
  }

  /**
   * 
   * @return nÃºmero de elementos que hay en la lista.
   */
  public int size() {
    return this.size;
  }

  /**
   * 
   * @return mÃ¡ximo nÃºmero de elementos que caben en la lista.
   */
  public int maxSize() {
    return this.content.length;
  }



}
