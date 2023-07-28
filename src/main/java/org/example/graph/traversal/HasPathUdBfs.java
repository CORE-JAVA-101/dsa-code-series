package org.example.graph.traversal;

import org.example.graph.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * has path un-directed graph
 */
public class HasPathUdBfs {

  public boolean solution(Node source, Node dest) {
    if (source.getName().equals(dest.getName())) {
      return true;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(source);
    for (Node edge : source.getEdges()) {
      Node current = queue.poll();
      if(current.getName().equals(dest.getName())){
        return true;
      }
      queue.addAll(edge.getEdges());
    }
    return false;
  }
}
