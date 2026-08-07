# Day 29 - LeetCode Solutions

## Problem 1

- Problem Name: Flip Binary Tree To Match Preorder Traversal
- Platform: LeetCode
- Language: Java
- Difficulty: Medium
- Approach: Perform a preorder DFS traversal and flip child nodes whenever necessary to match the given voyage. Return the flipped node values or -1 if impossible.
- Time Complexity: O(n)
- Space Complexity: O(h)

---

## Problem 2

- Problem Name: Range Sum Query - Immutable
- Platform: LeetCode
- Language: Java
- Difficulty: Easy
- Approach: Precompute prefix sums during initialization so each range sum query can be answered in constant time.
- Time Complexity: O(n) (Initialization), O(1) (Query)
- Space Complexity: O(n)

---

## Problem 3

- Problem Name: Students and Examinations
- Platform: LeetCode
- Language: SQL
- Difficulty: Easy
- Approach: Use a CROSS JOIN to generate all student-subject pairs, LEFT JOIN with Examinations, and COUNT() to calculate the number of attended exams.
- Time Complexity: O(n)
- Space Complexity: O(1)

---