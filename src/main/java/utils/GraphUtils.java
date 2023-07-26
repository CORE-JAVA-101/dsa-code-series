package utils;

import org.example.graph.Node;

public class GraphUtils {

  /**
   *  a ---> b
   *  |     |
   *  |     |
   *  c     d
   *  |
   *  |
   *  e--->f
   * @return
   */

  public static Node getGraph(){
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
}
