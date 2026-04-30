public class StringCon {
    public static void main(String[] args) {
        //Concatenation and substring 
        String str1 = "hello";
        String Str2 = "Putul";
        //string substring method is used to extract a portion of a string based on specified indices. It takes two parameters: the starting index (inclusive) and the ending index (exclusive). The method returns a new string that contains the characters from the original string starting from the specified starting index up to, but not including, the specified ending index.
        // replace 
        String result = str1.substring(1);
        // add str1 + str2
        //string concat method is used to concatenate two strings. It takes another string as a parameter and returns a new string that is the result of concatenating the original string with the specified string.
        String result1 = str1.concat(Str2);
        System.out.println(result);
        System.out.println(result1);



    }
}
