import java.util.*;

public class findUnion {
    public static List<Integer> sortedArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        // HashSet <Integer> s=new HashSet<>();
        // List <Integer> Union=new ArrayList<>();
        // for (int i = 0; i < n; i++)
        // s.add(a[i]);
        // for (int i = 0; i < m; i++)
        // s.add(b[i]);
        // for (int it: s)
        // Union.add(it);
        // return Union;
        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}
