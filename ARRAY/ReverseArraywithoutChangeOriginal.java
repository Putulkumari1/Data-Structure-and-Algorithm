public class ReverseArraywithoutChangeOriginal {
    //using function
    int [] reverse (int arr[]){
        int[] rev = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rev[i]=arr[arr.length-1-i];
        }
        return rev;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        //create object to call function
        ReverseArraywithoutChangeOriginal obj=new ReverseArraywithoutChangeOriginal();
        int [] rev=obj.reverse(arr);

        System.out.println("the original array is ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("the reversed array is ");
        for(int i=0;i<rev.length;i++){
            System.out.print(rev[i]+" ");
        }
    }
}
