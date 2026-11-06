# Pattern 11

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Patterns | **Difficulty:** Easy

## Approach
For each row i from 1 to n, determine a starting value (1 if the row number is odd, 0 if even). Then print i numbers in that row, toggling between 1 and 0 for each subsequent column. This creates a binary triangle pattern where values alternate both across rows and within each row.

## Complexity
- Time: O(N^2)
- Space: O(1)
