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

package patterns;import java.util.Scanner;

public class LinearSearch {

    public static boolean isAvailable(int arr[], int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

//    Whether is 1 is present or not
        int[] arr = {5, 7, -2, 10, 22, -2, 0, 5, 22, 1};
        System.out.println("Enter The Element");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();

        boolean found = isAvailable(arr, 10, key);
        System.out.println(found);
//        Check weather It contains 1 or Not
    }
}
