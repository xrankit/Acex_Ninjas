public class leftRotateArrayByOne {
    static int[] rotateArray(int[] arr, int n) {
        int temp[] = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
        return temp;
    }
}
