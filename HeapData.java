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

public class HeapData {
    //Max Heap
//logn
    int insert(int[] array, int n, int targetValue) {

        //TODO:conditions to check right and left
        if (targetValue > n) {
            return -1;
        }

        if (targetValue == array[n]) {
            return array[n];
        }
        if (array.length == 0) {
            return -1;
        }
        n = n + 1;
        array[n] = targetValue;
        int i = n;//last element

        while (i > 1) {
            int parent = i / 2;


            if (array[parent] < array[i]) {
                swap(array, parent, i);
                i = parent;
            }


        }
        return -1;
    }

    private static void swap(int[] array, int parent, int i) {
        int temp = array[parent];
        array[parent] = array[i];
        array[i] = temp;

    }

    //logn
// Function to delete the root from Heap
    static int deleteRoot(int arr[], int n) {
        // Get the last element
        int lastElement = arr[n - 1];

        // Replace root with first element
        arr[0] = lastElement;

        // Decrease size of heap by 1
        n = n - 1;

        // heapify the root node
        heapify(arr, n, 0);

        // return new size of Heap
        return n;
    }


    // To heapify a subtree rooted with node i which is
    // an index in arr[].Nn is size of heap
    static void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int leftNode = 2 * i + 1; // left = 2*i + 1
        int rightNode = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (leftNode < n && arr[leftNode] > arr[largest])
            largest = leftNode;

        // If right child is larger than largest so far
        if (rightNode < n && arr[rightNode] > arr[largest])
            largest = rightNode;

        // If largest is not root
        if (largest != i) {
            swap(arr, largest, i);
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    /* A utility function to print array of size N */
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        // Array representation of Max-Heap
        // 10
        //    /  \
        // 52*1+1    3
        //  / \
        // 2   4
        int arr[] = {10, 5, 3, 2, 4};

        int n = arr.length;

        n = deleteRoot(arr, n);

        printArray(arr, n);
    }
}
