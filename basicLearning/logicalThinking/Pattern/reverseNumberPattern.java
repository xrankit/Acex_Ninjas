package basicLearning.logicalThinking.Pattern;

public class reverseNumberPattern {

    public static void nNumberTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println("");
        }
    }
}
