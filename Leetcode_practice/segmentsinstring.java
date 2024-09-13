public class segmentsinstring {
    public int countSegments(String s) {
        int ans = 0;
        String s1[] = s.split(" ");
        for(String temp: s1){
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        segmentsinstring obj = new segmentsinstring();
        System.out.println(obj.countSegments("Hello ,my name is Harshraj"));
    }
}
