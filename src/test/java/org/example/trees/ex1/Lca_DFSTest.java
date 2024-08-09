package org.example.trees.ex1;

import org.example.trees.traversal.TreeNode;
import org.example.trees.traversal.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lca_DFSTest {

  @Test
  public void solution() {

    TreeNode root = TreeUtils.getTree();

    TreeNode node1 = new TreeNode(30);
    TreeNode node2 = new TreeNode(50);

    TreeNode result = Lca_DFS.solution(root, node1, node2);

    System.out.println(result.data);
  }
}