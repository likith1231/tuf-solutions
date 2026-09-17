# Binary Search

**Source:** https://takeuforward.org/data-structure/binary-search-explained/ | **Topic:** binary-search | **Difficulty:** Easy

## Approach
Use the classic iterative binary search algorithm. Maintain two pointers, low and high, representing the current search boundaries in the sorted array. Compute the middle index and compare the middle element with the target. If they are equal, return the index. If the middle element is smaller than the target, search the right half by moving low to mid+1. If the middle element is larger, search the left half by moving high to mid-1. Repeat until low exceeds high, at which point the target is not present, and return -1.

## Complexity
- Time: O(log N)
- Space: O(1)
