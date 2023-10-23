package ss12_java_collection_framework.practice.thuc_hanh_su_dung_hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hasMap = new HashMap<>();
        hasMap.put("Lati",17);
        hasMap.put("NQuin",23);
        System.out.println(hasMap);
        Map<String,Integer> treeMap = new TreeMap<>(hasMap);
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Hampeo",32);
        linkedHashMap.put("Lewis",29);
        System.out.println("Age of Hampeo is: " + linkedHashMap.get("Smith"));
    }
}
