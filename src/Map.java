/**
 * @author Walter Saldaña #19897
 * @author Marco Ramirez # 
 * Contrato que define el comportamiento de la estructura de dato "Map"
 * Referencias: 
 * Duane A. Bailey. (2007). Java Structures. 7ma edicion.
 */

import java.util.Set;

public interface Map<K,V> {

    /**
     * @return Numero de items que contiene el mapa
     */
    public int size();

    /**
     * @return true si no se tiene ningun valor guardado en el Map
     * @return false si existe uno o mas elementos guardados en la estructura
     */
    public boolean isEmpty();

    /**
     * @param k valor de una llave
     * @return true si la k es una llave del Map
     */
    public boolean containsKey(K k);

    /**
     * @param v posible valor asociado a una llave
     * @return true si v es un valor asociado a una llave
     */
    public boolean containsValue(V v);

    /**
     * @param k una llave del Map
     * @return Valor asociado a la llave k
     */
    public V get(K k);

    /**
     * @param k nueva llave
     * @param v nuevo valor asociado a k
     * @return v
     * Inserta un maping de k a v en el mapa
     */
    public V put(K k, V v);
    
    /**
     * @param k una llave del mapa
     * @return valor asociado a k
     * Elimina el item k,v del mapa
     */
    public V remove(K k);

    /**
     * @param other otro Map
     * Anexa el otro Map
     */
    public void putAll(Map<K,V> other);

    /**
     * Borra todos los items del mapa
     */
    public void clear();

    /**
     * @return set con todos las llaves del Map
     */
    public Set<K> keySet();

    /**
     * @post returns a structure that contains the range of the map
     */
    public Structure<V> values();

    /**
     * @post returns a set of (key-value) pairs, generated from this map
     */
    public Set<Association<K,V>> entrySet();

    /**
     * @param other Objeto cualqueira a comparar
     * @return true si todos los (si tiene) son iguales a las de este Map
     */
    public boolean equals(Object other);
    
    /**
     * @return codigo hash asociado al Map
     */
    public int hashCode();
}
