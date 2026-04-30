public class CaseConTypeCon {
    public static void main(String[] args) {
        //case conversion touppercase and tolowecase

        //============================================================================================
        // String name = "Putul Kumari Gupta";
        // System.out.println("original string : " +name);
        // String upper = name.toUpperCase();
        // System.out.println("Lppercase string : "  +upper);
        // String lower = name.toLowerCase();
        // System.out.println("Lowercase string : "+lower);

        //===============================================================================================

        //type conversion  string to int or int to string 
       // use -Integer.parseInt() method to convert string to int 
       //
       
          String n  = "100";
          int num = Integer.parseInt(n);
          System.out.println("string to int : " + (num+50));


          // use -Integer.toString() method to convert int to string

          int number = 200;
            String str = Integer.toString(number);
            System.out.println("int to string : " + str + 50); // concatenation of string and int will result in a string
           










    }
}
