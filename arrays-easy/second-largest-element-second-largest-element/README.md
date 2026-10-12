# Second Largest Element

**Source:** https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z | **Topic:** Arrays-Easy | **Difficulty:** Easy

## Approach
Traverse the array once while maintaining two variables, 'largest' and 'secondLargest'. For each element, if it is greater than 'largest', update 'secondLargest' to the old 'largest' and then update 'largest' to the current element. Otherwise, if the element is smaller than 'largest' but greater than 'secondLargest' (and not equal to 'largest' to avoid duplicates), update 'secondLargest'. This gives the second largest distinct value in a single pass without sorting.

## Complexity
- Time: O(N)
- Space: O(1)
