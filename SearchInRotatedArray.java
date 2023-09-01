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

public class SearchInRotatedArray {

    static int findPivot(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            //4 cases
            if ( mid < end && array[mid] > array[mid + 1]) {
                return mid;
            }
            if (mid > start && array[mid] < array[mid - 1]) {
                return mid - 1;
            }

            

        }
    }

    static int binarySearch(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < array[mid]) {
                end = mid - 1;
            }
            // [60, 50, 40, 30, 20, 10, 100, 90, 80, 70]
            if (mid > start && array[mid] < array[mid - 1]) {
                return mid - 1;
            }
            //11 13 15mid= 0 4 8
            if (array[mid] <= array[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

    }
}

