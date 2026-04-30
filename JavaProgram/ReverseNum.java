public class ReverseNum {
    public static void main(String[] args) {
        int n =123456;
        int rev=0;
        //use for loop
        // for(int i=n;i>0;i=i/10){
        //     int rem=i%10;
        //     rev=rev*10+rem;
        // }

        //while loop
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("the reverse of number is "+rev);
    }
}
