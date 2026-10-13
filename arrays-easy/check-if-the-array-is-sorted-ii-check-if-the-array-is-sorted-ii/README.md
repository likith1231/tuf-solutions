# Check if the Array is Sorted II

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Arrays-Easy | **Difficulty:** Easy

## Approach
An array is 'sorted after rotation' if it has at most one point where an element is greater than the next element, when traversed circularly (including the wrap-around pair last->first). Count such breakpoints; if the count is 0 or 1, the array can be considered sorted (possibly after rotating it back), otherwise it cannot.

## Complexity
- Time: O(N)
- Space: O(1)
