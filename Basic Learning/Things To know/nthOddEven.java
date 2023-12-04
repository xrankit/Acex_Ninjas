import java.util.Scanner;

public class nthOddEven {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                even = even + n;
            } else {
                odd = odd + n;
            }

            n--;
        }

        if (n > 0) {
            System.out.print(even + " " + odd);
        } else {
            System.out.println("0" + " " + "0");
        }

    }
}
