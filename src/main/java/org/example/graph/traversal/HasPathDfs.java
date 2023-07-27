package org.example.graph.traversal;

import org.example.graph.Node;

import java.util.List;

public class HasPathDfs {

  public boolean solution(Node source, Node dest) {
    if (source.getName().equals(dest.getName())) {
      return true;
    }

    List<Node> edges = source.getEdges();
    boolean flag = false;
    for (Node node : edges) {
      flag = solution(node, dest);
    }
    return flag;
  }
}
