# Recursive Insertion Sort

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Sorting-II | **Difficulty:** Easy

## Approach
Use recursion to sort the array: recursively sort the first n-1 elements, then insert the nth element into its correct position among the sorted elements using another recursive helper function that shifts elements greater than the key one position to the right.

## Complexity
- Time: O(N^2)
- Space: O(N)
