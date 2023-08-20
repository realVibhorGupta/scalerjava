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

import java.util.LinkedList;
import java.util.Locale;

public class LL {
    Node head;
    private int size;

    public LL(int size) {
        this.size = 0;
    }

    LL() {
        size = 0;
    }

    class Node {
        String data;
        Node next;


        public Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }


    public void printList() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        while (currentNode.next != null) {
            System.out.print(currentNode.next + "--->");
            currentNode = currentNode.next;

        }
        System.out.println("null");

    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {

        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        if (head.next == null) {
            System.out.println("Head next is null");
            head = null;
            return;
        }
        Node traversingNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            traversingNode = traversingNode.next;
        }

        traversingNode.next = null;

    }

    public int getSize() {

        return size;
    }

    public void reverseNode() {
        if(head == null || head.next == null){
            System.out.println("Return Heqd is null");
            return;
        }


        Node previousNode = head;
        Node currentNode = head.next;//0 0 0

        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;

            //update
            previousNode = currentNode;
            currentNode = nextNode;

        }
        head.next = null;

    }

    public static void main(String[] args) {

        LinkedList<String> stringLinkedList = new LinkedList<String>();
        stringLinkedList.addFirst("a");
        System.out.println(stringLinkedList.size());

        stringLinkedList.addFirst("is");
        System.out.println(stringLinkedList.size());

        System.out.println(stringLinkedList);
        String a = "Anc".toLowerCase(Locale.ROOT);
        stringLinkedList.addLast("Linked");
        System.out.println(stringLinkedList.size());

        for (int i = 0; i < stringLinkedList.size(); i++) {
            System.out.println(stringLinkedList.get(i) + "---->>");
        }
        System.out.println("NULL");

//        list.
    }
}
