public class TwoPointer {
    public static void main(String[] args) {
        int arr [] = {1,3,6,8,2};
        int target = 10;
     //two pointer techniques start with start and end , two pointer techniques moves opposite direction and same direction 
        int left = 0;
        int right = arr.length -1;

        while(left < right){
            int Sum = arr[left]+arr[right];
            if( Sum == target ){
                System.out.println("pair fount :" +arr[left]+ " " +arr[right]);
                break;
                
            }
            else if(Sum < target){
                 left ++;
            }else{
                right--;
            }
        }


    }

}
