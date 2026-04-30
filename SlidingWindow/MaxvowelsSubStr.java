public class MaxvowelsSubStr {
    public static void main(String[] args) {
        //find max number of vowels in substring 
      String s = "aeiousuweia";
      int k = 3;

      int left =0;
      int count = 0;
      int maxVowel = 0;

      for(int right = 0; right<s.length();right++){
        //add element 
        if(isVowel(s.charAt(right))){
            count++;
        }
            // STEP 2: check window size
            if(right - left + 1 == k){

                // STEP 3: calculate result
                maxVowel = Math.max(maxVowel, count);

                // STEP 4: remove left element
                if(isVowel(s.charAt(left))){
                    count--;
                }

                // STEP 5: slide window
                left++;
            }
        }

        System.out.println("Max vowels = " + maxVowel);
    }

    static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

      }
    
