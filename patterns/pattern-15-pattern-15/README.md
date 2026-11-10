# Pattern 15

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Patterns | **Difficulty:** Easy

## Approach
The pattern is a solid rhombus made of stars. For an input size n, print n rows where each row contains exactly n stars separated by spaces, preceded by (n-i) leading spaces (i being the current row number starting from 1). As the row number increases, the leading spaces decrease, shifting the rhombus to the left while keeping the same number of stars per row, producing a slanted solid rhombus shape.

## Complexity
- Time: O(N^2)
- Space: O(1)
