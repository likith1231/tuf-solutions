import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSums {

    public List<Integer> subsetSums(int[] arr) {
        List<Integer> result = new ArrayList<>();
        generate(0, 0, arr, result);
        Collections.sort(result);
        return result;
    }

    private void generate(int index, int currentSum, int[] arr, List<Integer> result) {
        if (index == arr.length) {
            result.add(currentSum);
            return;
        }
        generate(index + 1, currentSum + arr[index], arr, result);
        generate(index + 1, currentSum, arr, result);
    }

    public static void main(String[] args) {
        SubsetSums solver = new SubsetSums();
        int[] arr = {3, 1, 2};
        List<Integer> sums = solver.subsetSums(arr);
        System.out.println(sums);

        int[] arr2 = {5, 2, 1};
        List<Integer> sums2 = solver.subsetSums(arr2);
        System.out.println(sums2);
    }
}
