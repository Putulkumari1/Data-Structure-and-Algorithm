public class MaxSumSubArrSizeK {
    public static void main(String[] args) {
        //find maxmimum number sum of sub array of k size
        //fixed size patter we can use 
        int arr[]={1,3,5,6,3,1,3};
        int k=3;
        int sum = 0;

        for(int i=0;i<k;i++){
            sum += arr[i];
        }

        int MaxSum = sum;
        for(int i = k;i<arr.length;i++){
            sum += arr[i];
            sum -= arr[i-k];

            MaxSum =Math.max(MaxSum, sum);
        }
        System.out.println("max sum of sub array is: "+MaxSum);
    }
}
