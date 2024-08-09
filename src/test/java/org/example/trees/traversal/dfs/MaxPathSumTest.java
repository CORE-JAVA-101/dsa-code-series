package org.example.trees.traversal.dfs;

import org.example.trees.ex1.MaxPathSum_DFS;
import org.example.trees.traversal.TreeNode;
import org.example.trees.traversal.TreeUtils;
import org.junit.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class MaxPathSumTest {

  @Test
  public void solution() {
    TreeNode treeNode = TreeUtils.getTree();
    int result = MaxPathSum_DFS.solution(treeNode);
    System.out.println(result);
  }
}