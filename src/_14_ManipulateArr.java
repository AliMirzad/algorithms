public class _14_ManipulateArr {
    public static void manipulateArr(int[] arr) {
        int odd = 0;
        int even = 0;
        int positive = 0;
        int negative = 0;
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                odd++;
            }
            if (arr[i] % 2 == 0) {
                even++;
            }
            if (arr[i] > 0) {
                positive++;
            }
            if (arr[i] < 0) {
                negative++;
            }
            if (arr[i] == 0) {
                zeros++;
            }
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);
        System.out.println("zeros = " + zeros);
    }
}
