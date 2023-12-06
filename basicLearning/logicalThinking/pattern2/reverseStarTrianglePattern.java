package basicLearning.logicalThinking.pattern2;

public class reverseStarTrianglePattern {
    public static void nStarTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");

            for (int k = 0; k < n - i + 1; k++) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
