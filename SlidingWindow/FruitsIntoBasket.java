import java.util.HashMap;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int Fruits[]={1,2,1,2,2,3,1,2};
        //use hashmap 
        HashMap<Integer, Integer> Map = new HashMap<>();

        int left = 0;
        int MaxLength = 0;

        for(int right = 0;right<Fruits.length;right++){
            Map.put(Fruits[right], Map.getOrDefault(Fruits[right],0)+1);

            while(Map.size()>2){
                Map.put(Fruits[left], Map.get(Fruits[left])-1);
                if(Map.get(Fruits[left])==0){
                    Map.remove(Fruits[left]);
                }
                left++;

            }

            MaxLength=Math.max(MaxLength, right-left+1);
        }
        System.out.println("maximum fruits are: "+MaxLength);
    }
}
