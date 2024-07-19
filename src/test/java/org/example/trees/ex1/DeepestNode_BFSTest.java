package org.example.trees.ex1;

import org.example.trees.traversal.TreeNode;
import org.example.trees.traversal.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeepestNode_BFSTest {

  @Test
  public void solution() {
    TreeNode deepNode = DeepestNode_BFS.solution(TreeUtils.getTree());
    System.out.println(deepNode.data);
  }
}