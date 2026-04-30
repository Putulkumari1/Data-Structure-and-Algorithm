public class PalindromeString {

 public static boolean palindromeCheck(String str) {
     int  left = 0 ;
      int right = str.length() - 1;
      while(left<right){
        if(str.charAt(left)!=str.charAt(right)){
          return false;
        }
        left++;
        right--;
      }
      return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = palindromeCheck(str);

      

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
