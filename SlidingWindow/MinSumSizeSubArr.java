public class MinSumSizeSubArr {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6};

        int target = 7;
        int left =0;
        int sum = 0;
        int MinLen = Integer.MAX_VALUE;
        //minimum sliding patter
        for(int right = 0; right<arr.length;right++){
            sum += arr[right];
            while(sum >= target ){
              
                MinLen = Math.min(MinLen, right-left+1);
                sum -= arr[left];
                left++;
            }
        }
         if(MinLen ==Integer.MAX_VALUE){
           System.err.println(0);
         }else{

         
        System.out.println("minimum sub array is: "+MinLen);
         }
    }
}
