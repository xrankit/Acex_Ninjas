package basicLearning.knowbBasicMathematics;

public class countDigitsProb1 {
    public static int countDigits(int n) {
        int originalNumber = n;
        int k = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem != 0) {
                if (originalNumber % rem == 0) {
                    k++;
                }
            }
            n = n / 10;
        }
        return k;
    }

}
