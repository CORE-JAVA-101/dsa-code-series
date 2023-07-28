package org.example.graph.traversal;

import org.example.graph.Node;

/**
 * has path un-directed graph
 */
public class HasPathUdDfs {

  public boolean solution(Node source, Node dest) {
    if (source.getName().equals(dest.getName())) {
      return true;
    }

    for (Node current : source.getEdges()) {
      if (solution(current, dest)) {
        return true;
      }
    }

    return false;
  }
}
