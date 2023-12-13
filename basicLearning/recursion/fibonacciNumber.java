package basicLearning.recursion;

public class fibonacciNumber {
    public static int[] generateFibonacciNumbers(int n) {
        if (n == 1) {
            return new int[] { 0 };
        } else {
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;

            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }

            return fib;
        }

    }
}
