import java.util.Scanner;

class Solution {
    // Function to find sum of first N natural numbers using loop
    public int sumOfNaturalNumbers(int N) {
        // Initialize sum to 0
        int sum = 0;

        // Loop from 1 to N
        for (int i = 1; i <= N; i++) {
            // Add current number to sum
            sum += i;
        }

        // Return the computed sum
        return sum;
    }
}
public class sumofNnumbers {
    public static void main(String[] args) {
        // Create object of Solution class
        Solution obj = new Solution();

        // Input value for N
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("enter n number: ");
        int N = sc.nextInt();

        // Call the function and store the result
        int result = obj.sumOfNaturalNumbers(N);

        // Print the result
        System.out.println(result);

        sc.close();
    }
}
