package basicLearning.knowbBasicMathematics;

public class isPalindromeLeetCode {
    public boolean isPalindrome(int x) {
        int orgNum = x;
        int revNum = 0;
        if (x > 0) {
            while (x != 0) {
                int rem = x % 10;
                revNum = revNum * 10 + rem;
                x = x / 10;
            }
        } else if (x < 0) {
            // x = x*(-1);
            // while(x!=0)
            // {
            // int rem = x%10;
            // revNum = revNum*10 + rem;
            // x = x / 10;
            // }
            // revNum = revNum*(-1);
            return false;
        }
        if (orgNum == revNum) {
            return true;
        } else {
            return false;
        }
    }
}
