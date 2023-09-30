public class _9_PrintSquare {
    public static void printSquare(int rowColumn) {
        for (int i = 0; i < rowColumn; i++) {
            for (int j = 0; j < rowColumn; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
