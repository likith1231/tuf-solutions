# Subset Sums

**Source:** https://takeuforward.org/data-structure/subset-sum-sum-of-all-subsets/ | **Topic:** recursion | **Difficulty:** Medium

## Approach
Use recursion/backtracking to generate all subsets of the given array. For each element, we have two choices: include it in the current subset or exclude it. At each recursive call, we track the current sum of the chosen subset. When the recursion reaches the end of the array (i.e., all elements have been considered), we add the current sum to the result list. This produces the sum of every one of the 2^N possible subsets, which can then be sorted before returning.

## Complexity
- Time: O(2^N) to generate all subset sums, plus O(2^N log(2^N)) for sorting the results
- Space: O(2^N) to store all subset sums, plus O(N) recursion stack space
