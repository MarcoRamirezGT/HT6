/**
 * @author Walter Saldaña #19897
 * @author Marco Ramirez #
 * Factory para seleccionar una implementacion del MAP
 */

public class MapFactory<K,V>{

    /**
     * @param type tipo de implementacion
     * @return Objeto Map con la implementacion deseada
     * Posibles parametros:
     * "tree" -> TreeMap
     * "hash" -> HashMap
     * "linked" -> LinkedHashMap
     * Por defecto -> HashMap
     */
    public Map<K,V> getMap(String type){

        if(type.equals("tree")){
            return new TreeMap<K,V>();
        }

        else if(type.equals("hash")){
            return new HashMap<K,V>();
        }

        else if(type.equals("linked")){
            return new LinkedHashMap<K,V>();
        }
        
        else{
            return new TreeMap<K,V>();
        }

    }
}