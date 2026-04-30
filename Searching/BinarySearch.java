public class BinarySearch {
    //using function simple 

    int binarySearch(int [] arr,int target){
        int start=0;
        int last = arr.length-1;
        // binary algorithm 
        while(start<=last){
            int mid = start + (last-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                last=mid-1;
            }
       }
       return -1; // element not found
    }
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50};
        int target=40;

        // create an object of binary search class and call the method
            BinarySearch bs = new BinarySearch();
            // call the binary search method and store the result

            int result = bs.binarySearch(arr, target);
            
            if(result != -1){
                System.out.println("Element found at index: "+result);
            }
            else{
                System.out.println("Element not found in the array.");
            }

        // binary search work only sorted array
        // while(start<=last){
        //     int mid = start + (last-start)/2;
        //     if(arr[mid]==target){
        //         System.out.println("Element found at index: "+mid);
        //         return;
        //     }
        //     else if(arr[mid]<target){
        //         start=mid+1;
        //     }
        //     else{
        //         last=mid-1;
        //     }
       // }
       
    }
}
