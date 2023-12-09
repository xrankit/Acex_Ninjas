package basicLearning.knowbBasicMathematics;

public class isPrimeNumberCode {
    public static String isPrime(int num) {
        if (num <= 1) {
            return "NO";
        } else {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return "NO";
                }
            }
            return "YES";
        }
    }
}
