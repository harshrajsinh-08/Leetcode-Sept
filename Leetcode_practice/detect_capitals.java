public class detect_capitals {
    class Solution {
        public boolean detectCapitalUse(String word) {
            int count = 0;
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    count++;
                }
            }
            return count == 0 || count == word.length()||
            (count == 1 && Character.isUpperCase(word.charAt(0)));
        }
    }
    public static void main(String[] args) {
        detect_capitals obj = new detect_capitals();
        Solution s = obj.new Solution();
        System.out.println(s.detectCapitalUse("USA"));
        System.out.println(s.detectCapitalUse("FlaG"));
        System.out.println(s.detectCapitalUse("Google"));
    }
}
