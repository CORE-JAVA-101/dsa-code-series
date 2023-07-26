package org.example.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {

  String name;
  List<Node> edges;

  public Node(String name) {
    this.edges = new ArrayList<>();
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Node> getEdges() {
    return edges;
  }

  public void setEdges(List<Node> edges) {
    this.edges = edges;
  }

  public Node addEdge(Node n){
    this.edges.add(n);
    return this;
  }
}
