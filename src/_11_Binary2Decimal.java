public class _11_Binary2Decimal {
    public static int binary2decimal(int num) {
        int decimal = 0;
        int n = 0;
        while (true) {
            if (num == 0) {
                break;
            } else {
                int temp = num % 10;
                decimal += (int) (temp * Math.pow(2, n));
                num = num / 10;
                n++;
            }
        }
        return decimal;
    }
}
