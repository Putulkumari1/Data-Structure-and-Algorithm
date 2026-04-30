public class CheckStringRotationOrNot {
    
    public static boolean isRotation(String s1, String s2) {
        
        //  check length
        if (s1.length() != s2.length()) {
            return false;
        }

        //  concatenate s1 with itself
        String temp = s1 + s1;

        // check if s2 is substring
        return temp.contains(s2);
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "cdeab";

        if (isRotation(s1, s2)) {
            System.out.println("Yes, Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}
