import java.util.*;
class excel {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber != 0) {
            columnNumber--;
            res.append((char)('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        String r = res.reverse().toString();
        return r;
    }
    public static void main(String[] args) {
        excel obj = new excel();
        System.out.println(obj.convertToTitle(701));
    }
}