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
    Set<String> nodeNames = new HashSet<>();
    traverse(nodeNames, node);
    return nodeNames;
  }

  private static void traverse(Set<String> nodeNames, Node node) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);
    while (!queue.isEmpty()) {
      Node current = queue.poll();
      if (nodeNames.contains(current.getName())) { // this will help avoid visiting same node
        continue;
      }
      nodeNames.add(current.getName());
      current.getEdges().forEach(queue::add);
    }
  }
}
