public class printNTim{
    public static void main(String[] args) {
        int n = 5;
        printNTimes(n);
    }

    public static void printNTimes(int n) {
        if (n <= 0) {
            return; // Base case: stop when n is 0 or negative
        }
        System.out.println("This is print number " + n);
        printNTimes(n - 1); // Recursive call with n decremented by 1
    }
}