package org.example.trees.traversal;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TraversalUtilsTest {

  @Test
  public void zig_zag_order_traverse() {
    List<List<Integer>> list = new TraversalUtils().zig_zag_order_traverse(TreeUtils.getTree());
    System.out.println(list);
  }
}