public class TheoryBinary {

    public static int binarySearch(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
         return -1;
        

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,6,7,9};
        int target = 7;
        int result = binarySearch(arr, target);
        if(result != -1){
            System.out.println("element found at index "+result);
        }else{
            System.out.println("element not found");
        }
    }
}
