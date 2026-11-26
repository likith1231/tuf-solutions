# Print all Divisors

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Know Basic Maths | **Difficulty:** Easy

## Approach
Iterate from 1 to sqrt(n). For each i that divides n, add i and n/i to a list (avoiding duplicate when i == n/i). Finally sort the list to print divisors in increasing order.

## Complexity
- Time: O(sqrt(N) + d(N) log d(N)) where d(N) is the number of divisors
- Space: O(d(N))
