package org.example.graph.traversal;

import org.example.graph.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstTraversalRecursion {

  public List<String> solution(Node node) {
    List<String> traversedNodeNames = new ArrayList<>();
    recursive(node, traversedNodeNames);
    return traversedNodeNames;
  }

  private void recursive(Node node, List<String> traversalNames){
    if(node== null){
      return;
    }
    traversalNames.add(node.getName());
    List<Node> edges = node.getEdges();
    for(Node edge: edges) {
      recursive(edge, traversalNames);
    }
  }
}
