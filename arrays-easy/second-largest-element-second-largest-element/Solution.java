import java.util.Arrays;

public class SecondLargestElement {

    public static int secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {10, 10, 10};
        int[] arr3 = {5, 5, 4, 4, 3};
        int[] arr4 = {7};

        System.out.println("Array: " + Arrays.toString(arr1) + " -> Second Largest: " + secondLargest(arr1));
        System.out.println("Array: " + Arrays.toString(arr2) + " -> Second Largest: " + secondLargest(arr2));
        System.out.println("Array: " + Arrays.toString(arr3) + " -> Second Largest: " + secondLargest(arr3));
        System.out.println("Array: " + Arrays.toString(arr4) + " -> Second Largest: " + secondLargest(arr4));
    }
}
