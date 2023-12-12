package basicLearning.recursion;

import java.util.Arrays;

public class oneToNWithoutLoop {

    public static int[] printNos(int x) {
        if (x <= 0) {
            return new int[0];
        }
        int[] prevResult = printNos(x - 1);
        int[] result = Arrays.copyOf(prevResult, prevResult.length + 1);
        result[prevResult.length] = x;
        return result;

    }
}
