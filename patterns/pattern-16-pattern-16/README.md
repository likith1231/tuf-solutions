# Pattern 16

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Patterns | **Difficulty:** Easy

## Approach
For n rows, in each row i (1-indexed), compute the character by adding (i-1) to 'A' to get the i-th letter of the alphabet, then print that same character i times separated by spaces, moving to a new line after each row.

## Complexity
- Time: O(N^2)
- Space: O(1)
