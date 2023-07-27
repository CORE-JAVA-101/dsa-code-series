package org.example.graph.traversal;

import org.example.graph.Node;
import org.junit.Assert;
import org.junit.Test;

public class HasPathDfsTest {

  /**
   * a ---> b
   * |     |
   * |     |
   * c<----d
   * |
   * |
   * e--->f
   *
   * @return
   */
  @Test
  public void solution() {
    Node node1 = new Node("a");
    Node node2 = new Node("b");
    Node node3 = new Node("c");
    Node node4 = new Node("d");
    Node node5 = new Node("e");
    Node node6 = new Node("f");

    node1.addEdge(node2).addEdge(node3);
    node2.addEdge(node4);
    node4.addEdge(node3);
    node3.addEdge(node5);
    node5.addEdge(node6);

    HasPathDfs hasPathDfs = new HasPathDfs();
    boolean flag = hasPathDfs.solution(node2, node1); // path doesn't exist
    Assert.assertEquals(flag, false);

    flag = hasPathDfs.solution(node2, node6); // path exist
    Assert.assertEquals(flag, true);
  }
}