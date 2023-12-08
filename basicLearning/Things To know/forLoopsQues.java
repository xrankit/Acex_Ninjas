import java.util.Scanner;

public class forLoopsQues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 1;
        int d = 1;
        int alpha = first + d;
        int next = 0;
        while (n > 2) {
            next = d + first;
            first = d;
            d = next;
            n--;
        }
        if (n == 1)
            System.out.println(first);
        else if (n == 2)
            System.out.println(d);
        else if (n >= 3)
            System.out.println(next);
    }
}
