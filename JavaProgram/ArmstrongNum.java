public class ArmstrongNum {
    public static void main(String[] args) {
        int n=153;
        int sum=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("the number is armstrong");
        }else{
            System.out.println("the number is not armstrong");
        }
    }
}
