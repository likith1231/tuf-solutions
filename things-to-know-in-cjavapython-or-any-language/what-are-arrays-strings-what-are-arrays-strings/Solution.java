import java.util.Arrays;

public class WhatAreArraysStrings {

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Sum of array elements: " + sumArray(numbers));
        System.out.println("Reversed array: " + Arrays.toString(reverseArray(numbers)));

        String text = "hello";
        System.out.println("String: " + text);
        System.out.println("Reversed string: " + reverseString(text));

        String palindromeCandidate = "madam";
        System.out.println("Is \"" + palindromeCandidate + "\" a palindrome? " + isPalindrome(palindromeCandidate));

        String nonPalindrome = "world";
        System.out.println("Is \"" + nonPalindrome + "\" a palindrome? " + isPalindrome(nonPalindrome));

        char[] charArray = text.toCharArray();
        System.out.print("Characters: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
