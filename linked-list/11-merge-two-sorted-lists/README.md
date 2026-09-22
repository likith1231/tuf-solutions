# Merge Two Sorted Lists

**Source:** https://takeuforward.org/data-structure/merge-two-sorted-linked-lists/ | **Topic:** linked-list | **Difficulty:** Easy

## Approach
Use a dummy node and two pointers to traverse both lists simultaneously, comparing node values and linking the smaller node to the merged list. Continue until one list is exhausted, then attach the remaining nodes of the other list.

## Complexity
- Time: O(N + M)
- Space: O(1)
