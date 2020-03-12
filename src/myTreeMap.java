
/**
 * @author Walter Saldaña #19897
 * @author Marco Ramirez # 
 * Implementacion de tipo Tree de un Map
 */

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class myTreeMap<K,V> implements Map<K,V>{

    private TreeMap<K,V> treemap;
    
    /**
     * Metodo constructor
     */
    public myTreeMap(){
        this.treemap = new TreeMap<K,V>();
    }

    /**
     * @return numero de items que componen el Map
     */
    public int size() {
        return this.treemap.size();
    }
    
    /**
     * @return true si el Map esta vacio
     */
    public boolean isEmpty() {
        return this.treemap.isEmpty();
    }
    
    /**
     * @param k llave del map
     * @return true si la llave k pertenece al Map
     */
    public boolean containsKey(K k) {
        return this.treemap.containsKey(k);
    }
    
    /**
     * @param v valor de un item del map
     * @return true si algun elemento contiene el valor v 
     */
    public boolean containsValue(V v) {
        return this.treemap.containsValue(v);
    }
    
    /**
     * @param k llave de un item
     * @return valor asociado a la llave k
     */
    public V get(K k) {
        return this.treemap.get(k);
    }
    
    /**
     * @param k nueva llave
     * @param v nuevo valor
     * @return valor del nuevo item agregado
     * Agrega un nuevo item k,v al map
     */
    public V put(K k, V v) {
        return this.treemap.put(k, v);
    }
    
    /**
     * @param k llave de un item del map
     * @return valor asociado a la llave k
     * Elimina el item k,v del map
     */
    public V remove(K k) {
        return this.treemap.remove(k);
    }
    
    /**
     * @param other otro map
     * Anexa el otro map a este
     */
    public void putAll(Map<K, V> other) {
    }
    
    /**
     * vacia los items del map
     */
    public void clear() {
        this.treemap.clear();
    }

    /**
     * @return Set con todas las llaves del map
     */
    public Set<K> keySet() {
        return this.treemap.keySet();
    }

    /**
     * @return Collection con todos los valores del Map
     */
    public Collection<V> values() {
        return this.treemap.values();
    }

    /**
     * @return Set de todos los items del map
     */
    public Set<Association<K, V>> entrySet() {
        //return this.treemap.entrySet();
        return null;
    }

}
