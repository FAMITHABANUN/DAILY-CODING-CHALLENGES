Day-56

Problems Solved

1. Diameter of Binary Tree

Problem:
Find the diameter of a binary tree. The diameter is the longest path between any two nodes in the tree.

Approach:

Use a recursive DFS traversal.

For every node, calculate the height of its left and right subtrees.

The longest path passing through the current node is: leftHeight + rightHeight

Keep track of the maximum diameter while calculating heights.


Time Complexity: O(n)
Space Complexity: O(h), where h is the height of the tree.

File: Diameter of Binary tree.java


---

2. Smallest Range Covering Elements from K Lists

Problem:
Given k sorted lists, find the smallest range that includes at least one element from each list.

Approach:

Use a PriorityQueue (Min Heap) to keep track of the smallest current element from each list.

Maintain the maximum value among the current elements.

The current range is [minimum, maximum].

Update the smallest range whenever a better range is found.

Remove the minimum element and add the next element from the same list.

Stop when one of the lists is completely exhausted.


Time Complexity: O(n log k)
Space Complexity: O(k)

File: Smallest range covering elements from K lists.java


---

Topics Covered

Binary Trees

Depth First Search (DFS)

Recursion

Tree Height

Priority Queue

Min Heap

Sliding/Expanding Range

Two-pointer style optimization



---

Key Takeaways

Tree problems can often be solved efficiently using recursive DFS.

The diameter of a tree can be calculated while finding its height.

A PriorityQueue is useful when repeatedly selecting the smallest element from multiple sorted lists.

Maintaining both the current minimum and maximum helps efficiently find the smallest covering range.