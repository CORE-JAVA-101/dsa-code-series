package org.example.trees.traversal.dfs;

import org.example.trees.traversal.TreeNode;
import org.example.trees.traversal.TreeUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FindPathWithSumTest {

  @Test
  public void getResult() {
    TreeNode root = TreeUtils.getTree();
    int targetSum = 180;
    boolean result = FindPathWithSum.getResult(root, targetSum);
    Assert.assertTrue(result);

    targetSum = 181;
    result = FindPathWithSum.getResult(root, targetSum);
    Assert.assertFalse(result);
  }

  @Test
  public void getNodes() {
    TreeNode root = TreeUtils.getTree();
    int targetSum = 90;
    List<Integer> result = FindPathWithSum.getNodes(root, targetSum);
    System.out.println(result);
  }

  @Test
  public void getPaths1() {
    TreeNode root = TreeUtils.getTree();
    int targetSum = 90;
    List<Integer> result = FindPathWithSum.getPaths1(root, targetSum);
    System.out.println(result);
  }
}