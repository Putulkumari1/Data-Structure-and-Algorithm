
public class MissingArrayNum {
    public static void main(String[] args) {

       // find missing number in array
       int arr[] = {1, 2, 3, 5};

        int n = arr.length + 1; // because one number is missing

        int totalSum = n * (n + 1) / 2;

        int arrSum = 0;
        for(int i = 0; i < arr.length; i++){
            arrSum += arr[i];
        }

        int missing = totalSum - arrSum;

        System.out.println("Missing number is: " + missing);



    }
}
