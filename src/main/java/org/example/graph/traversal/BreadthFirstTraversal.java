package org.example.graph.traversal;

import org.example.graph.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {

  public List<String> solution(Node node){
    List<String> nodes = new ArrayList<>();
    Queue<Node> queue = new LinkedList<>();
    if(node!=null){
      queue.offer(node);
    }
    while(!queue.isEmpty()){
      Node front = queue.poll();
      nodes.add(front.getName());
      if(node.getNeighbours().size()==0){
        continue;
      }
      front.getNeighbours().forEach(queue::offer);
    }
    System.out.println(nodes);
    return nodes;
  }
}
