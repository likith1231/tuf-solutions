# Climbing Stairs

**Source:** https://takeuforward.org/data-structure/dynamic-programming-climbing-stairs/ | **Topic:** dynamic-programming | **Difficulty:** Easy

## Approach
Use dynamic programming where the number of distinct ways to reach step n is the sum of ways to reach step n-1 and step n-2, since from either of those steps you can take a 1-step or 2-step move to reach n. This mirrors the Fibonacci sequence. Use two variables to iteratively compute the result in O(1) space.

## Complexity
- Time: O(N)
- Space: O(1)
