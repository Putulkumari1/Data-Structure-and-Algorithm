import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        // String input = "12534";
        // String reversed = new StringBuilder(input).reverse().toString();
        // System.out.println("Original: " + input);
        // System.out.println("Reversed: " + reversed);
     //=================================================================================================   
        // read the input as a string so leading zeros (if any) are preserved
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number or string to reverse: ");
        String input = scanner.nextLine();
        scanner.close();

        String reversed = reverseString(input);
        System.out.println("Reversed value: " + reversed);
    }

    /**
     * Returns the reversed version of the given string. Works for numeric strings as well.
     */
    private static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}


    
