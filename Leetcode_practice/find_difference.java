public class find_difference {
    public char findTheDifference(String s, String t) {
        int temp = 0;
        for (int i = 0; i < t.length(); i++) {
            temp = temp + t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            temp = temp - s.charAt(i);
        }
        return (char) temp;
    }
    public static void main(String[] args) {
        find_difference f = new find_difference();
        String s = "abcd";
        String t = "abcde";
        System.out.print("The strings are: ");
        System.out.print(s+"\t");
        System.out.println(t);
        System.out.print("The extra character is: ");
        System.out.println(f.findTheDifference(s, t));
    }
}