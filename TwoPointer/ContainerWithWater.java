public class ContainerWithWater {
    public static void main(String[] args) {
        //use two pointer technique
        int[] height = {1,99,3,4,2,6,7};
        int left = 0;
        int right = height.length-1;
        int MaxArea = 0;

        while(left < right){
           //logic 
           int h =Math.min(height[left], height[right]);
           int width = right-left;
           int area = h*width;

           MaxArea = Math.max(MaxArea, area);


            if (height[left]<height[right]) {
                left++;
            }else{
                right--;
            }
        }
        System.out.println("max area water : "+MaxArea);
    }
}
