import java.util.HashMap;
import java.util.Map;

public class FrequencyCounterSimple {

    public static void main(String[] args) {

        // The input data and queries are hardcoded.
        int[] arr = {10, 5, 10, 15, 10, 5, 20};
        int[] queries = {10, 20, 5, 30};

        // 1. Build a frequency map from the array.
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : arr) {
            // Use getOrDefault to simplify the logic.
            // If the element is already in the map, its value is incremented.
            // Otherwise, it's added to the map with a value of 1.
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        System.out.println("Frequency map created: " + frequencyMap);
        System.out.println("-----------------------------------");

        // 2. Answer queries using the frequency map.
        System.out.println("Answering queries...");
        for (int query : queries) {
            // Use getOrDefault to provide a default value of 0 if the query is not found.
            int count = frequencyMap.getOrDefault(query, 0);
            System.out.println("Count of " + query + ": " + count);
        }
    }
}
