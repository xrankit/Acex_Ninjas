package basicLearning.knowbBasicMathematics;

public class reverseIntegerLeetCode {
    public int reverse(int x) {
        int newNumber = 0;
        int prevRevNum = 0;
        if (x > 0) {
            while (x > 0) {
                int rem = x % 10;
                newNumber = newNumber * 10 + rem;
                if ((newNumber - rem) / 10 != prevRevNum) {
                    return 0;
                }
                prevRevNum = newNumber;
                x = x / 10;
            }
            return newNumber;
        } else if (x < 0) {
            x = x * (-1);
            while (x > 0) {
                int rem = x % 10;
                newNumber = newNumber * 10 + rem;
                if ((newNumber - rem) / 10 != prevRevNum) {
                    return 0;
                }
                prevRevNum = newNumber;
                x = x / 10;
            }
            return newNumber * (-1);
        }
        return 0;
    }
}
