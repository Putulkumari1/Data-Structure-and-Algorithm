public class ZeroToLast {
    public static void main(String[] args) {
        int[] arr = {1,0,3,0,5,6};
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count] = arr[i];
                count++;
            }
        }
        while(count<arr.length){
            arr[count] = 0;
            count++;
        }
        System.out.print("The array after moving zeros to the end is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
