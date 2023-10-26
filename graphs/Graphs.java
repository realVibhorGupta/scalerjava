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

package graphs;

import java.util.ArrayList;

public class Graphs {

    public static void main(String[] args) {
        int n = 3, m = 3;
        int adj[][] = new int[n + 1][n + 1];
        //edje 1=2
        adj[1][2] = 1;
        adj[2][1] = 1;


        //edge 2=3
        adj[2][3] = 1;
        adj[3][2] = 1;


        //edge1= 3
        adj[1][3] = 1;
        adj[3][1] = 1;


        //store adjency matrix
//
//        adj[u][v] = 1;
//        adj[v][u] = 1;

//        1
//        List
        ArrayList<ArrayList<Integer>> adjacentList = new ArrayList<ArrayList<Integer>>();
//       n+1
        for (int i = 0; i < n; i++) {
            adjacentList.add(new ArrayList<>());
        }
        //edge 1=2
        adjacentList.get(1).add(2);
        adjacentList.get(2).add(1);

        adjacentList.get(2).add(3);
        adjacentList.get(3).add(2);

        adjacentList.get(1).add(3);
        adjacentList.get(3).add(1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < adjacentList.get(i).size(); j++) {
                System.out.print(adjacentList.get(i).get(j) + " ");
            }
            System.out.println();

        }

    }
}
