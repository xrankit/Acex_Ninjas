package basicLearning.recursion;

import java.util.*;

public class factorialOfNumberLessThanTheNumber {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> result = new ArrayList<>();

        long fact = 1;
        long i = 1;

        while (fact <= n) {
            result.add(fact);
            i++;
            fact *= i;
        }

        return result;
    }
}
