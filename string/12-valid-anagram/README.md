# Valid Anagram

**Source:** https://takeuforward.org/data-structure/check-if-two-strings-are-anagrams-of-each-other/ | **Topic:** string | **Difficulty:** Easy

## Approach
Check if two strings have equal length, then count frequency of each character in the first string using an integer array of size 26 (assuming lowercase letters), and decrement counts based on the second string. If all counts return to zero, the strings are anagrams.

## Complexity
- Time: O(N)
- Space: O(1)
