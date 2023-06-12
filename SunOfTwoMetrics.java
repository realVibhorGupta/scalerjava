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

import java.util.Scanner;

public class SunOfTwoMetrics {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int rows =  scanner.nextInt();
        int columns =  scanner.nextInt();

        //Mentions two arrays
        int[][] a = new int[rows][columns];
        int[][] b = new int[rows][columns];

       matrixRead(a);
       matrixRead(b);

        int[][] c = new int[rows][columns];
        for(int i = 0; i< rows;i++){
            for (int j = 0 ; j< columns;j++){
                c[i][j] = a[i][j]+ b[i][j];

            }

        }

//        My changes
//        calculateMatrix();



    }
//    Read the matrix
    static void matrixRead(int[][] mat){
        for(int i = 0; i< mat.length;i++){
            for (int j = 0 ; j< mat.length;j++){
                mat[i][j] = scanner.nextInt();
            }
        }
    }
//    Calculate the sum of the matrix
    static  void calculateMatrix(int[][] mat){
        for(int i = 0; i< mat.length;i++){
            for (int j = 0 ; j< mat.length;j++){
                mat[i][j] = mat[i][j]+ mat[i][j];
            }
        }
    }

//    static void

}
