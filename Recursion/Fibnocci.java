public class Fibnocci {
//     eample 1:
// Input: N = 5
// Output: 0 1 1 2 3 5
// Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

public void fibonacciNum(int n){
    int a = 0;
    int b = 1;
    for(int i = 0; i <= n; i++){
        System.out.print(a + " ");
        int nextNum = a + b;
        a = b;
        b = nextNum;
       
    }

}
public static void main(String[] args) {
    Fibnocci f = new Fibnocci();
    int n = 5;
    f.fibonacciNum(n);

}
}
