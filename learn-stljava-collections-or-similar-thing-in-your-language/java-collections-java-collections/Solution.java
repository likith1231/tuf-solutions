import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;

public class JavaCollections {

    public static List<Integer> getUniqueSorted(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        List<Integer> uniqueList = new ArrayList<>(set);
        Collections.sort(uniqueList);
        return uniqueList;
    }

    public static Map<Integer, Integer> getFrequencyMap(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        return freqMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> uniqueSorted = getUniqueSorted(arr);
        Map<Integer, Integer> freqMap = getFrequencyMap(arr);

        StringBuilder sb = new StringBuilder();
        sb.append("Unique Sorted Elements: ");
        for (int val : uniqueSorted) {
            sb.append(val).append(" ");
        }
        System.out.println(sb.toString().trim());

        System.out.println("Frequencies:");
        for (int val : uniqueSorted) {
            System.out.println(val + " -> " + freqMap.get(val));
        }

        scanner.close();
    }
}
