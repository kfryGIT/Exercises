public class Leetcode9 {
    //task
    //Given an integer x, return true if x is a palindrome, and false otherwise.
    //Input: x = 121 Output: true; Input: x = 123 Output: false;
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String t = new StringBuilder(s).reverse().toString();
        return s.equals(t);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(123));
    }
}
