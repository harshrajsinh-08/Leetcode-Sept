public class reverse_Excel {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (int i = 0; i < columnTitle.length(); ++i) {
            ans = ans * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        reverse_Excel obj = new reverse_Excel();
        System.out.println(obj.titleToNumber("ZY"));
    }
}
