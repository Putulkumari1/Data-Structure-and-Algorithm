public class squareroot {
    public static void main(String[] args) {
        int n = 20;

        int left = 1;
        int right = n;
        int ans = 0;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(mid * mid == n){
                ans = mid;
                break;
            }

            if(mid * mid < n){
                ans = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        System.out.println("Square root = " + ans);
    }
}
    
