public class licence {
    public String licenseKeyFormatting(String s, int k) {
      StringBuilder sb = new StringBuilder();
      int l = 0;
      for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) == '-')
          continue;
        if (l > 0 && l % k == 0){
          sb.append('-');
        }
        sb.append(Character.toUpperCase(s.charAt(i)));
        l++;
      }
      return sb.reverse().toString();
    }
    public static void main(String[] args) {
        licence obj = new licence();
        System.out.println(obj.licenseKeyFormatting("5F3Z-2e-9-w", 2));
    }
}
