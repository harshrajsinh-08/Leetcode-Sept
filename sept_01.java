class sept_01 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            int temp[][] = new int[0][0];
            return temp;
        }
        int arr[][] = new int[m][n];
        int i = 0, j = 0;
        for (int t : original) {
            arr[i][j++] = t;
            if (j > n) {
                j = 0;
                i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        sept_01 s = new sept_01();
        int original[] = { 1, 2, 3, 4 };
        int m = 2;
        int n = 2;
        int arr[][] = s.construct2DArray(original, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}