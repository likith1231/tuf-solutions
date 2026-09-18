# Search in Rotated Sorted Array

**Source:** https://takeuforward.org/data-structure/search-element-in-a-rotated-sorted-array/ | **Topic:** binary-search | **Difficulty:** Medium

## Approach
Use modified binary search. At each step, compare mid element with target. Determine which half (left or right of mid) is sorted by comparing arr[low] with arr[mid]. If the left half is sorted, check if target lies within that range; if so, search left, else search right. If the right half is sorted, check if target lies within that range; if so, search right, else search left. Continue until target is found or search space is exhausted.

## Complexity
- Time: O(log N)
- Space: O(1)
