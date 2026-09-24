# Longest Substring Without Repeating Characters

**Source:** https://takeuforward.org/data-structure/length-of-longest-substring-without-any-repeating-character/ | **Topic:** string | **Difficulty:** Medium

## Approach
Use a sliding window with a HashMap that stores the most recent index of each character. Expand the window by moving the right pointer through the string. If the current character has been seen before and its last index is within the current window (>= left pointer), move the left pointer to one position after that last occurrence. Update the last seen index of the character and track the maximum window size (right - left + 1) at each step.

## Complexity
- Time: O(N)
- Space: O(min(N, M)) where M is the character set size
