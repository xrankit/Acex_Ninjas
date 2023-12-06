package basicLearning.logicalThinking.pattern2;

public class reverseLetterTriangle {
    public static void nLetterTriangle(int n) {

        for (int i = n; i > 0; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");

            }
            System.out.println("");
        }
    }
}
