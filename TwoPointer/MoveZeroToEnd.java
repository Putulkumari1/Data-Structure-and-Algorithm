public class MoveZeroToEnd {
    public static void main(String[] args) {
        //same direction use slow and fast technique
        int [] arr = {0,1,2,0,4,5,0,6};
        int slow=0;
        for(int fast = 0; fast<arr.length; fast++){
            if(arr[fast]!=0){

            
            int temp = arr[slow];
            arr[slow] = arr[fast];
            arr[fast]=temp;
            slow++;
        }
    }
//for each loop
    for(int num : arr){
        System.out.print(num+ " ");
    }
    }
}
