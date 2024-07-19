package org.example.trees.traversal.dfs;

import org.example.trees.ex1.RootToNodePath_DFS;
import org.example.trees.traversal.TreeUtils;
import org.junit.Test;

import java.util.List;

public class RootToNodePathRecursionTest {

  @Test
  public void solution() {
    List<String> path = RootToNodePath_DFS.solution(TreeUtils.getTree(), 60 );
    System.out.println(path);
  }
}