import java.util.Scanner;

public class whileLoopDivideAndQuotient {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            if (rem % 2 == 0) {
                even = even + rem;
            } else {
                odd = odd + rem;
            }
            n = n / 10;
        }
        System.out.print(even + " " + odd);
    }
}
