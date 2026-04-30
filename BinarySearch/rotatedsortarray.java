public class rotatedsortarray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,1,2,3};
        int target = 2;

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){

            int mid = left + (right-left)/2;

            if(arr[mid] == target){
                System.out.println("Element found at index: " + mid);
                return;
            }

            if(arr[left] <= arr[mid]){   // left part sorted

                if(target >= arr[left] && target < arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }

            else{   // right part sorted

                if(target > arr[mid] && target <= arr[right])
                     left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
    }

