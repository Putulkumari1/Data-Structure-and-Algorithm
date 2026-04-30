public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,4};
        int slow = 0;
//it is only use for sorted array and use slow and fast techniques

        for(int fast = 1; fast<arr.length;fast++){
            if(arr[fast]!= arr[slow]){
                slow++;
                arr[slow]=arr[fast];

            }
        }
        for(int i = 0; i<=slow; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
