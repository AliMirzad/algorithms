public class _13_SingleRepeatElm {
    public static int singleRepeatElm(int[] arr) {
        int counter = 0;
        int single = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (counter < 2) {
                single = arr[i];
            }
            counter = 0;
        }
        return single;
    }
}
