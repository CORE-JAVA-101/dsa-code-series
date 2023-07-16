package org.example.trees.traversal.dfs;

import org.example.trees.traversal.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindPathWithSum {

  public static boolean getResult(TreeNode treeNode, int targetSum) {
    return traverse(treeNode, 0, targetSum);
  }

  private static boolean traverse(TreeNode root, int currentSum, int targetSum) {
    if (root == null) return false;

    currentSum = currentSum + root.data;
    if (root.left == null || root.right == null) {
      return currentSum == targetSum;
    }
    return traverse(root.left, currentSum, targetSum) || traverse(root.right, currentSum, targetSum);
  }

  public static List<Integer> getNodes(TreeNode root, int targetSum) {
    traverse1(root, 0, targetSum);
    return nodeValues;
  }

  private static List<Integer> nodeValues = new ArrayList<>();

  private static boolean traverse1(TreeNode root, int currentSum, int targetSum) {
    if (root == null) return false;

    nodeValues.add(root.data);
    currentSum = currentSum + root.data;
    if (root.left == null || root.right == null) {
      if (currentSum != targetSum) {
        nodeValues.remove(nodeValues.size() - 1);
        return false;
      }
      return true;
    }
    boolean flag = traverse1(root.left, currentSum, targetSum) || traverse1(root.right, currentSum, targetSum);
    if (flag) return true;

    nodeValues.remove(nodeValues.size() - 1);
    return false;
  }

  public static List<Integer> getPaths1(TreeNode root, int targetSum) {
    traverse2(root, targetSum);
    return paths;
  }

  private static List<Integer> paths = new ArrayList<>();

  private static void traverse2(TreeNode root, int targetSum) {
    if (root == null)
      return;
    paths.add(root.data);
    if (root.left == null && root.right == null && root.data == targetSum) {
      System.out.println(paths);
      return;
    }
    traverse2(root.left, targetSum - root.data);
    traverse2(root.right, targetSum - root.data);
    paths.remove(paths.size() - 1);
  }

}
