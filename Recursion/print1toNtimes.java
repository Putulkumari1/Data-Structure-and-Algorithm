

class Solution {
    // Recursive function to print numbers from current to n
    public void printNumbers(int current, int n) {
        // Base case: if current exceeds n, stop recursion
        if (current > n)
            return;

        // Print current number
        System.out.print(current + " ");

        // Recursive call with next number
        printNumbers(current + 1, n);
    }
}

public class print1toNtimes {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.printNumbers(1, n);
        System.out.println();
    }
}
