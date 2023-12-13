package basicLearning.recursion;

public class reverseTheArrayRecursion {

    public static int[] reverseArray(int n, int[] nums) {
        int temp = 0;
        for (int i = 0; i < n / 2; i++) {
            temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
        return nums;
    }
}
