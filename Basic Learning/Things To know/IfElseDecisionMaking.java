
public class IfElseDecisionMaking {
    public static String compareIfElse(int a, int b) {
        String small = "smaller";
        String greater = "greater";
        String equal = "equal";
        if (a < b) {
            return small;
        } else if (a > b) {
            return greater;
        } else {
            return equal;
        }
    }
}