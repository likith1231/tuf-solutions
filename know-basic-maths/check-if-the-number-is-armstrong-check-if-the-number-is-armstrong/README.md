# Check if the Number is Armstrong

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Know Basic Maths | **Difficulty:** Easy

## Approach
Count the number of digits in the given number. Then for each digit, raise it to the power equal to the digit count and sum these values. If the sum equals the original number, it is an Armstrong number.

## Complexity
- Time: O(d^2) where d is the number of digits (since each power computation takes O(d) and there are d digits), effectively O(log10(N))
- Space: O(1)
