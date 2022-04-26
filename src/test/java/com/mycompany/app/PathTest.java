package com.mycompany.app; # hey

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PathTest {
    @Test
    public void edgePairTest00() {
        // satisfies
        //  - edge-pair
        // [1, 2, 3]
        // [2, 3, 4]
        // [2, 3, 2]
        // [3, 2, 3]
        //  - path
        // [1, 2, 3, 2, 3, 4]
        Path p = new Path(new int[]{1, 2, 3});
        assertTrue(p.indexOf(new Node(2)) == 1);
    }

    @Test
    public void edgePairTest01() {
        // satisfies
        //  - edge-pair
        // [1, 2, 5]
        // [3, 2, 5]
        //  - path
        // [1, 2, 3, 2, 5]
        Path p = new Path(new int[]{1});
        assertTrue(p.indexOf(new Node(0)) == -1);
    }

    @Test
    public void edgePairTest02() {
        // satisfied
        //  - edge-pair
        // [1, 2, 5]
        //  - path
        // [1, 2, 5]
        Path p = new Path(new int[0]);
        assertTrue(p.indexOf(new Node(0)) == -1);
    }
}
