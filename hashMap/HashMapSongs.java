import java.util.HashMap;
import java.util.Set;

public class HashMapSongs {
    public static void main(String[] args){

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("F.E.M.A", "Cut Throat");
        map.put("Flores", "Recuerda");
        map.put("2014 Forest Hills Drive", "G.O.M.D");
        map.put("Corta Venas", "Jugaste y Sufri");

        String song = map.get("Flores");
        System.out.println(song);

        for (String key : map.keySet()){
            System.out.println(String.format("Track: %s: Lyrics: %s", key, map.get(key)));
        }
    }

}


