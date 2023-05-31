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

public class Arrays {
    public static void main(StringClass[] args){
        int[] array = {3,4,5,6};

        int[] array2 = new int[10];

       System.out.println( array[2]);

       array[1] = 40 ;
       System.out.println(array[1]);

       System.out.println(array.length);

       for(int i=0; i < array.length ; i++){
            System.out.println(array[i]);
       }

//       2D array  = Matrix arr[][]
//        Predefinedd vaalue is 0
        int[][]  TwoDArrayy = new int[5][5];

       //set
        TwoDArrayy[2][3] = 90;
        System.out.println(TwoDArrayy[2][3]);

        //get
        System.out.println(TwoDArrayy[1][1]);

        //row countt

        System.out.println(TwoDArrayy.length);

        //col count

        System.out.println(TwoDArrayy[0].length);

        //Travel
        for(int i = 0; i < TwoDArrayy.length; i++) {
            for(int j = 0; j < TwoDArrayy[0].length; j++) {
                System.out.print(TwoDArrayy[i][j]);
            }
        }



//        Find maximum value In an array

        int[] arrayMax =  {5, -3, 7,6,2,1,8,3,0,4};

        int max= Integer.MIN_VALUE ; //worst case scenario

        for(int i = 0; i <arrayMax.length  ; i++) {
                if(arrayMax[i] > max){
                    max = arrayMax[i];
                }
        }
        System.out.println(max);


//Reverse an array

    }
}
