import java.util.*;
public class factnumtcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number");
        int n = sc.nextInt();
        int fact = 1;

        //factorial number is fact = fact*i 5! = 120
         for(int i = 1; i<=n;i++){
            fact = fact*i;
         }
         System.out.println(" factorial number is : "+fact);
         sc.close();
    }
}
