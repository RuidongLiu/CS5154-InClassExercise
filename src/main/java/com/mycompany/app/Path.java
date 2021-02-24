package com.mycompany.app;

import java.util.ArrayList;

public class Path {
    ArrayList<Node> path;

    Path() {
        path = new ArrayList<>();
    }

    Path(int[] array) {
        path = new ArrayList<>();
        for (int i = 0; i < array.length; ++i) {
            path.add(new Node(array[i]));
        }
    }

    public int indexOf(Node n) {
        for (int i = 0; i < path.size(); ++i) {
            if (path.get(i).equals(n))
                return i;
        }
        return -1;
    }
}
