# Pattern 19

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Patterns | **Difficulty:** Easy

## Approach
Print a pattern of n rows for the top half and n-1 rows for the bottom half. For each row the number of stars on each side increases from 1 to n and then decreases back to 1, while the gap between the two groups of stars is calculated as 2*(n-stars) spaces, creating a symmetric hourglass-like shape with a gap in the middle.

## Complexity
- Time: O(N^2)
- Space: O(1)
