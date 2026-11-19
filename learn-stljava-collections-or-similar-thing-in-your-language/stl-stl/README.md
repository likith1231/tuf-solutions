# STL

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Learn STL/Java-Collections or similar thing in your language | **Difficulty:** Easy

## Approach
The problem asks to demonstrate usage of Java Collections Framework (equivalent to C++ STL) for common operations such as dynamic arrays, sets, maps, stacks, and queues. The solution implements a utility class 'Stl' with methods showcasing ArrayList for dynamic array operations (insert, sort, search), HashSet for unique element storage and lookup, HashMap for key-value frequency counting, Stack for LIFO operations, and ArrayDeque (as Queue) for FIFO operations. Each method performs typical operations provided by these collections: add, remove, search, sort, iterate, and size queries, mirroring the functionality of C++ STL containers like vector, set, map, stack, and queue.

## Complexity
- Time: O(N log N) for sorting operations, O(N) for insertion/traversal operations, O(1) average for HashMap/HashSet operations
- Space: O(N)
