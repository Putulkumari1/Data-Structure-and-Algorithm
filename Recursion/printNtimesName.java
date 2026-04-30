class Solution {
    // Recursive function to print name count times
    public void printName(String name, int count, int N) {
        // Base case: if count equals N, stop recursion
        if (count == N)
            return;

        // Print the name
        System.out.println(name);

        // Recursive call with incremented count
        printName(name, count + 1, N);
    }
}

public class printNtimesName {
     public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        String name = "putul";

        sol.printName(name, 0, N);
    }
}
