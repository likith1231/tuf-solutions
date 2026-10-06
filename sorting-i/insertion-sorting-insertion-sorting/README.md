# Insertion Sorting

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Sorting-I | **Difficulty:** Easy

## Approach
Iterate through the array from index 1 to n-1. For each element, store it as a key and compare it with elements before it, shifting elements that are greater than the key one position to the right until the correct position for the key is found, then insert the key there. This builds a sorted portion of the array incrementally from left to right.

## Complexity
- Time: O(N^2)
- Space: O(1)
