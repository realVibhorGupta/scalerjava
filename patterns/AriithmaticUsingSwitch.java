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

public class AriithmaticUsingSwitch {
    public static void main(StringClass[] args) {
        int a = 10, b= 20;

        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        int r;
        System.out.println("Enter 1,2,3,4 for add,sub,mul,div respectively! ");
        switch (c) {
            case 1 -> {
                r = a + b;
                System.out.println(r);
            }
            case 2 -> {
                r = a - b;
                System.out.println(r);
            }
            case 3 -> {
                r = a * b;
                System.out.println(r);
            }
            case 4 -> {
                r = a / b;
                System.out.println(r);
            }
            default -> System.out.println("Try Again...");
        }
    }
}

