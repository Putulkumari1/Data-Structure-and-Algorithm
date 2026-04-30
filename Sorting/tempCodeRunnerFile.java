
    public static void main(String[] args) {
        int arr[]={1,5,3,7,5,9};
        // sort array in ascending order  using bubble sort
        int n = arr.length;
        for(int i = 0; i<n-1;i++){
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){


                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }