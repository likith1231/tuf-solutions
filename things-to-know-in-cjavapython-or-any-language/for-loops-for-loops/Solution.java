import java.util.ArrayList;
import java.util.List;

public class ForLoops {
    public static List<Integer> generateSequence(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> sequence = generateSequence(n);
        for (int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
