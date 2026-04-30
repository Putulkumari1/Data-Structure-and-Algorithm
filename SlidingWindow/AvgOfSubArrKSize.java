public class AvgOfSubArrKSize {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int sum = 0;
//use fixed size pattern
        for(int i=0;i<k;i++){
            sum += arr[i];

        }
        System.out.println("the avg of subarray :" +(double)sum/k);
       
       for(int i=k;i<arr.length;i++){
        sum +=arr[i];
        sum -= arr[i-k];

      System.out.println("the avg of subarray is: "+(double)sum/k);
        
       }

    }
}
