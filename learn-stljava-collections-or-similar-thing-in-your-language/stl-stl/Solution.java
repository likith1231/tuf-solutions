import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Stl {

    public List<Integer> demonstrateArrayList(int[] values) {
        List<Integer> list = new ArrayList<>();
        for (int v : values) {
            list.add(v);
        }
        Collections.sort(list);
        return list;
    }

    public Set<Integer> demonstrateHashSet(int[] values) {
        Set<Integer> set = new HashSet<>();
        for (int v : values) {
            set.add(v);
        }
        return set;
    }

    public Map<Integer, Integer> demonstrateHashMap(int[] values) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int v : values) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        return map;
    }

    public List<Integer> demonstrateStack(int[] values) {
        Stack<Integer> stack = new Stack<>();
        for (int v : values) {
            stack.push(v);
        }
        List<Integer> result = new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }

    public List<Integer> demonstrateQueue(int[] values) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int v : values) {
            queue.offer(v);
        }
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }
        return result;
    }

    public boolean containsValue(Set<Integer> set, int target) {
        return set.contains(target);
    }

    public int getFrequency(Map<Integer, Integer> map, int key) {
        return map.getOrDefault(key, 0);
    }

    public static void main(String[] args) {
        Stl stl = new Stl();
        int[] values = {5, 3, 8, 3, 1, 9, 5, 2};

        List<Integer> sortedList = stl.demonstrateArrayList(values);
        System.out.println("Sorted ArrayList: " + sortedList);

        Set<Integer> uniqueSet = stl.demonstrateHashSet(values);
        System.out.println("HashSet (unique values): " + uniqueSet);
        System.out.println("Contains 8? " + stl.containsValue(uniqueSet, 8));

        Map<Integer, Integer> frequencyMap = stl.demonstrateHashMap(values);
        System.out.println("HashMap (frequency count): " + frequencyMap);
        System.out.println("Frequency of 5: " + stl.getFrequency(frequencyMap, 5));

        List<Integer> stackResult = stl.demonstrateStack(values);
        System.out.println("Stack pop order (LIFO): " + stackResult);

        List<Integer> queueResult = stl.demonstrateQueue(values);
        System.out.println("Queue poll order (FIFO): " + queueResult);
    }
}
