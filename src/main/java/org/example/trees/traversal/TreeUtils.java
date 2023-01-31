package org.example.trees.traversal;

public class TreeUtils {


    /**
     * <pre>
     *                            40
     *                    20             60
     *               10       30     50      80
     * </pre>
     */
    public static TreeNode getTree() {
        TreeNode treeNode1 = new TreeNode(40);
        TreeNode treeNode2 = new TreeNode(20);
        TreeNode treeNode3 = new TreeNode(60);
        TreeNode treeNode4 = new TreeNode(10);
        TreeNode treeNode5 = new TreeNode(30);
        TreeNode treeNode6 = new TreeNode(50);
        TreeNode treeNode7 = new TreeNode(80);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        return treeNode1;
    }
}
