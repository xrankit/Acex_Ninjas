package basicLearning.knowbBasicMathematics;

public class sumOfAllDivisiorsCode {
    public static int sumOfAllDivisors(int n) {
        int sumdiv = 0;
        for (int i = 1; i <= n; i++) {
            int pSumDiv = i;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    pSumDiv += j;
                }
            }
            sumdiv += pSumDiv;
        }
        return sumdiv;
    }
}
