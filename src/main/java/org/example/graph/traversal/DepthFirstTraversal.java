package org.example.graph.traversal;

import org.example.graph.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstTraversal {

  public List<String> solution(Node node) {
    List<String> traversedNodeNames = new ArrayList<>();

    Stack<Node> stack = new Stack<>();
    if (node != null) {
      stack.push(node);
    }
    while (!stack.isEmpty()) {
      Node top = stack.pop();
      traversedNodeNames.add(top.getName());
      if (top.getEdges().size() == 0) {
        continue;
      }
      top.getEdges().forEach(e -> {
        stack.push(e);
      });
    }
    System.out.println(traversedNodeNames);
    return traversedNodeNames;
  }
}
