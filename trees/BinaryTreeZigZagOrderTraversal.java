/*
 * Copyright (c) 2023. , Sunshine.Code <sunshinethelearningsite@gmail.com>
 *   License: MIT
 * The MIT License (MIT).
 * Copyright © 2023, Sunshine.Code <sunshinethelearningsite@gmail.com>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy   of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: .The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *  .
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package trees;

import java.util.*;

public class BinaryTreeZigZagOrderTraversal {


    public static class TreeNode {
        int val;
        TreeNode left;
     TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val,TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Deque<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean reverse = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i=0; i < levelSize; i++) {
                if (!reverse) {
                    addInNormalOrder(queue, currentLevel);
                } else {
                    addInReverseOrder(queue, currentLevel);
                }
            }
            reverse = !reverse;
            result.add(currentLevel);
        }
        return result;
    }

    private static void addInReverseOrder(Deque<TreeNode> queue, List<Integer> currentLevel) {
        TreeNode currentNode = queue.pollLast();
        assert currentNode != null;
        currentLevel.add(currentNode.val);
        if (currentNode.right != null) {
            queue.addFirst(currentNode.right);
        }
        if (currentNode.left != null) {
            queue.addFirst(currentNode.left);
        }
    }

    private static void addInNormalOrder(Deque<TreeNode> queue, List<Integer> currentLevel) {
        TreeNode currentNode = queue.pollFirst();
        assert currentNode != null;
        currentLevel.add(currentNode.val);
        if (currentNode.left != null) {
            queue.addLast(currentNode.left);
        }
        if (currentNode.right != null) {
            queue.addLast(currentNode.right);
        }
    }

}
