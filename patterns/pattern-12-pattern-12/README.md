# Pattern 12

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Patterns | **Difficulty:** Easy

## Approach
For each row i from 1 to n, print the numbers 1 through i in increasing order, then insert a gap of spaces proportional to (n-i), then print the numbers i down to 1 in decreasing order. This creates a shape with two triangular number sequences separated by widening space in the middle, forming the classic 'hourglass-like' two-triangle numeric pattern.

## Complexity
- Time: O(N^2)
- Space: O(1) extra (excluding output buffer)
