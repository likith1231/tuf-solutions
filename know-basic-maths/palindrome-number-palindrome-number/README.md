# Palindrome Number

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Know Basic Maths | **Difficulty:** Easy

## Approach
To check if an integer is a palindrome, first handle the edge case where negative numbers are never palindromes (due to the minus sign). Then reverse the digits of the number by repeatedly extracting the last digit using modulo 10 and building the reversed number, while removing the last digit from the original using integer division by 10. Use a long to store the reversed value to avoid overflow issues. Finally, compare the reversed number with the original number; if they are equal, the number is a palindrome.

## Complexity
- Time: O(log10(N))
- Space: O(1)
