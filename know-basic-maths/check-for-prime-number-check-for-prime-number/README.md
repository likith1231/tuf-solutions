# Check for Prime Number

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Know Basic Maths | **Difficulty:** Easy

## Approach
Check if a number n is prime by testing divisibility from 2 up to sqrt(n). If n is less than 2, it's not prime. If any number in that range divides n evenly, it's not prime; otherwise it is prime.

## Complexity
- Time: O(sqrt(N))
- Space: O(1)
