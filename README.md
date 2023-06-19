# Maximum-Level-Sum-Algorithm-in-Binary-Tree
This repository contains the implementation of the "Maximum Level Sum Algorithm" for a binary tree. The algorithm aims to find the level in the binary tree that has the maximum sum of node values.
Problem Description
Given a binary tree, the algorithm finds the level with the maximum sum of node values and returns the level number.

For example, given the following binary tree:

```markdown

      1
    /  \
   7    0
  / \
 7   -8
 ```
The maximum level sum is found at level 2, which is [7, 0], and the algorithm returns 2.
## Algorithm Overview
The algorithm follows a breadth-first search (BFS) approach using a queue to traverse the binary tree level by level.
It keeps track of the level with the maximum sum and updates it whenever a higher sum is found. The algorithm proceeds as follows:

- Initialize variables: max to store the maximum sum, level to store the level with the maximum sum, templvl to track the current level being processed, and tempval to store the sum of node values at the current level.
- Create a queue and add the root of the binary tree to the queue.
- Perform a BFS traversal while the queue is not empty:
- Get the size of the queue to process the nodes at the current level.
- Initialize tempval to 0 for calculating the sum of node values at the current level.
- Iterate through the nodes at the current level:
- Dequeue a node from the queue.
- Add the node's value to tempval.
- Enqueue the left and right child nodes if they exist.
- Check if the current level's sum (tempval) is greater than the current maximum sum (max):
- If true, update max with tempval and update level with the current level number (templvl).
- Increment templvl to move to the next level.
- Return the level with the maximum sum (level).

  
## Time Complexity
The time complexity of the algorithm is O(N), where N is the number of nodes in the binary tree. This is because the algorithm performs a BFS traversal, visiting each node once.

## Space Complexity
The space complexity of the algorithm is O(W), where W is the maximum width of the binary tree. In the worst case, when the binary tree is completely balanced, the maximum width is approximately N/2. The algorithm uses a queue to store nodes at each level, and at any given level, the queue can store a maximum of W nodes.


## Usage
You can use the provided code as a starting point for your own projects or as a reference to understand the implementation of the "Maximum Level Sum Algorithm" for a binary tree.
  
