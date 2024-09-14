public class sept_14 {
    public int longestSubarray(int[] nums) {
        int maxi = 0;
        for (int n : nums) {
            maxi = Math.max(maxi, n);
        }
        int ans = 0;
        int count = 0;
        for (int n : nums) {
            if (n == maxi) {
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        sept_14 obj = new sept_14();
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        System.out.println(obj.longestSubarray(nums));
    }
}