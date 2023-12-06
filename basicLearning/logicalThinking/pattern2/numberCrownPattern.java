package basicLearning.logicalThinking.pattern2;

public class numberCrownPattern {
    public static void numberCrown(int n) {
        int sp = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int k = 1; k <= sp; k++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
            sp = sp - 2;
        }
    }
}
