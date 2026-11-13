# Pattern 18

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Patterns | **Difficulty:** Easy

## Approach
For a given number of rows n, iterate from i=1 to n. For each row, print characters starting from the letter corresponding to (n-i) up to (n-1) using ASCII arithmetic, so each row has i characters ending at the same final letter, forming a right-aligned alphabet triangle.

## Complexity
- Time: O(N^2)
- Space: O(1)
