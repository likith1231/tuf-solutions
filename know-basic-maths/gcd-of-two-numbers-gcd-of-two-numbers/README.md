# GCD of Two Numbers

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Know Basic Maths | **Difficulty:** Easy

## Approach
Use the Euclidean algorithm: repeatedly replace the larger number with the remainder of dividing it by the smaller number until one becomes zero. The other number at that point is the GCD.

## Complexity
- Time: O(log(min(a, b)))
- Space: O(1)
