package basicLearning.knowbBasicMathematics;

public class palindromeNumberCodeStudio {
    public static boolean palindromeNumber(int n) {
        int orgNum = n;
        int revNum = 0;
        while (n != 0) {
            int rem = n % 10;
            revNum = revNum * 10 + rem;
            n = n / 10;
        }
        if (orgNum == revNum) {
            return true;
        } else {
            return false;
        }
    }
}
