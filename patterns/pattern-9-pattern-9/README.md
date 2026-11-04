# Pattern 9

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Patterns | **Difficulty:** Easy

## Approach
Print a diamond (rhombus) shape made of two stacked triangles. For each row i from 1 to n (top half), print (n-i) leading spaces followed by (2*i-1) stars. Then for each row i from n down to 1 (bottom half), repeat the same pattern of (n-i) spaces followed by (2*i-1) stars. This creates an upward triangle followed immediately by a downward triangle, forming a diamond/rhombus shape.

## Complexity
- Time: O(N^2)
- Space: O(1)
