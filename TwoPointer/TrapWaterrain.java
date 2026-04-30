public class TrapWaterrain {
    public static void main(String[] args) {
        int[] height = {2,3,4,5,1,7};
        int left = 0;
        int right = height.length-1;
//two pointer techniques
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while(left < right){
             if(height[left] < height[right]){

                if(height[left] >= leftMax){

                    //logic
                    leftMax = height[left];
                }else{
                    water += leftMax - height[left];
                }

                left++;

            }else{

                if(height[right] >= rightMax){
                    rightMax = height[right];
                }else{
                    water += rightMax - height[right];
                }

                right--;
            }
        }
            System.out.println("Total Water: " + water);
    }
}
