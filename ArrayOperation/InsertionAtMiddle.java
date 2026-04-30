public class InsertionAtMiddle {
    public static void main(String[] args) {
        int arr[]={10,20,40,50,60};
        int indexpos=2;
        int element=200;

        //step 1 create new array
        int newArr[]= new int[arr.length+1];

        //step 2 use for loop
        for(int i=0;i<indexpos;i++){
            newArr[i]=arr[i];
         }

         //step 3
         newArr[indexpos]=element;

         //step 4 

         for(int i=indexpos;i<arr.length;i++){
            newArr[i+1]=arr[i];
         }

         //traverse array
         for(int no:newArr){
            System.out.print(no+" ");
         }
    }
}
