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

package patterns;public class CeilingOfANumber {

    //    Ceiling =  smallest element in a array which is greater than or equal to target.
    //Floor =   greatest element in a array which is smaller or equal than the target
  static   int ceilingNumber(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        //Base Cae
        if (nums.length == 0) {
            return -1;
        }
        //Edge case
        if (nums[start] == nums[end]) {
            target = nums[start];
            return target;
        }

        while (start <= end){
            if(nums[mid] < target){
                start = mid +1;

            }else if(nums[mid] > target){
                end = mid-1;
            }else{
                return mid;
            }
            mid = start + (end - start) / 2;

        }

        return start;
    }

    public static void main(String[] args) {

        int array[] = {2, 3, 5, 10, 17, 38, 90, 105};
        int result = ceilingNumber(array, 11);
        System.out.println(result);
    }
}
