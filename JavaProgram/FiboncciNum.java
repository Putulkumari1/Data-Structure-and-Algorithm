public class FiboncciNum {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        System.out.println("the first "+n+" fiboncci numbers are:");

        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    System.out.println();


    }
}
