package basicLearning.knowbBasicMathematics;

public class reverseBitsCodeStudio {
    public static long reverseBits(long n) {
        // String str = Long.toBinaryString(n);
        // String nstr = "";
        // char ch;
        // // while (n > 0) {
        // // if ((n & 1) == 1)
        // // str += '1';
        // // else // 0
        // // str += '0';
        // // n >>= 1;
        // // }
        // char[] try1 = str.toCharArray();

        // for (int i = try1.length - 1; i >= 0; i--){
        // nstr= nstr+try1[i];
        // }
        // long reverseInteger = Long.parseLong(nstr);

        // return reverseInteger;

        long result = 0;
        for (int i = 0; i < 32; i++) {

            result = (result << 1) | (n & 1);

            n >>= 1;
        }
        return result;
    }
}
