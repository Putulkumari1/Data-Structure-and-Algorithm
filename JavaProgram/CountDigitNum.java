public class CountDigitNum {
 
    public static int Digit(int n){

        int count = 0;
    while(n>0){
            n=n/10;
            count++;
        }

        return count;


    }

    
    



    public static void main(String[] args) {
        // long n=1234567890;
       // int count=0;
       int n=12345;
       System.out.println("number of digit : "+n);
       int digits = Digit(n);
       System.out.println("number of digits : "+digits);
       System.out.println("number of digit : " +Digit(n));



       
    }
        
}
