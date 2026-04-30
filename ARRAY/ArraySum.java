public class ArraySum {
    public static void main(String[] args) {
        int[] arr={4,6,7,8,9,3};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum of the array elements is: " + sum);
    }
}
