import java.util.Scanner;
public class SecondLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
             
        int [] arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
       // int secondMax = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i]>secondMax && arr[i]<max){
                secondMax = arr[i];
            }
        }
         if(secondMax == Integer.MIN_VALUE){
            System.out.println("No second largest element");
        } else {
            System.out.println("The second largest number is: " + secondMax);
        }
             
        sc.close();
    }
}