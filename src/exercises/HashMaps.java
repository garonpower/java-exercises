package exercises;

import java.util.HashMap;
import java.util.Map;

//Learning about HashMaps. Set up, put, get, and iterate.

public class HashMaps {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        //put method.  Store key value pairs into the HashMap
        map.put(5,"Five");
        map.put(8,"Eight");
        map.put(6,"Six");
        map.put(4,"Four");
        map.put(2,"Two");

        //get method. Full Value with Key.
        String text = map.get(4);

        System.out.println(text);

        // If you use get method with a key that doesn't exist the output will be 'null'

        //Iterate through Hashmap
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + ": " + value);
        }

    }
}
