public class ransom {
    public boolean canConstruct(String ransomNote, String magazine) {
        int count[] = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            count[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--count[ransomNote.charAt(i) - 'a'] < 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        ransom r = new ransom();
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(r.canConstruct(ransomNote, magazine));
    }
}
