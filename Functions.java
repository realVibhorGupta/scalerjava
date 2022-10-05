/*
 * Copyright (c) 2022. , Sunshine.Code <sunshinethelearningsite@gmail.com>
 *   License: MIT
 * The MIT License (MIT).
 * Copyright © 2022, Sunshine.Code <sunshinethelearningsite@gmail.com>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy   of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions: .The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *  .
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

public class Functions {
    // Using the sides' parameter, change this code so that it returns
// the correct range of roll values no matter the number of sides provided.
// ex. For an 8-sided dice the numbers returned should be integers between 1-8

    public static void main(String[] args) {

        rollDice(8);
    }
    public static void rollDice(int sides){
        // random num between 0 and (almost) 1
        double randomNumber=Math.random();

        // change range to 0 to (almost) 6
        randomNumber=randomNumber*6;

        // shift range up one
        randomNumber=randomNumber+1;

        // cast to integer (ignore decimal part)
        // ex. 6.998 becomes 6

        // return statement
    }
}
