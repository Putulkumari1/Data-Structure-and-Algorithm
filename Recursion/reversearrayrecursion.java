class Solution {
    // Function to reverse an array
    public int[] reverseArray(int[] arr) {
        // Get the length of the input array
        int n = arr.length;

        // Create a new array of same size to store reversed elements
        int[] ans = new int[n];

        // Loop to fill ans[] from the back of arr[]
        for (int i = 0; i < n; i++) {
            // Place elements from the end of arr into the start of ans
            ans[i] = arr[n - 1 - i];
        }

        // Return the reversed array
        return ans;
    }
}

public class reversearrayrecursion {
        public static void main(String[] args) {
        // Input array
        int[] arr = {1, 2, 3, 4, 5};

        // Create object of Solution class
        Solution obj = new Solution();

        // Call the reverseArray function
        int[] result = obj.reverseArray(arr);

        // Print the reversed array
        System.out.print("Reversed Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
