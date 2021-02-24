package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PathTest {
    @Test
    public void edgePairTest00() {
        Path p = new Path(new int[]{1, 2, 3});
        assertTrue(p.indexOf(new Node(2)) == 1);
    }
}
