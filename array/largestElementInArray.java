
import java.util.Arrays;

public class largestElementInArray {
    static int largestElement(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[arr.length - 1];

    }
}
