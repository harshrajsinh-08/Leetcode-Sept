import java.util.*;

class sept_05 {
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
        sept_05 sol = new sept_05();
        int[] ans = sol.missingRolls(rolls, mean, n);
        for (int i : ans) {
            System.out.print(i + " ");
        }
        
    }
}