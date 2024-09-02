class sept_02 {
    public int chalkReplacer(int[] chalk, int k) {
        long s = 0;
        for (int x : chalk) {
            s += x;
        }
        k %= s;
        for (int i = 0;; ++i) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }
    }
    public static void main(String[] args) {
        int[] chalk = {5,1,5};
        int k = 22;
        sept_02 obj = new sept_02();
        System.out.println(obj.chalkReplacer(chalk, k));
    }
}