public class _9_DecimalToBinary {
    public static int decimal2Binary(int num) {
        int a;
        int b = 1;
        int sum = 0;
        while (num != 0) {
            a = num % 2;
            sum += a * b;
            num /= 2;
            b = b * 10;
        }
        return sum;
    }
}
