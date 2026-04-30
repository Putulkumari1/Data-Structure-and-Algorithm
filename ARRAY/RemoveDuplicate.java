//import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,3,2,4};

        //methods 1 using two loops
        System.out.println("the duplicate array ");
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]&&(i!=j)){      //condition 
                    System.out.println(arr[i]+"");
                }
            }

        }
        


    }
}
