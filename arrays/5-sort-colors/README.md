# Sort Colors

**Source:** https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/ | **Topic:** arrays | **Difficulty:** Medium

## Approach
Use the Dutch National Flag algorithm with three pointers: low, mid, and high. Traverse the array with mid pointer. If element is 0, swap with low and increment both low and mid. If element is 1, just increment mid. If element is 2, swap with high and decrement high (without incrementing mid, since the swapped element needs to be checked). This sorts the array of 0s, 1s, and 2s in a single pass.

## Complexity
- Time: O(N)
- Space: O(1)
