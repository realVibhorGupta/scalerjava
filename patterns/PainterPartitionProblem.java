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

package patterns;public class PainterPartitionProblem {

    static int getPartition(int[] array, int m, int n) {

        int result = -1;
        int start = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        int end = sum;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (isPossible(array, n, m, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return result;
    }

    static boolean isPossible(int[] array, int m, int n, int mid) {
        int studentCount = 1;
        int pageSum = 0;
        for (int i = 0; i < n; i++) {
            if (pageSum + array[i] <= mid) {
                pageSum += array[i];
            } else {
                studentCount++;
                if (studentCount > n || array[i] > mid) {
                    return false;
                }
                pageSum = array[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {


    }
}
