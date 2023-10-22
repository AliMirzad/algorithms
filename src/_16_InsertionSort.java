// Java program for implementation of Insertion Sort
public class _16_InsertionSort {
    /*Function to sort array using insertion sort*/
    public static void sort(int inpArr[]) {
        int n = inpArr.length;
        for (int i = 1; i < n; ++i) {
            int key = inpArr[i];
            int j = i - 1;

			/* Move elements of inpArr[0...i - 1], that are
			greater than key, to one position ahead
			of their current position */
            while (j >= 0 && inpArr[j] > key) {
                inpArr[j + 1] = inpArr[j];
                j = j - 1;
            }
            inpArr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n*/
    public static  void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
};
