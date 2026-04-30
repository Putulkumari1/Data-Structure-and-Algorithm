public class LongsubarrSumSizeK {
    public static void main(String[] args) {
        //Find the length of the longest subarray whose sum = k.
         int arr[]={4,1,1,1,2,3,5};
          int k = 5;

        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for(int right = 0; right < arr.length; right++){

            sum += arr[right];

            while(sum > k && left <= right){
                sum -= arr[left];
                left++;
            }

            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        System.out.println("Longest length: " + maxLen);
    }
}

