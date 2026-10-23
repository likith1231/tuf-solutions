public class FunctionsPassByReferenceAndValue {

    static void modifyPrimitive(int value) {
        value = value + 100;
    }

    static void modifyArray(int[] arr) {
        if (arr.length > 0) {
            arr[0] = arr[0] + 100;
        }
    }

    static void reassignArray(int[] arr) {
        arr = new int[]{999, 999, 999};
    }

    static class Box {
        int value;
        Box(int value) {
            this.value = value;
        }
    }

    static void modifyObjectField(Box box) {
        box.value = box.value + 100;
    }

    static void reassignObject(Box box) {
        box = new Box(999);
    }

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Before modifyPrimitive: " + number);
        modifyPrimitive(number);
        System.out.println("After modifyPrimitive: " + number);

        int[] numbers = {1, 2, 3};
        System.out.println("Before modifyArray: " + numbers[0]);
        modifyArray(numbers);
        System.out.println("After modifyArray: " + numbers[0]);

        int[] numbers2 = {1, 2, 3};
        System.out.println("Before reassignArray: " + numbers2[0]);
        reassignArray(numbers2);
        System.out.println("After reassignArray: " + numbers2[0]);

        Box box = new Box(5);
        System.out.println("Before modifyObjectField: " + box.value);
        modifyObjectField(box);
        System.out.println("After modifyObjectField: " + box.value);

        Box box2 = new Box(5);
        System.out.println("Before reassignObject: " + box2.value);
        reassignObject(box2);
        System.out.println("After reassignObject: " + box2.value);
    }
}
