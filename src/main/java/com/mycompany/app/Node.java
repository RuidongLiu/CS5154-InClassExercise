package com.mycompany.app;

public class Node {
    private int value;

    Node(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Node)) {
            return false;
        }

        return this.value == ((Node) o).value;
    }
}
