public class AraayInsertion {
    public static void main(String[] args) {

     int arr[] = {1,2,3,4,5};  //o/p-1,2,3,100,4
     int indexpos=3;
     int element = 100;

    //  for(int i=arr.length-1;i>pos-1;i--){
    //     arr[i]=arr[i-1];
    //  }
    //     arr[pos-1]=element;
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }

    //step 1 create new array 
       int newArr[]= new int [arr.length+1];

       //step2 use for lop

       for(int i=0;i<indexpos;i++){
         newArr[i]=arr[i];
       }

       //step 3 
       newArr[indexpos]=element;

       //step 4
       for(int i=indexpos;i<arr.length;i++){
        newArr[i+1]=arr[i];
       }

       // traverse array
       for(int no:newArr){
        System.out.print(no+" ");
       }
      }
    
}
