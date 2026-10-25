# Easy and Medium

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Build-up Logical Thinking | **Difficulty:** Easy

## Approach
Since this problem corresponds to the 'Build-up Logical Thinking' section of the Striver A2Z DSA sheet, it covers a set of fundamental easy/medium logic-building exercises. I implemented a utility class containing solutions to the classic problems from that section: counting digits of a number, reversing a number, checking if a number is a palindrome, checking if a number is an Armstrong number, finding the GCD of two numbers using the Euclidean algorithm, and checking if a number is prime. Each method uses simple iterative arithmetic operations (modulo and division) to build logical thinking step by step, and the main method demonstrates each function with sample inputs.

## Complexity
- Time: O(log N) for digit-based operations (countDigits, reverseNumber, isPalindrome, isArmstrong), O(log(min(A,B))) for GCD, O(sqrt(N)) for isPrime
- Space: O(1) for all operations
