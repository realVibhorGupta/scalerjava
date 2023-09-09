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

package recursion2;

import java.util.ArrayList;

public class LinearSearchWithRecursion {

    static boolean linearSearchInArrayWithRecursion(int[] array, int target, int index) {
        if (array.length == 0) {
            return false;
        }
        if (index > array.length - 1) {
            return false;
        }
        return array[index] == target || linearSearchInArrayWithRecursion(array, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }

    }


    private static int findIndexFromLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexFromLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> arrayList = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            arrayList.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> arrayList) {
        if (index == arr.length) {
            return arrayList;
        }
        if (arr[index] == target) {
            arrayList.add(index);
        }
        return findAllIndex(arr, target, index + 1, arrayList);
    }

    public static void main(String[] args) {

        int[] arr = {1, 22, 33, 14, 5, 16, 7, 8, 9};
        int[] array = {1, 2, 3, 4, 5, 5, 5, 5, 16, 7, 8, 9};
        System.out.println(linearSearchInArrayWithRecursion(arr, 15, 0));

        System.out.println(findIndex(arr, 22, 0));
        System.out.println(findIndexFromLast(arr, 5, arr.length - 1));
        findAllIndex(array, 5, 0);
        System.out.println(arrayList);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);

    }
}
