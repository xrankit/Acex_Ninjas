package basicLearning.logicalThinking.pattern2;

public class alphaRampPattern {
    public static void alphaRamp(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (int) ('A' + i) + " ");
            }
            System.out.println();
        }

    }
}
