package com.asa;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShapeClassifierDouble {
    @Test
    public void test0000() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,1,32"));
    }

    @Test
    public void test0001() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,31,1"));
    }

    @Test
    public void test0002() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,31,4095"));
    }

    @Test
    public void test0003() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,31"));
    }

    @Test
    public void test0004() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,32,1"));
    }

    @Test
    public void test0005() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,32"));
    }

    @Test
    public void test0006() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,4095,31"));
    }

    @Test
    public void test0007() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,4095,32"));
    }

    @Test
    public void test0008() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No"));
    }

    @Test
    public void test0009() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,Yes,31,31"));
    }

    @Test
    public void test0010() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,No,1,31,1,1"));
    }

    @Test
    public void test0011() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,Yes,32,32"));
    }

    @Test
    public void test0012() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No,32,31,1,1"));
    }

    @Test
    public void test0013() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No,32,4095"));
    }

    @Test
    public void test0014() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No,4095"));
    }

    @Test
    public void test0015() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No"));
    }

    @Test
    public void test0016() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,No,31,32,1,1"));
    }

    @Test
    public void test0017() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,Yes,1,1"));
    }

    @Test
    public void test0018() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,1,34"));
    }

    @Test
    public void test0019() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,1"));
    }

    @Test
    public void test0020() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,33"));
    }

    @Test
    public void test0021() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,34,1"));
    }

    @Test
    public void test0022() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,34,34"));
    }

    @Test
    public void test0023() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,34,4095"));
    }

    @Test
    public void test0024() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,4095,4095,1"));
    }

    @Test
    public void test0025() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No"));
    }

    @Test
    public void test0026() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Small,Yes,33,33,4095,1"));
    }

    @Test
    public void test0027() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,No,33,1"));
    }

    @Test
    public void test0028() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,No,34,33,1"));
    }

    @Test
    public void test0029() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,No,4095,33"));
    }

    @Test
    public void test0030() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,Yes,1,4095,4095,1"));
    }

    @Test
    public void test0031() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Small,Yes,33,34,1"));
    }

    @Test
    public void test0032() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Small,Yes"));
    }

    @Test
    public void test0033() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No,1"));
    }

    @Test
    public void test0034() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No,100,1,1,1"));
    }

    @Test
    public void test0035() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No,4095,1,1,1"));
    }

    @Test
    public void test0036() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No"));
    }

    @Test
    public void test0037() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,Yes,101,1,1,1"));
    }

    @Test
    public void test0038() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Small,No,101"));
    }

    @Test
    public void test0039() {
        assertEquals("Yes", new com.asa.ShapeClassifier().evaluateGuess("Line,Small,Yes,100"));
    }

    @Test
    public void test0040() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,1,1,26,4095"));
    }

    @Test
    public void test0041() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,1,26,25,4095"));
    }

    @Test
    public void test0042() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,1,4095,26,25"));
    }

    @Test
    public void test0043() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,4095,26,4095"));
    }

    @Test
    public void test0044() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,4095,4095,1"));
    }

    @Test
    public void test0045() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25"));
    }

    @Test
    public void test0046() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,1,4095,25"));
    }

    @Test
    public void test0047() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,1"));
    }

    @Test
    public void test0048() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,25,26,1"));
    }

    @Test
    public void test0049() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,25,26,4095"));
    }

    @Test
    public void test0050() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,25,4095"));
    }

    @Test
    public void test0051() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26,1,25"));
    }

    @Test
    public void test0052() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26,1,4095"));
    }

    @Test
    public void test0053() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26,25,26"));
    }

    @Test
    public void test0054() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26,25"));
    }

    @Test
    public void test0055() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26,26,1"));
    }

    @Test
    public void test0056() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26,4095,26"));
    }

    @Test
    public void test0057() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26"));
    }

    @Test
    public void test0058() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,4095,26,1"));
    }

    @Test
    public void test0059() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26"));
    }

    @Test
    public void test0060() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,4095,4095,26,26"));
    }

    @Test
    public void test0061() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No"));
    }

    @Test
    public void test0062() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,Yes,26,25"));
    }

    @Test
    public void test0063() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,Yes,26,26,26,26"));
    }

    @Test
    public void test0064() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,No,25,25,25,25"));
    }

    @Test
    public void test0065() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,No,4095,25,26,25"));
    }

    @Test
    public void test0066() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,1,33,1"));
    }

    @Test
    public void test0067() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,33,4095"));
    }

    @Test
    public void test0068() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,34"));
    }

    @Test
    public void test0069() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,4095,34,4095,1"));
    }

    @Test
    public void test0070() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No"));
    }

    @Test
    public void test0071() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Small,Yes,34,1,4095,1"));
    }

    @Test
    public void test0072() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,25,26,26"));
    }

    @Test
    public void test0073() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,4095,1,25,1"));
    }

    @Test
    public void test0074() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No"));
    }

    @Test
    public void test0075() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,Yes,25,1,1,26"));
    }

    @Test
    public void test0076() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,No,1,25,1,26"));
    }

    @Test
    public void test0077() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,26,4095,25,25"));
    }

    @Test
    public void test0078() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,4095,26,4095,4095"));
    }
}
