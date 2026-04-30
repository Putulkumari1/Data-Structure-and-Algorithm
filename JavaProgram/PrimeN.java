public class PrimeN {
    public static void main(String[] args) {
        //easy way to find prime number
        int n=8;
    //check number is prime or not and print 
         int count = 0;

        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }

        if(count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }


       

        // for(int i=2;i<=n;i++){
        //     boolean isPrime=true;
        //     for(int j=2;j<i;j++){
        //         if(i%j==0){
        //             isPrime=false;
        //             break;
        //         }
        //     }
        //     if(isPrime){
        //         System.out.println(i);
        //     }
        // }
    }
}
