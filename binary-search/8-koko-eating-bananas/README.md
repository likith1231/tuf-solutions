# Koko Eating Bananas

**Source:** https://takeuforward.org/binary-search/koko-eating-bananas/ | **Topic:** binary-search | **Difficulty:** Medium

## Approach
Binary search on the eating speed k between 1 and the maximum pile size. For each candidate speed, compute the total hours Koko would need by summing ceil(pile/k) for every pile. If the total hours is within the allowed limit h, try a smaller speed (move right boundary down); otherwise increase speed (move left boundary up). The smallest speed for which the total hours does not exceed h is the answer.

## Complexity
- Time: O(N log(max(piles)))
- Space: O(1)
