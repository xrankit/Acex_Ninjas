package basicLearning.logicalThinking.pattern2;

public class hollowDiamondPattern {
    public static void main(String args[]) {
        // logic to print the first half pattern
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i + 1; j++) {
                System.out.print("*");
            }
            // loop calculates space
            for (int k = 1; k <= 2 * i - 2; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 10 - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // logic to print the second half pattern
        for (int i = 9; i >= 1; i--) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            // loop calculates space
            for (int k = 1; k <= (2 * i) - 2; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
