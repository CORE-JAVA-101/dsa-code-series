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
      if(node.getEdges().size()==0){
        continue;
      }
      front.getEdges().forEach(e->{
        queue.offer(e);
      });
    }
    System.out.println(nodes);
    return nodes;
  }
}
