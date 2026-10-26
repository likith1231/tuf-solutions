# Hard

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Build-up Logical Thinking | **Difficulty:** Easy

## Approach
This solution addresses a classic pattern-printing problem from the Strivers A2Z 'Build-up Logical Thinking' series, specifically the Butterfly Pattern. For a given number of rows N, the pattern consists of two halves: the upper half prints increasing numbers of stars on the left, a gap of spaces in the middle, and increasing numbers of stars on the right (mirrored), then the lower half mirrors the upper half in reverse order. The algorithm uses nested loops: an outer loop for each row, and inner loops to print stars on the left side, spaces in the middle, and stars on the right side, then repeats this symmetrically for the bottom half.

## Complexity
- Time: O(N^2)
- Space: O(1)
