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
public class StackDemo {
    protected Object[] data;
    int ptr = -1;
    protected static final int DEFAULT_SIZE = 10;

    public StackDemo() {
        this(DEFAULT_SIZE);
    }

    public StackDemo(int size) {
        this.data = new Object[size];
    }


    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at the last node
    }

    public boolean isEmpty() {
        return ptr == -1; // ptr is at the last node
    }

    public Object pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot Pop As Stack is null");
        }
        return data[ptr--];
    }

    public Object peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot Peek As Stack is null");
        }
        return data[ptr];
    }

}
