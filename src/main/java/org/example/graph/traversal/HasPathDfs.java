package org.example.graph.traversal;

import org.example.graph.Node;

import java.util.List;

public class HasPathDfs {

  public boolean solution(Node source, Node dest) {
    if (source.getName().equals(dest.getName())) {
      return true;
    }

    List<Node> edges = source.getNeighbours();
    for (Node node : edges) {
      if (solution(node, dest)) {
        return true;
      }
    }
    return false;
  }
}
