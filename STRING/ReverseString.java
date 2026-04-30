public class ReverseString {
    public String reverseString(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseString solution = new ReverseString();
        String input = "Putul,Kumari";
        String reversed = solution.reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}