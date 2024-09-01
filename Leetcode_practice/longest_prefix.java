class longest_prefix {
    public String lcp(String[] str) {
        int n = str.length;
        for (int i = 0; i < str[0].length(); ++i) {
            for (int j = 1; j < n; ++j) {
                if (str[j].length() <= i || str[j].charAt(i) != str[0].charAt(i)) {
                    return str[0].substring(0, i);
                }
            }
        }
        return str[0];
    }

    public static void main(String[] args) {
        longest_prefix s = new longest_prefix();
        String[] str = { "flower", "flow", "flight" };
        System.out.println(s.lcp(str));
    }
}