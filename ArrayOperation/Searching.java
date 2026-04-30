public class Searching {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int element = 40;
        boolean isFound=false;
        //leniar search

        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                System.out.println("Element found at "+i+" index");
                isFound=true;
            }
        }
        if(!isFound){
            System.out.println("Element not found");
        }
    }
}
