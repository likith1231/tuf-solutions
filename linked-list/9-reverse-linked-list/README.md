# Reverse Linked List

**Source:** https://takeuforward.org/data-structure/reverse-a-linked-list/ | **Topic:** linked-list | **Difficulty:** Easy

## Approach
Define a singly linked list node structure. To reverse the list, iterate through it while maintaining three pointers: previous, current, and next. At each step, store the next node, redirect the current node's pointer to the previous node, then advance previous and current forward. After traversal, previous becomes the new head. A recursive alternative is also provided which reverses the rest of the list first and then fixes the links.

## Complexity
- Time: O(N)
- Space: O(1) for iterative, O(N) for recursive (call stack)
