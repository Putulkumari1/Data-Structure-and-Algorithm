public class RevStrCheckPalindrome {
    public static void main(String[] args) {
        // reverse string and check if palindrome
        String s = "putul";
        String rev = new StringBuilder(s).reverse().toString();


        //check if original is reverse or palindrome
        if(s.equals(rev)){
            System.out.println(s + "is a palindrome");
        } else{
            System.out.println(s + "is not a palindrome");
        }
      // second 
        

        
    }
}
