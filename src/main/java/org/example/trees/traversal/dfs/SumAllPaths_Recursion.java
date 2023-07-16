package org.example.trees.traversal.dfs;

import org.example.trees.traversal.TreeNode;
import org.example.trees.traversal.TreeUtils;

public class SumAllPaths_Recursion {

  public static void main(String[] args) {

    TreeNode root = TreeUtils.getTree();
    traverse(root, 0);
    System.out.println(totalSum);
  }

  static int totalSum = 0;

  /**
   * The root parameter represents the current node being processed,
   * and currentSum represents the sum of values along the path from the root to the current node.
   *
   * The totalSum variable is presumably a class-level variable
   * that is used to accumulate the sum of all paths in the tree.
   *
   * The base case for the recursion is when the current node is null,
   * in which case the method sets totalSum to 0 (to avoid keeping any previous value of totalSum),
   * and then returns.
   *
   * If the current node is a leaf node (i.e., has no children),
   * then the totalSum variable is updated by adding currentSum to it.
   *
   * Finally, the method recursively calls itself on the left and right
   * children of the current node, passing along the updated currentSum.
   * @param root
   * @param currentSum
   */
  private static void traverse(TreeNode root, int currentSum) {
    if (root == null) {
      totalSum =0;
      return;
    }
    currentSum = currentSum + root.data;
    if (root.left == null && root.right == null) {
      totalSum = totalSum + currentSum;
    }
    traverse(root.left, currentSum);
    traverse(root.right, currentSum);
  }
}
