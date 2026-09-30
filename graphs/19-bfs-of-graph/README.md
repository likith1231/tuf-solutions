# BFS of Graph

**Source:** https://takeuforward.org/graph/breadth-first-search-bfs-level-order-traversal/ | **Topic:** graphs | **Difficulty:** Easy

## Approach
Represent the graph using an adjacency list. Start BFS traversal from node 0 (or any given start node), using a boolean visited array to avoid revisiting nodes and a queue to process nodes level by level. For each node dequeued, add it to the result list and enqueue all its unvisited neighbors, marking them visited immediately to prevent duplicate processing.

## Complexity
- Time: O(V + E)
- Space: O(V)
