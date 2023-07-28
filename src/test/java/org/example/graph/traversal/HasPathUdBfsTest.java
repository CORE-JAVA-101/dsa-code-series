package org.example.graph.traversal;

import org.example.graph.Node;
import org.junit.Assert;
import org.junit.Test;
import utils.GraphUtils;

import static org.junit.Assert.*;

public class HasPathUdBfsTest {

  @Test
  public void solution() {
    String[][] edges = {
        {"a","b"},
        {"a","c"},
        {"b","d"},
        {"b","e"},
        {"e","c"},
    };

    GraphUtils.Graph graph = GraphUtils.create(edges);
    Node node1 = graph.getNode("e");
    Node node2 = graph.getNode("a");

    HasPathUdBfs hasPathUdDfs = new HasPathUdBfs();
    boolean status = hasPathUdDfs.solution(node1, node2);
    Assert.assertTrue(status);
  }
}