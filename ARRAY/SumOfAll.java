public class SumOfAll {
    //using function
    //  int sum(int arr[]){
    //     int sum=0;
    //     for(int i=0;i<arr.length;i++){
    //         sum+=arr[i];
    //     }
    //     return sum;
    // }

    public static void main(String[] args) {
        int arr[]={10,20,30};

        //create object of call function 

       // SumOfAll obj=new SumOfAll();
        
        //System.out.println("the sum of all the elements in the array is "+obj.sum(arr));

        //without using function
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("the sum of all element "+sum);

    }
}
