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

public class FindFiestAndLastOccurrence {

    public static int first = -1, last = -1;

    public int[] firstAndLastOccurrence(int[] nums, int target) {

        int[] result = {-1, -1};
        result[0] = search(nums, target, true);
        result[1] = search(nums, target, false);

        if (result[0] != -1) {
            result[1] = search(nums, target, false);
        }
        return result;
    }

    //fucnction to search the target Value
    int search(int[] nums, int target, boolean isStartIndex) {

        int start = 0;
        int result = -1;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;


            if (target < nums[mid]) {
                end = end - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {

                //potential Answer fores
                result = mid;
                if (isStartIndex == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }


        }


        return result;
    }

    public static void main(String[] args) {

    }
}
