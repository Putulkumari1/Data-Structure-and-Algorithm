public class palindrome{
    public boolean palindromeCheck (String str){

    
        //use two pointer techniques
//         Example 1:
// Input: Str =  “ABCDCBA”
// Output: Palindrome
// Explanation: String when reversed is the same as string.

// Example 2:
// Input: Str = “TAKE U FORWARD”
// Output: Not Palindrome
// Explanation: String when reversed is not the same as string.
//            
        int left = 0;
        int right = str.length() -1;

        while(left < right){
            if(str.charAt(right) != str.charAt(left)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
        public static void main(String[] args) {
            palindrome  p = new palindrome();
            String str = "ABCDCBA";
            boolean ispalindrome = p.palindromeCheck(str);

            if(ispalindrome){
                System.out.println(str + " is a palindrome");
            }
            else{
                System.out.println(str + " is not a palindrome");
            }
    }
}