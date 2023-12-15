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

package patterns;import java.util.Arrays;
import java.util.*;

public class DuplicateInArray {

    public static void main(String[] args) {
        int[] array = {2, 45, 67, 33, 66, 45};

//        System.out.println(findDuplicate(array));
        System.out.println(findDuplicateByHash(array));
        System.out.println(findDuplicateBySort(array));

    }

//    private static int findDuplicate(int[] array) {
//        int counter = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            counter = counter ^ array[i];
//        }
//
//        for (int i = 0; i < array.length - 1; i++) {
//            counter = counter ^ i;
//        }
//
//
//        return counter;
//    }

    private static int findDuplicateByHash(int[] array) {
        Set<Integer> seen = new HashSet<>();
        for (int num : array) {
            if (seen.contains(num)) {
                return num; // Duplicate found
            }
            seen.add(num);
        }
        return -1; // No duplicate found
    }
    private static int findDuplicateBySort(int[] array) {
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                return array[i]; // Duplicate found
            }
        }
        return -1; // No duplicate found
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Convert to 0-based index
            if (nums[index] < 0) {
                result.add(index + 1); // Duplicate found
            } else {
                nums[index] = -nums[index]; // Mark presence
            }
        }

        // Restore the original array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return result;
    }
}
