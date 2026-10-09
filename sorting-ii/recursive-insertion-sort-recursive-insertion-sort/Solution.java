import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void sort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        sort(arr, n - 1);
        insert(arr, n - 1, arr[n - 1]);
    }

    private static void insert(int[] arr, int lastIndex, int key) {
        if (lastIndex >= 0 && arr[lastIndex] > key) {
            arr[lastIndex + 1] = arr[lastIndex];
            insert(arr, lastIndex - 1, key);
        } else {
            arr[lastIndex + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, -3, 8};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        sort(arr, arr.length);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
