
/**
 * @author Walter Saldaña #19897
 * @author Marco Ramirez # 
 * Implementacion de tipo Hash de un Map
 */

import java.util.Collection;
import java.util.Set;
import java.util.HashMap;

public class myHashMap<K,V> implements Map<K,V>{
    
    private HashMap<K,V> hashmap;

    public myHashMap(){
        this.hashmap = new HashMap<K,V>();
    }

    /**
     * @return numero de items que componen el Map
     */
    public int size() {
        return this.hashmap.size();
    }
    
    /**
     * @return true si el Map esta vacio
     */
    public boolean isEmpty() {
        return this.hashmap.isEmpty();
    }
    
    /**
     * @param k llave del map
     * @return true si la llave k pertenece al Map
     */
    public boolean containsKey(K k) {
        return this.hashmap.containsKey(k);
    }
    
    /**
     * @param v valor de un item del map
     * @return true si algun elemento contiene el valor v 
     */
    public boolean containsValue(V v) {
        return this.hashmap.containsValue(v);
    }
    
    /**
     * @param k llave de un item
     * @return valor asociado a la llave k
     */
    public V get(K k) {
        return this.hashmap.get(k);
    }
    
    /**
     * @param k nueva llave
     * @param v nuevo valor
     * @return valor del nuevo item agregado
     * Agrega un nuevo item k,v al map
     */
    public V put(K k, V v) {
        return this.hashmap.put(k, v);
    }
    
    /**
     * @param k llave de un item del map
     * @return valor asociado a la llave k
     * Elimina el item k,v del map
     */
    public V remove(K k) {
        return this.hashmap.remove(k);
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
        this.hashmap.clear();
    }

    /**
     * @return Set con todas las llaves del map
     */
    public Set<K> keySet() {
        return this.hashmap.keySet();
    }

    /**
     * @return Collection con todos los valores del Map
     */
    public Collection<V> values() {
        return this.hashmap.values();
    }

    /**
     * @return Set de todos los items del map
     */
    public Set<Association<K, V>> entrySet() {
        //return this.hashmap.entrySet();
        return null;
    }

}
