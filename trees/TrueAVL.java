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

public class TrueAVL {

    private static class Node {

        private int value;
        private Node left, right;
        private int height;
        private int loadFactor;

        Node(int value) {
            this.value = value;

        }

        public int getValue() {
            return value;
        }
    }


    private Node root;

    public TrueAVL() {
    }


    public void insert(int value) {
        insert(value, root);
    }

    private void insert(int value, Node node) {
        if (isEmpty()) {
            return;
        }
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    private boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(this.root, "Root Node:" + root.value);
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
    }

    public void insert(int value) {
        insert(rootNode, value);
    }

    public Node insert(Node node, int value) {

        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        }

        if (value > node.value) {
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right) + 1);
        return rotate(node);
    }

    private Node rotate(Node node) {
        //left heavy
        if (height(node.left) - height(node.right) > 1) {
             //left left case
            if(height(node.left.left) - height(node.left.right) > 0){

                // right rotate on P
                return rotate(node.right);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                //left right case
                node.left =  leftRotate(node.left);

                // right rotate on P
                return rightRotate(node);
            }

        }
        //right heavy
        if (height(node.left) - height(node.right) < -1) {
            //left left case
            if(height(node.right.left) - height(node.right.right) < 0){

                // left// rotate on P
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                //right right case
                node.right =  rightRotate(node.right);

                // left rotate on P
                return leftRotate(node);
            }

        }



        return node;
    }

    private Node rightRotate(Node node) {
        return null;
    }

    private Node leftRotate(Node node) {
        return null;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {

        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }
}
