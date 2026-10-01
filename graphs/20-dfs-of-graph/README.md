# DFS of Graph

**Source:** https://takeuforward.org/graph/depth-first-search-dfs-traversal-graph/ | **Topic:** graphs | **Difficulty:** Easy

## Approach
Represent the graph using an adjacency list. Start DFS traversal from node 0 (or any specified start node), using a boolean visited array to track visited nodes. Recursively visit each unvisited neighbor, adding nodes to the result list in the order they are first visited. This explores as far as possible along each branch before backtracking.

## Complexity
- Time: O(V + E)
- Space: O(V)
