public class SumOFNumAtEvenIndice {
    //using function
    int sumOfNumbAtEvenIndices(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,89};
        //create object
        SumOFNumAtEvenIndice obj=new SumOFNumAtEvenIndice();
       // /System.out.println("the sum of numbers at even indices is: "+obj.sumOfNumbAtEvenIndices(arr))
       ///print index number at even indices also
       System.out.println("Sum of numbers at even indices: "+obj.sumOfNumbAtEvenIndices(arr));
         for(int i=0;i<arr.length;i++){
          if(i%2==0){
                System.out.println("the index number at even indices is: "+i+" and the value is: "+arr[i]);
          }
         }
    }
}
