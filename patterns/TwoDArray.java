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

public class TwoDArray {
    public static void main(String[] args) {
        //Creating an 2D array

        //Insert an input
        //array[i][j]
        //Output
        //array[i][j]
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("Input total row : ");
        int row = sc.nextInt();
        System.out.print("Input total column : ");
        int col = sc.nextInt();

        int[][] array = new int[row][col];
        System.out.print("Enter the number of elements you want to store: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Row [" + i + "]:  Column " + j + " :");
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }
}
