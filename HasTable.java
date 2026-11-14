import java.util.HashMap;
import java.util.Map;

public class HasTable {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("Apple", 14);
        map.put("Jackfruit", 11);
        map.put("Pineapple", 13);
        // Find
        System.out.println(map.get("Jackfruit"));
        // Exsisitence
        System.out.println(map.containsKey("Pineapple"));
        // Remove
        map.remove("Pineapple");
        // Print A HashMap
        System.out.println(map);
        // Traversal
        for (Map.Entry<String, Integer> iterator : map.entrySet()) {
            System.out.println(iterator.getKey() + " : " + iterator.getValue());
        }
        //Length of HashMap
        System.out.println(map.size());
    }
}
