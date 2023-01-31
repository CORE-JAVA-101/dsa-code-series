package org.example.trees.traversal;


import org.example.trees.traversal.dfs.InOrderTraversal_Recursion;
import org.junit.Test;

import java.util.List;

public class InOrderTraversal_RecursionTest {

    @Test
    public void testTraverse() {
        TreeNode root = TreeUtils.getTree();
        InOrderTraversal_Recursion helper = new InOrderTraversal_Recursion();
        List<Integer> result = helper.traverse(root);
        System.out.println(result);
    }
}