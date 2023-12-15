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

package patterns;public class StringsEquivalent {
    class Solution {
        public boolean checkAlmostEquivalent(String word1, String word2) {
            int[] freq1 = new int[26]; // Frequency array for characters in word1
            int[] freq2 = new int[26]; // Frequency array for characters in word2

            // Count the frequency of characters in word1
            for (char c : word1.toCharArray()) {
                freq1[c - 'a']++;
            }

            // Count the frequency of characters in word2
            for (char c : word2.toCharArray()) {
                freq2[c - 'a']++;
            }


            // Compare the frequencies of characters
            for (int i = 0; i < 26; i++) {
                if (Math.abs(freq1[i] - freq2[i]) > 3) {
                    return false;
                }
            }

            return true; // Return true if differences are at most 3
        }
    }


    public static void main(String[] args) {

    }
}
