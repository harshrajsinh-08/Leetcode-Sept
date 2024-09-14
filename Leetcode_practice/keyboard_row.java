import java.util.*;

public class keyboard_row {
    public String[] findWords(String[] words) {
        String s = "12210111011122000010020202";
        List<String> ans = new ArrayList<>();
        for (String w : words) {
            String t = w.toLowerCase();
            char x = s.charAt(t.charAt(0) - 'a');
            boolean check = true;
            for (char c : t.toCharArray()) {
                if (s.charAt(c - 'a') != x) {
                    check = false;
                    break;
                }
            }
            if (check) {
                ans.add(w);
            }
        }
        return ans.toArray(new String[0]);
    }
    public static void main(String[] args) {
        keyboard_row obj = new keyboard_row();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(obj.findWords(words)));
    }
}