public class SortedOrNot {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6};
        boolean isSorted = true;

        //method 1 using a flag var to check if the array is sorted or not 

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println("Is the array sorted? " + isSorted);

        

    }
}
