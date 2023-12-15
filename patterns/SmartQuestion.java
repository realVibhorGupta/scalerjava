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

package patterns;//divide 1330 into notes of 100, 50,  20 , 1
public class SmartQuestion {
    public static void main(String[] args) {

        int totalAmount = 1330;
        int counter = 1;


        switch (counter) {
            case 100 -> {
                totalAmount = totalAmount / 100;
                totalAmount = totalAmount % 100;
                System.out.println(totalAmount);
            }
            case 50 -> {
                totalAmount = totalAmount / 50;
                totalAmount = totalAmount % 50;
                System.out.println(totalAmount);
            }
            case 20 -> {
                totalAmount = totalAmount / 20;
                totalAmount = totalAmount % 20;
                System.out.println(totalAmount);
            }
            case 10 -> {
                totalAmount = totalAmount / 10;
                totalAmount = totalAmount % 10;
                System.out.println(totalAmount);
            }
//            case 1:
//                totalAmount = totalAmount / 1;
//                totalAmount = totalAmount % 1;
//                System.out.println(totalAmount);
//                break;
            default -> System.out.println("Some went worng");
        }




    }
}
