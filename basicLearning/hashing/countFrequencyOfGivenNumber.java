package basicLearning.hashing;

import java.util.HashMap;
import java.util.Map;

public class countFrequencyOfGivenNumber {
    public static int[] countFrequency(int n, int x, int[] nums) {
        // int[] frequencyArray = new int[n];
        // for (int num : nums) {
        // frequencyArray[num - 1]++;
        // }

        // return frequencyArray;

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[n];
        for (int i = 1; i <= n; i++) {
            result[i - 1] = frequencyMap.getOrDefault(i, 0);
        }

        return result;
    }
}
