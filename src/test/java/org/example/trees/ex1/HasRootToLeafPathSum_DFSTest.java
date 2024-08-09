package org.example.trees.ex1;

import org.example.trees.traversal.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class HasRootToLeafPathSum_DFSTest {

  @Test
  public void solution() {
    boolean flag = HasRootToLeafPathSum_DFS.solution(TreeUtils.getTree(), 180);
    System.out.println(flag);
  }
}