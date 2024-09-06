import java.util.*;

class sept_04 {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int s = (n + m) * mean;
        for (int v : rolls) {
            s -= v;
        }
        if (s > n * 6 || s < n) {
            return new int[0];
        }
        int[] ans = new int[n];
        Arrays.fill(ans, s / n);
        for (int i = 0; i < s % n; ++i) {
            ans[i]+=1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] rolls = {3, 2, 4, 3};
        int mean = 5;
        int n = 3;
        sept_04 sol = new sept_04();
        int[] ans = sol.missingRolls(rolls, mean, n);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
//binary palindrome
//booth algo
//euclid
//karatsuba
//longest sequence of 1 after changing the kth bit 
// 
//block swap 
//max product subarray
//max sum of a hourglass in a matrix
//max eqb sum
//leader in an array
//majority element
//lexicographical first palindromic string


