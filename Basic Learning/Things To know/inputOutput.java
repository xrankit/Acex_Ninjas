import java.util.Scanner;

public class inputOutput {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (Character.isLowerCase(ch)) {
            System.out.print("0");
        } else if (Character.isUpperCase(ch)) {
            System.out.print("1");
        } else {
            System.out.print("-1");
        }
    }
}