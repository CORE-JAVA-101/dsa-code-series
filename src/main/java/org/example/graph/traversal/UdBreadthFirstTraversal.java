package org.example.graph.traversal;

import org.example.graph.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * undirected path graph
 */
public class UdBreadthFirstTraversal {

  public Set<String> solution(Node node) {
    Set<String> visitedNodeNames = new HashSet<>();
    traverse(visitedNodeNames, node);
    return visitedNodeNames;
  }

  private static void traverse(Set<String> visitedNodeNames, Node node) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()) {
      Node current = queue.poll();
      if (visitedNodeNames.contains(current.getName())) { // this will help avoid visiting same node
        continue;
      }
      visitedNodeNames.add(current.getName());
      current.getEdges().forEach(queue::add);
    }
  }
}
