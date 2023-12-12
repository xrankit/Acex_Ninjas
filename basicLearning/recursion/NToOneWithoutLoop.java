package basicLearning.recursion;

public class NToOneWithoutLoop {

    public static int[] printNos(int x) {
        if (x <= 0) {
            return new int[0];
        }
        int[] arr = new int[x];

        fillArray(arr, x);
        return arr;
    }

    public static void fillArray(int[] arr, int n) {
        if (n == 0) {
            return;
        }
        arr[arr.length - n] = n;
        fillArray(arr, n - 1);
    }
}
