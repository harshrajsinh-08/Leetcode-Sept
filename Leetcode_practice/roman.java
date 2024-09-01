class roman {
    public int romanToInt(String s) {
        int ans = 0;
        int crt, nxt;
        // XXXV
        for (int i = 0; i < s.length() - 1; i++) {
            crt = getValue(s.charAt(i));
            nxt = getValue(s.charAt(i + 1));
            if (nxt > crt) {
                ans -= crt;
            } else {
                ans += crt;
            }
        }
        
        return ans+getValue(s.charAt(s.length()-1));
    }

    public int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        roman sol = new roman();
        System.out.println(sol.romanToInt("III"));
    }
}