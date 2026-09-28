# Maximum Depth of Binary Tree

**Source:** https://takeuforward.org/data-structure/maximum-depth-of-a-binary-tree/ | **Topic:** binary-tree | **Difficulty:** Easy

## Approach
Perform a depth-first traversal of the binary tree, recursively computing the depth of the left and right subtrees. The depth of a node is 1 plus the maximum depth of its two children. An empty tree (null node) has depth 0. This recursive relation naturally handles the base case and combines results bottom-up.

## Complexity
- Time: O(N)
- Space: O(H)
