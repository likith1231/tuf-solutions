# Reverse a number

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Know Basic Maths | **Difficulty:** Easy

## Approach
To reverse a number, repeatedly extract the last digit of the number using modulo 10, append it to a result variable (building the reversed number digit by digit), and remove the last digit from the original number using integer division by 10. Continue until the number becomes 0. Handle negative numbers by preserving the sign and reversing the absolute value.

## Complexity
- Time: O(log10(N)) where N is the input number, since the number of iterations equals the number of digits in N
- Space: O(1) as only a constant amount of extra space is used
