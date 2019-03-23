package com.asa;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShapeClassifierSingle {
    @Test
    public void test0000() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,Yes,32,32,1,1"));
    }

    @Test
    public void test0001() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No,31,31"));
    }

    @Test
    public void test0002() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,34,33"));
    }

    @Test
    public void test0003() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,34,34"));
    }

    @Test
    public void test0004() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,No"));
    }

    @Test
    public void test0005() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No,100"));
    }

    @Test
    public void test0006() {
        assertEquals("Yes", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No,101"));
    }

    @Test
    public void test0007() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,26,26,26"));
    }

    @Test
    public void test0008() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,1,25,25"));
    }

    @Test
    public void test0009() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,4095,25,26,26"));
    }

    @Test
    public void test0010() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,33,4095"));
    }

    @Test
    public void test0011() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,1,26,4095,4095"));
    }
}
