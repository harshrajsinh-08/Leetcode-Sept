public class longest_uncommon {
    public int findLUSlength(String a, String b) {
        int ans = -1;
        if (!a.equals(b)) {
            ans = Math.max(a.length(), b.length());
        } else {
            return ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        longest_uncommon obj = new longest_uncommon();
        System.out.println(obj.findLUSlength("aba", "cdc"));
    }
}
