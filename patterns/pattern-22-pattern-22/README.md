# Pattern 22

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Patterns | **Difficulty:** Medium

## Approach
This is the classic concentric square (box) pattern. For a given size n, the output is a (2n-1) x (2n-1) grid. For each cell at row i and column j (0-indexed), compute the value as n - min(i, j, (2n-2-i), (2n-2-j)). This gives the distance from the nearest border of the current square ring, producing concentric decreasing squares from the outer border (value n) down to the center (value 1). Print the grid row by row with numbers separated by spaces.

## Complexity
- Time: O(n^2)
- Space: O(1)
