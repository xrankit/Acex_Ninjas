package basicLearning.recursion;

public class printNameNTimes {
    public static void printNtimes(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print("Coding Ninjas ");
        n = n - 1;
        printNtimes(n);
    }
}
