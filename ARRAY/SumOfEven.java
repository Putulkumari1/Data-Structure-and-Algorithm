public class SumOfEven {
    //using function
    // int sumofEven(int arr[]){
    //     int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]%2==0){
    //             sum+=arr[i];
    //         }
    //     }
    //     return sum;
    // }
  
        public static void main(String[] args) {

            int arr[]={1,3,5,2,6,8,4};
            //create object to call function
            // SumOfEven se=new SumOfEven();
            // System.err.println("the sum of even numbers are: "+se.sumofEven(arr));

            //without using function
            int sum=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    sum+=arr[i];
                }
            }
            System.out.println("Sum of even numbers: "+sum);


            //sum of odd numbers
            int sum1=0;
            int j=0;
            while(j<arr.length){
                if(arr[j]%2!=0){
                    sum1+=arr[j];
                }
                j++;
            }
            System.out.println("Sum of odd numbers: "+sum1);
    }
}
