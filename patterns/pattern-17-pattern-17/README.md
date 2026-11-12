# Pattern 17

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Patterns | **Difficulty:** Easy

## Approach
For each row i from 0 to n-1, first print (n-1-i) leading spaces. Then print characters from 'A' up to 'A'+i in ascending order, followed by characters from 'A'+i-1 down to 'A' in descending order, forming a diamond-shaped alphabet pattern centered pyramid. This uses nested loops: an outer loop for rows and inner loops for spaces, ascending letters, and descending letters.

## Complexity
- Time: O(N^2)
- Space: O(1)
