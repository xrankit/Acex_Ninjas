package basicLearning.recursion;

public class isPalindromeString {
    public static boolean isPalindrome(String s) {
        // int l = str.length();
        // for(int i =0;i<l/2;i++)
        // {
        // if((str.charAt(i)== str.charAt(l-i-1) ))
        // {
        // return true;
        // }else{
        // return false;
        // }
        // }
        // return false;
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left), r = s.charAt(right);
            if (!Character.isLetterOrDigit(l))
                left++;
            else if (!Character.isLetterOrDigit(r))
                right--;
            else if (Character.toLowerCase(l) != Character.toLowerCase(r))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}
