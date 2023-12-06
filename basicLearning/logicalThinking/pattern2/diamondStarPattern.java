package basicLearning.logicalThinking.pattern2;

public class diamondStarPattern {
    public static void nStarDiamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int m = n; m > 0; m--) {
            for (int j = 0; j < 2 * m - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");

            for (int k = 0; k < n - m + 1; k++) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
