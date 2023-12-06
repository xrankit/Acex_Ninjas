package basicLearning.logicalThinking.pattern2;

public class starTrianglePattern {
    public static void nStarTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
