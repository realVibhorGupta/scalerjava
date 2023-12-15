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

package patterns;

//a array
public class BinarySearch {
    static int binarySearch(int[] array, int size, int key) {
        int start = 0;
        int end = size - 1;
        int mid = start + (end-start)/2;
        while (start <= end) {
            if (array[mid] == key) {
                return mid;
            }

//go to right side
                if (key > array[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            mid =  start + (end-start)/2;
        }
        return -1;
    }

    public static void main(String[] args) {

        int even[] = {2, 3, 6, 9, 13, 56};
        int odd[] = {45,76,87,134,674};

        int evenIndex = binarySearch(even,6,13);
        int oddIndex= binarySearch(odd,5,76);
        int oddIndex1= binarySearch(odd,5,726);

        System.out.println(evenIndex);
        System.out.println(oddIndex);
        System.out.println(oddIndex1);
    }
}
