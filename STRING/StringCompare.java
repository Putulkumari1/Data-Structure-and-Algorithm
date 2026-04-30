public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Putul";
        String s2 = "Putul";
        String s3 = "python";
        //System.out.println(s1 == s2); // true because both refer to the same string in the string pool
        //equals() method compares the content of the strings, while == operator compares the references (memory addresses) of the strings. In this case, s1 and s2 refer to the same string in the string pool, so both == and equals() will return true.
        System.out.println("equals(): "+s1.equals(s2)); // true because both strings have the same content
        System.out.println("equalsIgnoreCase(): "+s1.equalsIgnoreCase(s3)); // true because both strings have the same content ignoring case
        
        System.out.println("compareTo(): "+s1.compareTo(s3)); // returns a positive value because "Putul" is lexicographically greater than "python"
       System.out.println("compareToIgnoreCase(): "+s1.compareToIgnoreCase(s3)); // returns a positive value because "Putul" is lexicographically greater than "python" ignoring case
    
    
    
    }
    
}
