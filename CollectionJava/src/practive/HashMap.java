package practive;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new java.util.HashMap<>();
        hashMap.put("Tinh",31);
        hashMap.put("Hoc",25);
        hashMap.put("Khoa",12);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("Sen",100);
        System.out.println("In age for"+"Sen "+linkedHashMap.get("Sen"));
    }
}
