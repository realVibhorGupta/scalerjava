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

package hashmaps;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomHashMap<K, V> {

    private List<MapNode<K, V>> bucket;
    private int capacity, size;
    private final int INITIAL_CAPACITY = 5;

    private static class MapNode<K, V> {

        K key;
        V value;
        //in Java 1.5 , BST is used in place of LinkedLIst and here we should use doubleended LinkedList
        MapNode<K, V> next;

        public MapNode(K key, V value) {
            this.key = key;
            this.value = value;
        }


    }

    public CustomHashMap() {
        bucket = new ArrayList<>();
        capacity = INITIAL_CAPACITY;
        for (int i = 0; i < capacity; i++) {
            bucket.add(null);
        }
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;

        }
        return null;
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return hashCode % capacity;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;

        MapNode<K, V> newEntry = new MapNode<K, V>(key, value);
        head = bucket.get(bucketIndex);
        newEntry.next = head;
        bucket.set(bucketIndex, newEntry);

        double loadFactor = (1.0 * size) / capacity;
        System.out.println("Inserting Key:" + key);
        System.out.println("Load factor:" + loadFactor);
        if (loadFactor > 0.75) {
            rehash();
        }

    }

    private void rehash() {
        System.out.println("Rehashing buckets");
        List<MapNode<K, V>> temp = bucket;
        bucket = new ArrayList<>();
        capacity *= 2;
        for (int i = 0; i < capacity; i++) {
            bucket.add(null);
        }
        size = 0;

        for (int i = 0; i < temp.size(); i++) {
            MapNode<K, V> head = temp.get(i);
            while (head != null) {
                put(head.key, head.value);
                head = head.next;
            }
        }
    }

    public void remove(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = bucket.get(bucketIndex);
        MapNode<K, V> previous = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (previous == null) {
                    bucket.set(bucketIndex, head.next);
                } else {
                    previous.next = head.next;
                }
                head.next = null;
                size--;
                break;
            }
            previous = head;
            head = head.next;
        }


    }
}
