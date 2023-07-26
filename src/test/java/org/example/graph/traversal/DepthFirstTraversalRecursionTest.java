package org.example.graph.traversal;

import org.example.graph.Node;
import org.junit.Test;
import utils.GraphUtils;

import java.util.List;

import static org.junit.Assert.*;

public class DepthFirstTraversalRecursionTest {

  @Test
  public void solution() {
    Node node = GraphUtils.getGraph();
    DepthFirstTraversalRecursion recursion = new DepthFirstTraversalRecursion();
    List<String> actual =recursion.solution(node);
    System.out.println(actual);
  }
}