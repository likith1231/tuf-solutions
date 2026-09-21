# Detect Loop in Linked List

**Source:** https://takeuforward.org/data-structure/detect-a-cycle-in-a-linked-list/ | **Topic:** linked-list | **Difficulty:** Easy

## Approach
Use Floyd's Cycle Detection algorithm (two-pointer technique) with slow and fast pointers. Move slow pointer by one step and fast pointer by two steps. If there is a loop in the linked list, the fast pointer will eventually meet the slow pointer inside the loop. If the fast pointer reaches null (end of list), there is no loop.

## Complexity
- Time: O(N)
- Space: O(1)
