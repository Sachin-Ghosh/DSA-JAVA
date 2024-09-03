import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        String s = "tree";
        System.out.print(frequencySort(s));
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Character>[] buckets = new List[s.length() + 1];
        for (char c : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(c);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(c);
        }

        StringBuilder result = new StringBuilder();
        for (int i = buckets.length - 1; i > 0; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                    for (int j = 0; j < i; j++) {
                        result.append(c);
                    }
                }
            }
        }

        return result.toString();
    }
}
