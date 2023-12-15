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

package stacks;import java.util.ArrayList;
import java.util.Stack;

public class StackClass {
    static class StackArrayList {
        ArrayList<Integer> list = new ArrayList<Integer>();


        boolean isEmpty() {
            if (list.size() == 0) {
                return true;
            }
            return false;
        }

        //push
        void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) return -1;
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //peek

        int peek() {
            if (isEmpty()) return -1;
            return list.get(list.size() - 1);

        }


    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class StackLinkedList {
        static public Node head;

        boolean isEmpty() {
            return head == null;
        }

        void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }
    }

    public static void main(String[] args) {

//        Stack stack = new Stack();
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
//
//        while (!stack.isEmpty()) {
//            System.out.println(stack.peek());
//            stack.pop();
//        }

//        StackArrayList stackArrayList = new StackArrayList();
//        stackArrayList.push(3);
//        stackArrayList.push(4);
//        stackArrayList.push(5);
//        stackArrayList.push(6);
//
//        while (!stackArrayList.isEmpty()) {
//            System.out.println(stackArrayList.peek());
//            stackArrayList.pop();
//        }

        Stack<Integer> stackUtil = new Stack<>();
        stackUtil.push(3);
        stackUtil.push(4);
        stackUtil.push(5);
        stackUtil.push(6);

        while (!stackUtil.isEmpty()) {
            System.out.println(stackUtil.peek());
            stackUtil.pop();
        }
    }
}
