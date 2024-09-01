public class palindrome {
    public static boolean isPalindrome(int n) {
        int org = n;
        int rev = 0;
        
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        
        return org == rev;
    }
    
}
