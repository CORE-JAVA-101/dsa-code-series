package org.example.trees.traversal;

import java.util.*;

public class ZigZag_LevelOrder_Traversal {

    public List<Integer> traverse(TreeNode treeNode) {
        List<Integer> results = new ArrayList<>();
        _traverse(treeNode, results);
        return results;
    }

    private void _traverse(TreeNode treeNode, List<Integer> results) {

        if (treeNode == null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        queue.add(null);

        results.add(treeNode.data);
        boolean oddLevel = false;
        TreeNode prev = null;
        while (true) {
            if (queue.isEmpty())
                break;
            TreeNode current = queue.poll();
            if (prev == null && current == null)
                break;
            prev = current;

            if (current == null && !oddLevel) {
                queue.add(null);
                oddLevel = true;
                continue;
            }

            if (current == null && oddLevel) {
                List<Integer> tempList = readReverse(queue);
                results.addAll(tempList);
                queue.add(null);
                oddLevel = false;
            }

            if (current == null)
                continue;

            if (oddLevel)
                results.add(current.data);

            if (current.left != null)
                queue.add(current.left);
            if (current.right != null)
                queue.add(current.right);

        }

    }

    private List<Integer> readReverse(Queue<TreeNode> queue) {
        // read all elements from queue and reverse it
        List<Integer> tempList = new ArrayList<>();
        int size = queue.size();
        while (size > 0) {
            TreeNode temp = queue.poll();
            tempList.add(temp.data);
            queue.add(temp);
            size--;
        }
        Collections.reverse(tempList);
        return tempList;
    }
}
