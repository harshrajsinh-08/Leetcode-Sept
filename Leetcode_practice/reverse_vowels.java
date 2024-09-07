public class reverse_vowels {
    public String reverseVowels(String s) {
        boolean[] v = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            v[c] = true;
        }
        char[] cs = s.toCharArray();
        int i = 0, j = cs.length - 1;
        while (i < j) {
            while (i < j && !v[cs[i]]) {
                i++;
            }
            while (i < j && !v[cs[j]]) {
                j--;
            }
            if (i < j) {
                char t = cs[i];
                cs[i] = cs[j];
                cs[j] = t;
                i++;
                j--;
            }
        }
        return String.valueOf(cs);
    }
    public static void main(String[] args) {
        reverse_vowels rv = new reverse_vowels();
        String s = "hello";
        System.out.println(rv.reverseVowels(s));
    }
}
