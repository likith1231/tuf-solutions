# Diameter of Binary Tree

**Source:** https://takeuforward.org/data-structure/calculate-the-diameter-of-a-binary-tree/ | **Topic:** binary-tree | **Difficulty:** Easy

## Approach
Perform a post-order DFS traversal. For each node, compute the height of its left and right subtrees. The diameter passing through that node equals the sum of left height and right height. Keep a running maximum of this sum across all nodes while returning height (1 + max(leftHeight, rightHeight)) to the caller. The final maximum value found is the diameter of the tree, measured in number of edges on the longest path between any two nodes.

## Complexity
- Time: O(N)
- Space: O(H)
