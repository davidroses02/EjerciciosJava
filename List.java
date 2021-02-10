package listaEnteros;

import java.util.Arrays;

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
   * Código para que:
   * 
   * 1. Comprobar si el número de parámetros que llegan es mayor que DEFAULT_SIZE, si lo es el tamaño
   * máximo de mi array aumenta a esta cantidad.
   * 
   * 2. Crear el nuevo array con el tamaño máximo y asignarle los elementos recibidos como parámetro.
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

  // M�todos //

  /**
   * Añade un elemento al final de la lista. 
   * 
   * @param element
   */
  public boolean insert(int element) { // booelan //
    int elementos = size() + 1;
    int tama�o = maxSize();

    if (elementos <= tama�o) { // Si es verdadero, es porque en el array hay espacios y podemos a�adir un n�mero sin problemas. //
      for (int i = 0; i < tama�o; i++) {
        if (i == elementos - 1) {
          this.content[i] = element;
          this.setSize(elementos);
          return true;
        }
      }
    } else { 
      return false;
    }
    return false;
  }

  /**
   * Añade un elemento en la posición indicada de la lista.
   * @param element
   * @param pos
   * @return éxito de la operación
   */
  public boolean insert(int element, int pos) {
    int elementos = size();
    int tama�o = maxSize();
    pos = pos - 1;
    
    if (elementos < tama�o || pos <= tama�o) {
      for (int i = tama�o; i > pos; i--) {
        if (i <= elementos) {
          this.content[i] = this.content[i-1];
          if (i == pos + 1) {
            this.content[i] = element;
            this.setSize(elementos);
            return true; 
          }
        } 
      }
    }
    return false;    
  }


  /**
   * Devuelve el último elemento de la lista y lo elimina.
   * @return último elemento de la lista
   */
  public int pop() {
    int aux = this.content[size() - 1];
    this.content[size() - 1] = 0;
    this.setSize(size() - 1);
    return aux;
  }

  /**
   * Borra la primera ocurrencia de un elemento en la lista.
   * 
   * @param element
   * @return éxito de la operación.
   */
  public boolean remove(int element) {
    int pos = size();
    
    for (int i = 0; i < pos; i++) {
      if (this.content[i] == element) {
        this.content[i] = 0;
        pos = i;
      } 
    }
    
    
    if (pos != size()) {
      for (int i = pos; i <= size() + 1; i++) {
        this.content[i] = this.content[i + 1];
        /**this.insert(this.content[i + 1], i);*/
      }
      return true;
    } 
    
     
    
    
    
    
    
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
    return this.size;
  }

  /**
   * 
   * @return máximo número de elementos que caben en la lista.
   */
  public int maxSize() {
    return this.content.length;
  }



}