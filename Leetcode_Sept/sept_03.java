class sept_03 {
    
    public int Lucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 'a'+1);
        }
        s = sb.toString();
        while (k-- > 0) {
            int t = 0;
            for (char c : s.toCharArray()) {
                t += c - '0';
            }
            s = String.valueOf(t);
        }
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        String s = "zbax";
        int k = 2;
        sept_03 obj = new sept_03();
        System.out.println(obj.Lucky(s, k));
    }
    
}