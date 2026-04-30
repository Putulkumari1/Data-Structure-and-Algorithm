public class InsertionAtLast {
    public static void main(String[] args) {
        int arr[]={10,20,40,50,60};
        int indexpos=arr.length;
        int element=200;

        //step 1 create new array
        int newArr[]= new int[arr.length+1];

        //step 2 use for loop
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
         }

         //step 3
         newArr[indexpos]=element;

         //traverse array
         for(int no:newArr){
            System.out.print(no+" ");
         }
    }
}
