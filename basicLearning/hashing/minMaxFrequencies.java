package basicLearning.hashing;

public class minMaxFrequencies {
    public static int[] getFrequencies(int[] arr) {
        // Write Your Code Here
        int n = arr.length;
        boolean visited[] = new boolean[n];
        int[] ret = new int[2];
        int maxFreq = 0, minFreq = n;
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > maxFreq) {
                ret[0] = arr[i];
                maxFreq = count;
            }
            if (count < minFreq) {
                ret[1] = arr[i];
                minFreq = count;
            }
            if (minFreq == maxFreq) {
                ret[1] = ret[0];
            }
        }
        return ret;
    }
}
