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

package patterns;public class SwapAlternate {
    static void printArray(int array[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "");
        }
    }

    private static void swap(int arr, int arr1) {
        int temp;
        temp = arr;
        arr = arr1;
        arr = temp;
    }

    private static void swap(int arr[], int index1, int index2) {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


    private static void swapAlternate(int[] array, int size) {

        for (int i = 0; i < size; i += 2) {
            if (i + 1 < size) {
                swap(array, i,i + 1);
            }
        }

    }
//    private static void swap(int[] arr, int index1, int index2) {
//        int temp ;
//        temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//
//    }

    public static void main(String[] args) {

        int even[] = {1, 2, 34, 4, 5, 7, 2, 9, 5, 11};
        int odd[] = {1, 2, 34, 4, 5, 7, 2, 9, 5};


        swapAlternate(even, 10);
        swapAlternate(odd, 9);
        printArray(even, 10);
        printArray(odd , 9);
    }
}
