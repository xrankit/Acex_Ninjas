package basicLearning.logicalThinking.Pattern;

public class nTrianglePattern {
    public static void nTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println("");
        }
    }
}
