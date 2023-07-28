package org.example.graph.traversal;

import org.example.graph.Node;
import org.junit.Test;
import utils.GraphUtils;

import static org.junit.Assert.*;

/**
 * undirected path graph
 */
public class UdDepthFirstTraversalRecursionTest {

  @Test
  public void solution() {

    String[][] edges = {
        {"a","b"},
        {"a","c"},
        {"b","d"},
        {"b","e"},
        {"e","c"},
    };

    Node node = GraphUtils.uniDirectedGraph(edges);
    GraphUtils.displayAdjacencyList(node);


  }
}