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

public class E2Question1 {
//    Problem Description
//
//    Your younger brother is going to a modern school. In his school, there was a coding competition planned. The pannel asked a question "Write a program which can perform the task - Add two numbers and divide them by a third number and print the remainder".
//    You are a programmer and your brother asks you to write a code that helps him to check his approach.
//
//
//    Problem Constraints
//
//0 <= N1, N2 <= 10000000
//            1 <= N3 <= 10000000
//
//
//    Input Format
//
//    First line is number N1.
//
//    Second line is number N2.
//
//    Third line is number N3.
//
//
//
//            Output Format
//
//    Print the value of remainder.


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int N3 = scanner.nextInt();

        int sum = N1 + N2;
        int remainder = sum % N3;

        System.out.println(remainder);
    }
}
