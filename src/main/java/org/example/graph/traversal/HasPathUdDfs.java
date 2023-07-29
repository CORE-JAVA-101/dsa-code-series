package org.example.graph.traversal;

import org.example.graph.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * has path un-directed graph
 */
public class HasPathUdDfs {

  private Set<String> visitedNodes = new HashSet<>();
  public boolean solution(Node source, Node dest) {
    visitedNodes.add(source.getName());
    if (source.getName().equals(dest.getName())) {
      return true;
    }

    for (Node current : source.getNeighbours()) {
      if (!visitedNodes.contains(current.getName()) && solution(current, dest)) {
        return true;
      }
    }

    return false;
  }
}
