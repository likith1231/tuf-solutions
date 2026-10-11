# Largest Element

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Arrays-Easy | **Difficulty:** Easy

## Approach
Iterate through the array once while keeping track of the maximum value found so far. Start by assuming the first element is the largest, then compare it with every subsequent element, updating the maximum whenever a larger value is encountered. After processing all elements, the tracked value is the largest element in the array.

## Complexity
- Time: O(N)
- Space: O(1)
