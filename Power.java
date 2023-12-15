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

public class Power {

    public static int power(int a, int b){
        int result =  1;
        for (int i = 1; i <= b  ; i++) {
            result = result * a;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(power(2,3));

    }

        public double myPow(double x, int n) {
            if (x == 0) {
                return 0; // 0 raised to any power is still 0
            }

            if (n == 0) {
                return 1; // Any number raised to the power of 0 is 1
            }

            double result = 1.0;
            long absN = Math.abs((long) n); // Handle integer overflow for n = Integer.MIN_VALUE

            while (absN > 0) {
                if (absN % 2 == 1) { // If n is odd
                    result *= x;
                }
                x *= x; // Square x
                absN /= 2; // Divide n by 2
            }

            return n < 0 ? 1.0 / result : result;
        }
        static double morePrecision(int n,int precesion,  int tempSolution){
            double factor = 1;
            double answer = tempSolution;
            for (int i = 0; i < precesion; i++) {
                factor = factor / 10;
                for (double j = answer; j*j < n; j=j+factor) {
                        answer=j;
                }
            }
            return answer;
        }


}
