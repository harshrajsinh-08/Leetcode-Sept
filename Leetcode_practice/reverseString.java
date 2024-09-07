import java.util.*;
public class reverseString {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; ++i, --j) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
        }
    }
    public static void main(String[] args) {
        reverseString rs = new reverseString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char[] s = str.toCharArray();
        rs.reverseString(s);
        System.out.print(s);
        sc.close();
    }
}
