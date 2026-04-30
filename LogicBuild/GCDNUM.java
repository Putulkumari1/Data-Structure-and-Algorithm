import java.util.Scanner;

public class GCDNUM {
 // compute greatest common divisor using Euclidean algorithm
    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        sc.close();

        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + result);
     }
 }
 