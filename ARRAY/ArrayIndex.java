public class ArrayIndex {
    public static void main(String[] args) {
        int[] arr ={1,3,5,6,7,9};
        int sum = 16;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==sum){
                    System.out.println("the numbers are: " + i + " and " + j);
                }
            }
        }
    }
}
