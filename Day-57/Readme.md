Day-57

Problems Solved

1. Edit Distance

Problem:
Find the minimum number of operations required to convert one string into another. The allowed operations are insert, delete, and replace.

Approach:

Use Dynamic Programming (DP).

Create a 2D table where dp[i][j] represents the minimum operations needed to convert the first i characters of one string into the first j characters of the other.

If the characters are the same, no new operation is required.

Otherwise, consider insert, delete, and replace operations and choose the minimum.


Time Complexity: O(m × n)
Space Complexity: O(m × n)

File: Edit distance.java


---

2. Longest Common Prefix

Problem:
Find the longest common prefix shared by all strings in an array.

Approach:

Start with the first string as the prefix.

Compare it with each subsequent string.

Reduce the prefix until it matches the beginning of the current string.

Continue until all strings have been processed.


Time Complexity: O(n × m)
Space Complexity: O(1) excluding the output.

File: Longest common prefix.java


---

Topics Covered

Dynamic Programming

String Manipulation

2D DP

Insert, Delete and Replace Operations

Prefix Matching

String Comparison

Time and Space Complexity



---

Key Takeaways

Edit Distance is a classic Dynamic Programming problem.

DP helps avoid repeatedly solving the same smaller string-conversion problems.

Longest Common Prefix can be solved efficiently by continuously reducing the prefix.

String problems often require careful handling of edge cases such as empty strings and different string lengths.