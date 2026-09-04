## 📅 Day 54 – Daily Coding Challenge

### 🧩 Problems Solved

#### 1. 💡 Bulb Switcher

**Problem:**
Given `n` bulbs, all initially switched off, you perform `n` rounds of switching. In round `i`, you toggle every `i`-th bulb. Find the number of bulbs that remain on after all rounds.

**Approach:**
A bulb is toggled once for every divisor it has. A bulb remains ON only when it has an **odd number of divisors**. Only perfect squares have an odd number of divisors.

Therefore, the answer is:

```java
(int)Math.sqrt(n)
```

**Time Complexity:** `O(1)`
**Space Complexity:** `O(1)`

---

#### 2. 🌳 Merge Two Binary Trees

**Problem:**
Given two binary trees, merge them into a single binary tree. If two nodes overlap, add their values. If only one node exists, use that node.

**Approach:**
Use recursion:

* If both nodes are `null`, return `null`.
* If one node is `null`, return the other node.
* Add the values of overlapping nodes.
* Recursively merge the left and right subtrees.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(h)`, where `h` is the height of the tree.

### 📚 Key Learnings

* Understood the mathematical idea behind the **Bulb Switcher** problem.
* Practiced **recursion** with binary trees.
* Learned how to combine two tree structures efficiently.
* Improved problem-solving skills using mathematical observation and recursion.

### ✅ Conclusion

**Day 54 completed! 🎯**
Today I strengthened my understanding of **mathematical optimization and binary tree recursion**. Consistency continues! 💻🔥
