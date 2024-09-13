public class repeatedsub {
    public boolean repeatedSubstringPattern(String s) {
        String s1 = s + s;
        boolean ans = s1.substring(1, s1.length() - 1).contains(s);
        return ans;
    }
    public static void main(String[] args) {
        repeatedsub obj = new repeatedsub();
        System.out.println(obj.repeatedSubstringPattern("ababab"));
    }
}
