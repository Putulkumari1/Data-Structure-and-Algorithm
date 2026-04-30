import java.util.ArrayList;
import java.util.List;

public class AllDivisor {
    public static void main(String[] args) {
        int n1 = 36;
        int n2 = 12;
        
        System.out.println("Input: N = " + n1);
        System.out.println("Output: " + findDivisors(n1));
        
        System.out.println("\nInput: N = " + n2);
        System.out.println("Output: " + findDivisors(n2));
    }
    
    static List<Integer> findDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        
        return divisors;
    }
}
