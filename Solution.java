public class Solution {
    public static void main(String args[]) {
        int num = 121;
        isPalindrome(num);
    }

    public static boolean isPalindrome(int x) {
        String pivot = x + "", left = "", right = "";
        int tam = (pivot.length() / 2);
        for (int i = 0; i < tam; i++) {
            left = left + pivot.charAt(i);
        }
        for (int i = pivot.length() - 1; i >= pivot.length() - tam; i--) {
            right = right + pivot.charAt(i);
        }
        if (left.equals(right)) {
            return true;
        } else {
            return false;
        }
        // return false;
    }
}