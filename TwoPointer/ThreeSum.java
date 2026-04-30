import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = {0,1,3,4,5,6};
        int target = 9;
        Arrays.sort(nums);
        //use two pointer technique
      System.out.println("sorted numbers"+nums);
        //logic use
        for(int i=0; i<nums.length-2;i++){

        
        int left = i+1;
        int right = nums.length-1;

        while(left < right){
            int sum = nums[i]+nums[left]+nums[right];
            if(sum == target){
                System.out.println(nums[i]+" "+nums[left]+" "+nums[right]);
                left++;
                right--;
            }
            else if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        }
    }
}
