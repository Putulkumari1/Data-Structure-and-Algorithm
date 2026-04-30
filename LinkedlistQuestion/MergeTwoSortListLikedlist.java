import java.util.Arrays;
import java.util.LinkedList;

public class MergeTwoSortListLikedlist {
public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(2, 4, 6));

        LinkedList<Integer> result = new LinkedList<>();

        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        // remaining elements
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        System.out.println(result);
    }
}




