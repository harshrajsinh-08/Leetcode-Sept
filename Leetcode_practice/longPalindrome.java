class longPalindrome {
    public int longestPalindrome(String s) {
        int cnt[] = new int[128];
        int n= s.length();
        for(int i = 0;i<n;i++){
            cnt[s.charAt(i)]++;
        }
        int ans = 0;
        for(int v:cnt){
            ans = ans+ (v/2) * 2;
        }
        ans+= ans<n ?1:0;
        return ans;
    }
    public static void main(String[] args) {
        longPalindrome s = new longPalindrome();
        System.out.println(s.longestPalindrome("abccccdd"));
    }
    
}