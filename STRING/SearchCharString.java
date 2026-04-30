public class SearchCharString {
    public static void main(String[] args) {
        String s1 = "putul";
        char ch = 't';
        int index = s1.indexOf(ch);

        //use indexOf() method to find the index of the first occurrence of the character in the string. If the character is not found, it returns -1.
    
          System.out.println("indexOf(): "+index);
        //use lastIndexOf() method to find the index of the last occurrence of the character in the string. If the character is not found, it returns -1.
        int lastIndex = s1.lastIndexOf(ch);
        System.out.println("lastIndexOf(): "+lastIndex);

        //charAt() method to get the character at a specific index in the string. If the index is out of bounds, it throws an IndexOutOfBoundsException.
        char charAtIndex = s1.charAt(2);
        System.out.println("charAt(): "+charAtIndex);

        //contains() method to check if the string contains a specific character. It returns true if the character is found in the string, otherwise it returns false.
        boolean containsChar = s1.contains(Character.toString(ch));
        System.out.println("contains(): "+containsChar);

        //startsWith() method to check if the string starts with a specific character. It returns true if the string starts with the character, otherwise it returns false.
        boolean startsWithChar = s1.startsWith(Character.toString(ch));
        System.out.println("startsWith(): "+startsWithChar);

        //endsWith() method to check if the string ends with a specific character. It returns true if the string ends with the character, otherwise it returns false.
        boolean endsWithChar = s1.endsWith(Character.toString(ch));
        System.out.println("endsWith(): "+endsWithChar);

    }
}
