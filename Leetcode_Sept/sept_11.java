public class sept_11 {
    public int minBitFlips(int start, int goal) {
        int temp = start ^ goal;
        int ans = 0;
        while (temp != 0) {
            ans += temp & 1;
            temp = temp >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        sept_11 obj = new sept_11();
        System.out.println(obj.minBitFlips(8, 6));
    }
}