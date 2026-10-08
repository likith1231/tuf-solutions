import java.util.Arrays;

public class RecursiveBubbleSort {

    public static void bubbleSort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, 3, 8, 4, 7};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        bubbleSort(arr, arr.length);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
