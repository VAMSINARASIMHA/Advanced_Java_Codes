package collection_framework_in_java.map_in_java;

//Defination :- The Map interface is a part of the Java Collections Framework and is used to store key-value pairs. Each key must be unique, but values can be duplicated.
//HashMap will not follow the both ""Insertion Order"" and ""Sorted Order"". and The order of keys and values are unpredictable in this HashMap.
//HashMap will allows null keys and null values, and also it allows duplicate values but it will not allows duplicate keys.
//the default and initial capacity of HashMap is "16" later it increases like(16,32,64,128....).

import java.util.HashMap;
import java.util.Map;

public class HashMap_In_Java {
    public static void main(String[] args) {
        // Type:-1
        Map<Integer, String> obj = new HashMap<Integer, String>();
        obj.put(1, "Vamsi");
        obj.put(2, "Shiva");
        obj.put(4, "Shiva");
        obj.put(5, "Bhargav");
        obj.put(3, "Chetan");
        obj.put(null, null);

        obj.put(20, "ravi"); // it will not print('ravi') because it will updated in the next
                             // line""obj.put(20,"Ram");""
        obj.put(20, "Ram"); // Here,it will print in the place of 'ravi'.and it is updated key.

        System.out.println(obj.get(3));
        System.out.println(obj.keySet());
        System.out.println(obj.values());
        System.out.println(obj);
        System.out.println(obj.size());

        System.out.println();
        System.out.println();

        for (Integer key : obj.keySet()) {
            System.out.println(key + " : " + obj.get(key));
        }

        // Using (Java 8+) Feature.
        // obj.forEach((key, value) -> {
        // System.out.println("Key = " + key + ", Value = " + value);
        // });

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // Type:-2
        Map<String, Integer> obj1 = new HashMap<String, Integer>();
        obj1.put("Vamsi", 1);
        obj1.put("Shiva", 2);
        obj1.put("Bhargav", 5);
        obj1.put("Chetan", 3);
        obj1.put("Shiva", 4);
        obj1.put(null, null);

        System.out.println(obj1.get("Chetan"));

        System.out.println(obj1);

        System.out.println();
        System.out.println();

        for (String key : obj1.keySet()) {
            System.out.println(key + " : " + obj1.get(key));
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // Type:-3 -----> Using (Java 8+) Feature.
        obj1.forEach((key, value) -> {
            System.out.println("Key = " + key + ", Value = " + value);
        });

    }
}
