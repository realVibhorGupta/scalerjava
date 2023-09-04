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

public class RecNTo1 {
    static void nto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        nto1(n - 1);
    }

    public static void main(String[] args) {

        nto1(5);
        System.out.println("========");
        rev(6);

        System.out.println("fact");


        System.out.println(fact(5));

        System.out.println("sum");
        System.out.println(sum(5));
        System.out.println("digitSum");
        System.out.println(digitSum(234));
        System.out.println("digitProd");
        System.out.println(digitProd(125));
        System.out.println("reverseNumber");
        System.out.println(reverseNumber(125));
        System.out.println("palindrome");
        System.out.println(palindrome(125521));


        System.out.println("countNumberOfZeros:230500300:==");
        System.out.println(countNumberOfZeros(3021000));

        System.out.println("Count Steps to reduce it = 0");
        System.out.println(countSteps(123));
    }

    //palindrome =  12321
    private static boolean palindrome(int number) {
        return (number == reverseNumber(number));
    }

    //234 = 432  == rem = 4  ,3 ,2 =   +        400 + 30 + 2
    //= 234/10 = 23  2
    private static int reverseNumber(int num) {
        int digits = (int) (Math.log10(num) + 1);
        return helper(num, digits);
    }

    private static int helper(int num, int digits) {
        if (num % 10 == num) {
            return num;
        }
        return (num % 10) * (int) Math.pow(10, digits - 1) + helper(num / 10, digits - 1);

    }

    static void rev(int n) {
        if (n == 0) {
            return;
        }
        rev(n - 1);
        System.out.println(n);


    }


    static int fact(int n) {
        if (n == 1) {
            return 1;
        }


        return n * fact(n - 1);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    static int digitSum(int n) {
        //Base  Case
        //for the value 0
        if (n == 0) {
            return 0;
        }
        //234 rem= 4 +(3+2)


        return (n % 10) + digitSum(n / 10);
    }
    //num = number
    //digiProd = the function taking the input as int and return the outut using recursion

    static int digitProd(int num) {
        if (num == 1) {
            return 1;
        }
        return (num % 10) * digitProd(num / 10);
    }

    static int countNumberOfZeros(int number) {
        return helperMethod(number, 0);
    }

    static int helperMethod(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helperMethod(n / 10, c + 1);
        }
        return helperMethod(n / 10, c);
    }

        static int countSteps(int n) {
            return helpCountSteps(n, 0);
        }

        static int helpCountSteps(int n, int c) {
            if (n == 0) {
                return c;
            }
            if (n % 2 == 0) {
                return helpCountSteps(n / 2, c + 1);
            }
            return helpCountSteps(n - 1, c + 1);
        }
}
