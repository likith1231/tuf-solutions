# Recursive Bubble Sort

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Sorting-II | **Difficulty:** Easy

## Approach
Implement bubble sort recursively. The recursive function handles an array of size n: it performs one pass of bubble sort pushing the largest element to the end (index n-1), then recursively calls itself on the remaining array of size n-1. The base case is when n <= 1, at which point the array is already sorted.

## Complexity
- Time: O(N^2)
- Space: O(N) due to recursion stack
