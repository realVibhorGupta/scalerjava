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

public class SegmentedTrees {

    private static class Node {
        private Node left, right;
        private int data;

        private int startInterval;
        private int endInterval;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }


        public Node() {
        }
    }

    private Node rootNode;

    public SegmentedTrees(int[] array) {
        this.rootNode = constructTree(array, 0, array.length - 1);
    }

    private Node constructTree(int[] array, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            //leaf Nide
            Node leaf = new Node(startIndex, endIndex);
            leaf.data = array[startIndex];
            return leaf;

        }
        //create an node with index you are at
        Node node = new Node(startIndex, endIndex);
        int mid = (startIndex + endIndex) / 2;

        //updat left and right
        node.left = constructTree(array, startIndex, mid);
        node.right = constructTree(array, mid + 1, endIndex);
        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(this.rootNode);
    }

    private void display(Node node) {
        String str = "";
        if (node.left != null) {
            str = str + "Interval[" + node.left.startInterval + "+" + node.left.endInterval + "] and data :" + node.left.data + "+ =>";

        } else {
            str = str + "No left Child";
        }
        //for current node
        str = str + "Interval[" + node.startInterval + "+" + node.endInterval + "] and data :" + node.data + "+ <=";

        if (node.right != null) {
            assert node.left != null;
            str = str + "Interval[" + node.left.startInterval + "+" + node.right.endInterval + "] and data :" + node.right.data + "+ =>";

        } else {
            str = str + "No right Child";
        }
        System.out.println(str);
        //call recursion
        if (node.left != null) {
            display(node.left);
        }
        if (node.right != null) {
            display(node.right);
        }
    }

    //query
    public int query(int queryStartIndex, int queryEndIndex) {
        return this.query(this.rootNode, queryStartIndex, queryEndIndex);
    }

    private int query(Node node, int queryStartIndex, int queryEndIndex) {
        //node is lying completely
        if (node.startInterval >= queryStartIndex && node.endInterval <= queryEndIndex) {
            return node.data;

        } else if (node.startInterval < queryStartIndex && node.endInterval > queryEndIndex) {
            return 0;
        } else {
            return this.query(node.left, queryStartIndex, queryEndIndex) + this.query(node.right, queryStartIndex, queryEndIndex);
        }
    }

    // update
    public void update(int index, int value) {
        this.rootNode.data = update(this.rootNode, index, value);
    }

    private int update(Node node, int index, int value) {
        if (index >= node.startInterval && index <= node.endInterval) {
            if (index == node.startInterval && index == node.endInterval) {
                node.data = value;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
            }
            return node.data;
        }
        return node.data;
    }
}
