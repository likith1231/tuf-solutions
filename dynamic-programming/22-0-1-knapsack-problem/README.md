# 0-1 Knapsack Problem

**Source:** https://takeuforward.org/data-structure/0-1-knapsack-dp-19/ | **Topic:** dynamic-programming | **Difficulty:** Medium

## Approach
Use a 1D dynamic programming array dp of size (capacity+1) where dp[w] represents the maximum value achievable with capacity w. Iterate over each item and update the dp array from right to left (from capacity down to the item's weight) to ensure each item is only used once. For each item with weight wt and value val, dp[w] = max(dp[w], val + dp[w-wt]) for w from capacity down to wt. After processing all items, dp[capacity] contains the maximum value achievable.

## Complexity
- Time: O(N*W) where N is number of items and W is the knapsack capacity
- Space: O(W) where W is the knapsack capacity
