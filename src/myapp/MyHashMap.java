package myapp;


import java.util.HashMap;

public class MyHashMap {

    public static void main(String[] args) {
        //Key / Value
        // String , Integer

        HashMap <String, Integer> myMap = new HashMap<String, Integer>();

        //Add a key, value pair to it
        myMap.put("fred", 20);
        myMap.put("bob", 40);

        //to print key use myMap.get()
        String key = "fred";
        System.out.println("Value for key = "+ key + " -> " + myMap.get(key));

        myMap.put("fred", 31);
        System.out.println("Value for key = "+ key + " -> " + myMap.get(key));

        //check if a key exists in map
        System.out.println("check if fred exists" + myMap.containsKey("fred"));
    }
    
}
