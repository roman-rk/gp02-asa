package com.asa;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShapeClassifiesBasis {
    @Test
    public void test0000() {
        assertEquals("Yes", new ShapeClassifier().evaluateGuess("Line,Large,Yes,102"));
    }

    @Test
    public void test0001() {
        assertEquals("Yes", new ShapeClassifier().evaluateGuess("Line,Large,No,101"));
    }

    @Test
    public void test0002() {
        assertEquals("No", new ShapeClassifier().evaluateGuess("Line,Large,No,102"));
    }

    @Test
    public void test0003() {
        assertEquals("Yes", new ShapeClassifier().evaluateGuess("Line,Small,Yes,100"));
    }

    @Test
    public void test0004() {
        assertEquals("No", new ShapeClassifier().evaluateGuess("Line,Small,Yes,102"));
    }

    @Test
    public void test0005() {
        assertEquals("No", new ShapeClassifier().evaluateGuess("Square,Large,Yes,102"));
    }

    @Test
    public void test0006() {
        assertEquals("Yes", new ShapeClassifier().evaluateGuess("Ellipse,Large,Yes,34,35"));
    }

    @Test
    public void test0007() {
        assertEquals("Yes", new ShapeClassifier().evaluateGuess("Circle,Large,Yes,34,34"));
    }

    @Test
    public void test0008() {
        assertEquals("Yes", new ShapeClassifier().evaluateGuess("Scalene,Large,Yes,33,34,35"));
    }

    @Test
    public void test0009() {
        assertEquals("Yes", new ShapeClassifier().evaluateGuess("Rectangle,Large,Yes,25,26,25,26"));
    }

}
