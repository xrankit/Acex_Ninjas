package basicLearning.knowbBasicMathematics;

import java.util.Scanner;

public class ArmstringNumbersCodeStudio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orgNum = n;
        int digits = 0;
        int sum = 0;
        while (n > 0) {
            n = n / 10;
            digits++;

        }
        while (n != 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, digits);
            n = n / 10;
        }

        if (sum == orgNum) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }

    }
}
