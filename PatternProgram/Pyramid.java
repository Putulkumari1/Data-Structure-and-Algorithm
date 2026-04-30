public class Pyramid {
    public static void main(String[] args) {
        int n = 5;

        //*******************************star pyramid******************************** */
        // outer loop for rows 
        // for(int i=1; i<=n; i++){

        //     //inner loop for spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //inner loop for columns
        //     for(int j=1; j<=2*i-1; j++){
                
        //     // condition for printing star and space 
        //        if(j==1 || i==n || j==2*i-1){
        //             System.out.print("*");
        //         }
        //         else{
        //            System.out.print(" ");
        //        }
        //     }
        //     System.out.println();


// ***********************************number pyramid******************************** */

    for(int i = 1; i <= n; i++) {

    // spaces
    for(int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }

    // increasing numbers
    for(int j = 1; j <= i; j++) {
        System.out.print(j);
    }

    // decreasing numbers
    for(int j = i - 1; j >= 1; j--) {
        System.out.print(j);
    }

    System.out.println();
}

    }
}
