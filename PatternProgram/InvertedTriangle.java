public class InvertedTriangle {
    public static void main(String[] args) {
        int n= 5;

        // outer loop for rows
        for(int i=n;i>=1;i--){

            // inner loop for columns
            for(int j=1;j<=i;j++){

                // condition for printing star and space
                if(j==1 || i==n || i==j){
                    System.out.print("*");
                }
                else{
                   System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
