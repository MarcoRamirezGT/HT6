/**
 * @author Walter Saldaña #19897
 * @author Marco Ramirez # 
 * Contrato que define el comportamiento de los items del Map
 * Referencias: 
 * Duane A. Bailey. (2007). Java Structures. 7ma edicion.
 */

public interface MapEntry<K,V>{

    /**
     * @param o Objeto cualquiera
     * @return true si todos los items (si los tiene) son iguales al de este Map
     */
    public boolean equals (Object o);

    /**
     * @return la llave asociada a este item
     */
    public K getKey();

    /**
     * @return valor asociado a este item
     */
    public V getValue();

    /**
     * @return codigo hash propio de este item
     */
    public int hashCode();

    /**
     * @param value nuevo valor para el item
     * @return value
     * Reemplaza el valor del item con value
     */
    public V setValue(V value);
   
 }