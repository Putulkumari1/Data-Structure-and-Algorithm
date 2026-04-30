import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfOccurence {
    public static void main(String[] args) {
        String input = "hello world"; // sample string
        Map<Character, Integer> counts = countChars(input);
        System.out.println("Input: " + input);
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> e : counts.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    private static Map<Character, Integer> countChars(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
