package org.example.trees.traversal.dfs;

import org.example.trees.ex1.FindRootToLeafPathWithTargetSum_DFS;
import org.example.trees.traversal.TreeNode;
import org.example.trees.traversal.TreeUtils;
import org.junit.Test;

import java.util.List;

public class FindPathWithSumRecursionTest {

  @Test
  public void getPaths1() {
    TreeNode root = TreeUtils.getTree();
    int targetSum = 180;
    List<Integer> result = FindRootToLeafPathWithTargetSum_DFS.solution(root, targetSum);
    System.out.println(result);
  }
}