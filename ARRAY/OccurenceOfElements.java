public class OccurenceOfElements {
    public static void main(String[] args) {
        int[] arr = {2,1,1,5,2,1};
        int target = 1;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("The number of occurrences of " + target + " is: " + count);
    }
}
