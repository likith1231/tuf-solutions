# Count all Digits of a Number

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Know Basic Maths | **Difficulty:** Easy

## Approach
Take the absolute value of the number, then repeatedly divide it by 10, incrementing a counter each time, until the number becomes 0. Special case: if the input number is 0, the count of digits is 1.

## Complexity
- Time: O(log10(N))
- Space: O(1)
