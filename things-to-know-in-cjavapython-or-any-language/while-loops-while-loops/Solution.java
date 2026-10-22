import java.util.ArrayList;
import java.util.List;

public class WhileLoops {
    public static List<Integer> printNumbers(int n) {
        List<Integer> result = new ArrayList<>();
        int i = 1;
        while (i <= n) {
            result.add(i);
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        List<Integer> numbers = printNumbers(n);
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
