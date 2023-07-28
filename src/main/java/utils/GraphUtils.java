package utils;

import org.example.graph.Node;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphUtils {

  /**
   * a ---> b
   * |     |
   * |     |
   * c     d
   * |
   * |
   * e--->f
   *
   * @return
   */

  public static Node getGraph() {
    Node node1 = new Node("a");
    Node node2 = new Node("b");
    Node node3 = new Node("c");
    Node node4 = new Node("d");
    Node node5 = new Node("e");
    Node node6 = new Node("f");

    node1.addEdge(node2).addEdge(node3);
    node2.addEdge(node4);
    node3.addEdge(node5);
    node5.addEdge(node6);
    return node1;
  }

  public static void displayAdjacencyList(Node node){
    Queue<Node> queue = new LinkedList<>();
    Set<String> names = new HashSet<>();
    queue.add(node);
    names.add(node.getName());
    while(!queue.isEmpty()){
      Node current = queue.poll();
      System.out.println(current.asString());
      current.getEdges().forEach(e->{
        if(!names.contains(e.getName())){
          queue.add(e);
          names.add(e.getName());
        }
      });
    }
  }

  public static Node uniDirectedGraph(String[][] edges) {
    for (String[] edge : edges) {
      String v1 = edge[0];
      String v2 = edge[1];
      Graph.getInstance().addMapping(v1,v2);
    }
    return Graph.getInstance().getRootNode();
  }

  public static Graph create(String[][] edges) {
    for (String[] edge : edges) {
      String v1 = edge[0];
      String v2 = edge[1];
      Graph.getInstance().addMapping(v1,v2);
    }
    return Graph.getInstance();
  }
  public static class Graph {
    private static Graph INSTANCE = new Graph();
    private  Map<String, Node> nodeMapping = new HashMap<>();
    private  Node rootNode = null;

    public static Graph getInstance(){
      return INSTANCE;
    }
    public  void addMapping(String name1, String name2) {
      if (!nodeMapping.containsKey(name1)) {
        Node node = new Node(name1);
        if (rootNode == null) {
          rootNode = node;
        }
        nodeMapping.put(name1, node);
      }
      if (!nodeMapping.containsKey(name2)) {
        Node node = new Node(name2);
        nodeMapping.put(name2, node);
      }
      nodeMapping.get(name1).addEdge(nodeMapping.get(name2));
      nodeMapping.get(name2).addEdge(nodeMapping.get(name1));
    }

    public Node getRootNode() {
      return rootNode;
    }

    public Node getNode(String name){
      return nodeMapping.get(name);
    }

  }
}
