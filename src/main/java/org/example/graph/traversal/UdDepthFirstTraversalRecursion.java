package org.example.graph.traversal;

import org.example.graph.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * undirected path graph
 */
public class UdDepthFirstTraversalRecursion {

  public Set<String> solution(Node node) {
    Set<String> nodeNames = new HashSet<>();
    recursive(nodeNames, node);
    return nodeNames;
  }

  private static void recursive(Set<String> nodeNames, Node node) {
    if (nodeNames.contains(node.getName())) { // this will help avoid visiting same node
      return;
    }
    nodeNames.add(node.getName());
    for (Node edge : node.getNeighbours()) {
      recursive(nodeNames, edge);
    }
  }
}
