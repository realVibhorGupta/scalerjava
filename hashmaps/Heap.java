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

package hashmaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Heap<T extends Comparable<T>> {
    private final ArrayList<T> list;

    public Heap(ArrayList<T> list) {
        this.list = list;
    }

    public static void main(String[] args) {

//        PriorityQueue<Integer> integers = new PriorityQueue<>();
//        PriorityQueue<Integer> integersReverse = new PriorityQueue<>(Collections.reverseOrder());
////log(n)
//        integers.add(10);
//        integers.add(50);
//        integers.add(25);
//        integers.add(20);
//        integers.add(10);
//
//        //get O(logn)
//        System.out.println(integers.remove());

        int[] array = {10, 1, 4, 7, 2, 13, 3};
        int k = 3;
        kLargestElement(array, k);
    }

    public static void kLargestElement(int[] array, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int window = 0;

        while (window < k) {
            priorityQueue.add(array[window]);
            window++;
        }

        while (window < array.length) {
            if (array[window] > priorityQueue.peek()) {
                priorityQueue.remove();
                priorityQueue.add(array[window]);
            }
            window++;
        }

        while (priorityQueue.size() > 0) {
            System.out.println(priorityQueue.remove());
        }
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}
