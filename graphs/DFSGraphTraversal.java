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

public class DFSGraphTraversal {

    public static void dfs(int node, boolean[] visited,
                           ArrayList<ArrayList<Integer>> adjacentList,
                           ArrayList<Integer> ls) {
        if (adjacentList == null) {
            return;
        }

        visited[node] = true;
        ls.add(node);
        for (Integer it : adjacentList.get(node)) {
            if (!visited[it]) {
                dfs(it, visited, adjacentList, ls);
            }
        }
    }


    public ArrayList<Integer> dfsOfGraph(int visited,
                                         ArrayList<ArrayList<Integer>> adjacentList) {
        boolean[] vis = new boolean[visited + 1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adjacentList, ls);
        return ls;
    }
}
