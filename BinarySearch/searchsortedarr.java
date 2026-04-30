public class searchsortedarr {
    public static void main(String[] args) {
        int arr[] = {1,3,4,6,7,8,9};
        int target = 6;

        int left = 0;
        int right = arr.length-1;

        while(left<=right){
         int mid = (left+right)/2;
         if(arr[mid] == target){
            System.out.println("element fount at index : "+mid);
            return;
         }
         else if(arr[mid]<target){
                left = mid+1;
         }
         else{
           right = mid-1;
         }
        }

        System.out.println("element not found");
    }
}
