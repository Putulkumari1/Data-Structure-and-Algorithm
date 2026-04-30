import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String input = "frequency example";
        Map<Character, Integer> freq = charFrequency(input);
        System.out.println("String: " + input);
        System.out.println("Frequencies:");
        for (Map.Entry<Character, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    private static Map<Character, Integer> charFrequency(String s) {
        Map<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }
        return m;
    }
}
