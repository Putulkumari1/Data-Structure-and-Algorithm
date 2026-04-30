public class SecondSmall {
    public static void main(String[] args) {
        int[] arr={5,6,7,1,3,4};

        // int min = arr[0];
        // int secondMin = arr[0];

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<min){
        //         secondMin=min;
        //         min=arr[i];
        //     }
        //     else if(arr[i]<secondMin && arr[i]!=min){
        //         secondMin=arr[i];
        //     }
        // }
        // System.out.println("The second smallest number is: " + secondMin);

        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }

        }

        System.out.println();
    }
}

