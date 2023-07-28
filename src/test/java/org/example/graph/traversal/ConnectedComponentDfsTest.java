package org.example.graph.traversal;

import org.junit.Assert;
import org.junit.Test;
import utils.GraphUtils;

import static org.junit.Assert.*;

public class ConnectedComponentDfsTest {

  @Test
  public void solution() {
    String[][] edges = {
        {"1","2"},
        {"3","4"},
        {"3","5"},
        {"3","6"},
        {"3","7"},
        {"3","8"},
        {"9"}
    };
    GraphUtils.Graph graph = GraphUtils.createUndirectedPathGraph(edges);
    ConnectedComponentDfs componentDfs = new ConnectedComponentDfs();
    int count =componentDfs.solution(graph);
    Assert.assertEquals(3, count);
  }
}