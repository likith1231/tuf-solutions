# Next Greater Element

**Source:** https://takeuforward.org/data-structure/next-greater-element-using-stack/ | **Topic:** stack-queue | **Difficulty:** Medium

## Approach
Traverse the array from right to left while maintaining a monotonic decreasing stack of candidate 'next greater' values. For each element, pop values from the stack that are less than or equal to the current element (they cannot be the next greater for any earlier element), then the top of the stack (if any) is the next greater element; otherwise assign -1. Push the current element onto the stack before moving to the previous index.

## Complexity
- Time: O(N)
- Space: O(N)
