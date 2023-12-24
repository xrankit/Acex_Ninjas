import java.util.*;

public class removeDuplicatesFromArray {
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr.get(i));
        }
        arr.clear();
        arr.addAll(set);

        return set.size();
    }
}
