public class Unio {
    public static void task01() {
        Integer[] a = { 35, 42, 23 };
        Integer[] b = { 27, 42, 51, 23 };
        Integer[] c = new Integer[7];
        int n = a.length;
        int m = b.length;
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        int k = n;
        for (int j = 0; j < m; j++) {
            int i = 0;
            while (i < n && b[j] != a[i]) {
                i++;
            }
            if (i >= n) {
                c[k] = b[j];
                k++;
            }
        }
        for (Integer num : c) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
