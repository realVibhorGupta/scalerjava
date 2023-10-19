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

package stacks;

import java.util.Stack;

public class ImplementQueuesUsingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public ImplementQueuesUsingStacks() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        first.push(item);
    }

    public int remove() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peeked = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }

}
