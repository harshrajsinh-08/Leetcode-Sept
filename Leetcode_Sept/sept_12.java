public class sept_12 {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] s = new boolean[26];
        for (char c : allowed.toCharArray()) {
            s[c - 'a'] = true;
        }
        int ans = 0;
        for (String w : words) {
            if (check(w, s)) {
                ans++;
            }
        }
        return ans;
    }

    public boolean check(String w, boolean[] s) {
        for (int i = 0; i < w.length(); i++) {
            if (!s[w.charAt(i) - 'a']) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        sept_12 obj = new sept_12();
        String allowed = "abc";
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        System.out.println(obj.countConsistentStrings(allowed, words));
    }
}
