package org.example.trees.traversal;

import org.junit.Test;

public class ZigZag_LevelOrder_TraversalTest {

    @Test
    public void traverse() {
        TreeNode root = TreeUtils.getTree();
        ZigZag_LevelOrder_Traversal z = new ZigZag_LevelOrder_Traversal();
        z.traverse(root).forEach(System.out::println);
    }
}