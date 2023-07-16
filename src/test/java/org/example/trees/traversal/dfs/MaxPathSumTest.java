package org.example.trees.traversal.dfs;

import org.example.trees.traversal.TreeNode;
import org.example.trees.traversal.TreeUtils;
import org.junit.Test;

public class MaxPathSumTest {

  @Test
  public void getResult() {
    TreeNode treeNode = TreeUtils.getTree();
    int result = MaxPathSum_Recursion.getResult(treeNode);
    System.out.println(result);
  }
}