public class PalindromeStr {
    public static void main(String[] args) {
         String  s = "madam";

         int left = 0;
         int right = s.length()-1;
//two pointer technique opposite direction 
         boolean isPalindrome = true;
         while(left < right){
            if(s.charAt(left)!=s.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;

         }
         //if else statement check condition
         
         if(isPalindrome){
            System.out.println("palindrome");
         }else{
            System.out.println("not palindrome");
         }

    }
}
