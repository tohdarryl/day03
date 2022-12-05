package myapp;

import java.util.ArrayList;
import java.util.HashMap;

public class MyHashMap2 {

    public static void main(String[] args) {
         //key / array of strings [ ,  ,  ,   ]
        //string / strings

       HashMap<String, ArrayList<String>> userMap = new HashMap<String, ArrayList<String>>();
        
       ArrayList <String> fred = new ArrayList<>();
       fred.add("apple");

       //add keys

        userMap.put("fred", new ArrayList<>());
        userMap.put("bob", new ArrayList<>());
        userMap.put("alex", new ArrayList<>());
        userMap.put("darryl", new ArrayList<>());

      

    
        
        

    }
   


    
}
