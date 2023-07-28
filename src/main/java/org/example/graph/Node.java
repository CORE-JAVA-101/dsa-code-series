package org.example.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Node {

  String name;
  int weight;
  List<Node> edges;

  public Node(String name) {
    this(name, 0);
  }

  public Node(String name, int weight){
    this.name = name;
    this.weight = weight;
    this.edges = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
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

  public String asString(){
    return this.name + " : " + edges.stream().map(e-> e.getName()).collect(Collectors.toList());
  }
}
