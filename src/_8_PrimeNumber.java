import java.util.ArrayList;

public class _8_PrimeNumber {
    public static ArrayList<Integer> primeNumber(int num) {
        ArrayList<Integer> primesBeforeNum = new ArrayList<>();
        if (num == 1 || num == 0) {
            return null;
        } else {
            for (int i = 2; i < num; i++) {
                boolean flag = true;
                aa:
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break aa;
                    }

                }
                if (flag) {
                    primesBeforeNum.add(i);
                }
            }
        }
        primesBeforeNum.add(num);
        return primesBeforeNum;
    }
}
