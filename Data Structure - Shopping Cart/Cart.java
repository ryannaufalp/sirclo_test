package ShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class Cart{

    Map<String, Integer> map = new HashMap<>();

    public void tambahProduk(String kodeProduk, int kuantitas){
        map.put(kodeProduk, map.getOrDefault(kodeProduk, 0) + kuantitas);
    }

    public void hapusProduk(String kodeProduk){
        map.remove(kodeProduk);
    }

    public String tampilkanCart(){
        String result = "";
        for (String key: map.keySet()){
            result+=key + " (" + map.get(key) + ")\n";
        }
        return result;
    }
}