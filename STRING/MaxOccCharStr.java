import java.util.HashMap;
import java.util.Map;

public class MaxOccCharStr {
    public static void main(String[] args) {
        // sample string; you can change this or read from user if needed
        String input = "putul";
        char maxChar = maxOccurringChar(input);
        System.out.println("Input: " + input);
        System.out.println("Max occurring character: " + maxChar);
    }

    private static char maxOccurringChar(String str) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        char best = '\0';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> e : counts.entrySet()) {
            if (e.getValue() > maxCount) {
                maxCount = e.getValue();
                best = e.getKey();
            }
        }
        return best;
    }
}
