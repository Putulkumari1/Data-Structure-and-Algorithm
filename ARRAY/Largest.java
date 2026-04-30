//import java.util.*;


class Largest {
public static void main(String[] args){
        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
 
       // int [] arr = new int [n];
        //loop print number 
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }

//         //take max number
//         int max = 0;
//         for(int i = 0;i<n;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//             System.out.println(max);
// sc.close();
// }

//***************unsorted array */
// int arr[] = {1,3,4,5,6,7,2,9};
// int max = 0;
// // print largest number 
// Arrays.sort(arr);
// max = arr[arr.length - 1];

//     System.out.println("largest element is: " + max);

//***************sorted array */
int arr []={1,2,3,4,5};
int max = arr[0];

for(int i = 1;i<arr.length;i++){
    if(arr[i]>max){
        max = arr[i];
    }
}
    System.out.println("largest number is:"+max);
}
}
