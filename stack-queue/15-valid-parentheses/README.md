# Valid Parentheses

**Source:** https://takeuforward.org/data-structure/check-for-balanced-parentheses/ | **Topic:** stack-queue | **Difficulty:** Easy

## Approach
Use a stack to track opening brackets. Iterate through the string; for each opening bracket push its corresponding closing bracket onto the stack. For each closing bracket, check if the stack is non-empty and its top matches the current character; if so pop it, otherwise the string is invalid. At the end, the string is valid only if the stack is empty.

## Complexity
- Time: O(N)
- Space: O(N)
