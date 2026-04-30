public class StarSquare {
    public static void main(String[] args) {
        // square size 
    
        //******* */
        //********* */

        int n = 5;
// outer loop for rows 
        for(int i=1; i<=n; i++){

            //inner loop for columns
            for(int j=1; j<=n; j++){
                
            // condition for printing star and space 
               if(i==1 || i==n || j==1 || j==n){
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
