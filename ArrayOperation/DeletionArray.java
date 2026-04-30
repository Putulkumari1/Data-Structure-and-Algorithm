
public class DeletionArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int indexpos=2;

        //bigining , middle, Last

        //step 1 create new array
        int newArr[]= new int[arr.length-1];

        //step2 use for loop 
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(i==indexpos){
                continue;
            }

            //step3 copy element to new array
            newArr[j]=arr[i];
            j++;
        }

        // for each loop
        for(int no:newArr){{
            System.out.println(no+" ");
        }
        
        }

        
    }
}
