package com.asa;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShapeClassifierTriple {
    @Test
    public void test0000() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,1,1"));
    }

    @Test
    public void test0001() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,1,4095,1,1"));
    }

    @Test
    public void test0002() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,1"));
    }

    @Test
    public void test0003() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,31,31,1,1"));
    }

    @Test
    public void test0004() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,31"));
    }

    @Test
    public void test0005() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,32,31,1"));
    }

    @Test
    public void test0006() {
        assertEquals("Yes", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,Yes,32,32"));
    }

    @Test
    public void test0007() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No,4095"));
    }

    @Test
    public void test0008() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,No"));
    }

    @Test
    public void test0009() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,Yes,31,32"));
    }

    @Test
    public void test0010() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,Yes,31,4095"));
    }

    @Test
    public void test0011() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,Yes,32,32,1"));
    }

    @Test
    public void test0012() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,Yes,32,4095,1,1"));
    }

    @Test
    public void test0013() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,Yes,4095,1,1,1"));
    }

    @Test
    public void test0014() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Large,Yes,4095,31"));
    }

    @Test
    public void test0015() {
        assertEquals("Yes", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,No,31,31"));
    }

    @Test
    public void test0016() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,No,32,32,1,1"));
    }

    @Test
    public void test0017() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,No,4095,32"));
    }

    @Test
    public void test0018() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,No,4095,4095"));
    }

    @Test
    public void test0019() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,Yes,1,31,1,1"));
    }

    @Test
    public void test0020() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,Yes,1,32"));
    }

    @Test
    public void test0021() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,Yes,31,32,1,1"));
    }

    @Test
    public void test0022() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,Yes,32,1"));
    }

    @Test
    public void test0023() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,Yes,32"));
    }

    @Test
    public void test0024() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Circle,Small,Yes"));
    }

    @Test
    public void test0025() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No,1,1"));
    }

    @Test
    public void test0026() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No,1,31"));
    }

    @Test
    public void test0027() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No,1,32,1,1"));
    }

    @Test
    public void test0028() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No,1"));
    }

    @Test
    public void test0029() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No,32,1,1,1"));
    }

    @Test
    public void test0030() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No,32"));
    }

    @Test
    public void test0031() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No,4095,4095"));
    }

    @Test
    public void test0032() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,No"));
    }

    @Test
    public void test0033() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,Yes,31,1"));
    }

    @Test
    public void test0034() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Large,Yes,4095,32,1,1"));
    }

    @Test
    public void test0035() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,No,31,32,1"));
    }

    @Test
    public void test0036() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,No,31,4095,1,1"));
    }

    @Test
    public void test0037() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,No,32,32"));
    }

    @Test
    public void test0038() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,No,32,4095"));
    }

    @Test
    public void test0039() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,No,4095,1"));
    }

    @Test
    public void test0040() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,No,4095,31,1,1"));
    }

    @Test
    public void test0041() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,Yes,1,4095"));
    }

    @Test
    public void test0042() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,Yes,31,31"));
    }

    @Test
    public void test0043() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,Yes,31"));
    }

    @Test
    public void test0044() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,Yes,32,31,1,1"));
    }

    @Test
    public void test0045() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,Yes,4095"));
    }

    @Test
    public void test0046() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Ellipse,Small,Yes"));
    }

    @Test
    public void test0047() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,1,1,4095,1"));
    }

    @Test
    public void test0048() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,1,34,4095"));
    }

    @Test
    public void test0049() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,1,4095,1"));
    }

    @Test
    public void test0050() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,1"));
    }

    @Test
    public void test0051() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,33,1,1,1"));
    }

    @Test
    public void test0052() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,33"));
    }

    @Test
    public void test0053() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,34,33,1"));
    }

    @Test
    public void test0054() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,34,34"));
    }

    @Test
    public void test0055() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,4095,1,4095"));
    }

    @Test
    public void test0056() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,4095,33"));
    }

    @Test
    public void test0057() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,No,4095"));
    }

    @Test
    public void test0058() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,Yes,33,33,4095,1"));
    }

    @Test
    public void test0059() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,Yes,34,4095,4095,1"));
    }

    @Test
    public void test0060() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,Yes,4095,34,1"));
    }

    @Test
    public void test0061() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Large,Yes"));
    }

    @Test
    public void test0062() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Small,No,33,34,4095,1"));
    }

    @Test
    public void test0063() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Small,No,33,4095"));
    }

    @Test
    public void test0064() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Small,No,34,34,4095"));
    }

    @Test
    public void test0065() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Small,No,4095,4095,1,1"));
    }

    @Test
    public void test0066() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Small,No"));
    }

    @Test
    public void test0067() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Small,Yes,1,33,4095"));
    }

    @Test
    public void test0068() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Small,Yes,34,1"));
    }

    @Test
    public void test0069() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Equilateral,Small,Yes,34"));
    }

    @Test
    public void test0070() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,No,1,1"));
    }

    @Test
    public void test0071() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,No,1,33,1,1"));
    }

    @Test
    public void test0072() {
        assertEquals("Yes", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,No,1,4095,4095"));
    }

    @Test
    public void test0073() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,No,34,1,4095,1"));
    }

    @Test
    public void test0074() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,No,34"));
    }

    @Test
    public void test0075() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,No,4095"));
    }

    @Test
    public void test0076() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,Yes,1"));
    }

    @Test
    public void test0077() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,Yes,33,33,1"));
    }

    @Test
    public void test0078() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,Yes,33,4095,4095,1"));
    }

    @Test
    public void test0079() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,Yes,34,34,4095"));
    }

    @Test
    public void test0080() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,Yes,4095,1,1"));
    }

    @Test
    public void test0081() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,Yes,4095,33,4095"));
    }

    @Test
    public void test0082() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,Yes,4095,4095"));
    }

    @Test
    public void test0083() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Large,Yes"));
    }

    @Test
    public void test0084() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Small,No,33,1,4095"));
    }

    @Test
    public void test0085() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Small,No,33"));
    }

    @Test
    public void test0086() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Small,No,34,4095,1"));
    }

    @Test
    public void test0087() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Small,No,4095,34,4095,1"));
    }

    @Test
    public void test0088() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Small,No"));
    }

    @Test
    public void test0089() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Small,Yes,1,34"));
    }

    @Test
    public void test0090() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Small,Yes,33,34,1"));
    }

    @Test
    public void test0091() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Isosceles,Small,Yes,34,33"));
    }

    @Test
    public void test0092() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No,1,1,1,1"));
    }

    @Test
    public void test0093() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No,100,1,1,1"));
    }

    @Test
    public void test0094() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No,100,1,1"));
    }

    @Test
    public void test0095() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No,100,1"));
    }

    @Test
    public void test0096() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No,100"));
    }

    @Test
    public void test0097() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No,101,1,1,1"));
    }

    @Test
    public void test0098() {
        assertEquals("Yes", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No,4095"));
    }

    @Test
    public void test0099() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,No"));
    }

    @Test
    public void test0100() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,Yes,1,1"));
    }

    @Test
    public void test0101() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,Yes,100"));
    }

    @Test
    public void test0102() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,Yes,101,1"));
    }

    @Test
    public void test0103() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Large,Yes,101"));
    }

    @Test
    public void test0104() {
        assertEquals("Yes", new com.asa.ShapeClassifier().evaluateGuess("Line,Small,No,1"));
    }

    @Test
    public void test0105() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Small,No,100"));
    }

    @Test
    public void test0106() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Small,No,101"));
    }

    @Test
    public void test0107() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Small,Yes,100,1,1,1"));
    }

    @Test
    public void test0108() {
        assertEquals("Yes", new com.asa.ShapeClassifier().evaluateGuess("Line,Small,Yes,100"));
    }

    @Test
    public void test0109() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Small,Yes,101,1,1,1"));
    }

    @Test
    public void test0110() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Small,Yes,101,1,1"));
    }

    @Test
    public void test0111() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Small,Yes,4095,1,1,1"));
    }

    @Test
    public void test0112() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Line,Small,Yes"));
    }

    @Test
    public void test0113() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,1,1,1,25"));
    }

    @Test
    public void test0114() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,1,1,25,1"));
    }

    @Test
    public void test0115() {
        assertEquals("Yes", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,No,1,25,1,25"));
    }

    @Test
    public void test0116() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,1,25,26,25"));
    }

    @Test
    public void test0117() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,1,25,26"));
    }

    @Test
    public void test0118() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,1,25"));
    }

    @Test
    public void test0119() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,1,4095,25"));
    }

    @Test
    public void test0120() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,1,4095,4095,4095"));
    }

    @Test
    public void test0121() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,1"));
    }

    @Test
    public void test0122() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,1,26"));
    }

    @Test
    public void test0123() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,1,4095,4095"));
    }

    @Test
    public void test0124() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,1"));
    }

    @Test
    public void test0125() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,25,1,25"));
    }

    @Test
    public void test0126() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,26,1,4095"));
    }

    @Test
    public void test0127() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,26,1"));
    }

    @Test
    public void test0128() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,26,4095,26"));
    }

    @Test
    public void test0129() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,4095,1,1"));
    }

    @Test
    public void test0130() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,4095,25"));
    }

    @Test
    public void test0131() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,25,4095"));
    }

    @Test
    public void test0132() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,1,1,4095"));
    }

    @Test
    public void test0133() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,1,4095,25"));
    }

    @Test
    public void test0134() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,1"));
    }

    @Test
    public void test0135() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,25,26,1"));
    }

    @Test
    public void test0136() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,25,25"));
    }

    @Test
    public void test0137() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,25,4095,26"));
    }

    @Test
    public void test0138() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,25,4095"));
    }

    @Test
    public void test0139() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,25"));
    }

    @Test
    public void test0140() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26,25,1"));
    }

    @Test
    public void test0141() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26,25,4095"));
    }

    @Test
    public void test0142() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26,26,26"));
    }

    @Test
    public void test0143() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26,26,4095"));
    }

    @Test
    public void test0144() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26,4095,1"));
    }

    @Test
    public void test0145() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,26"));
    }

    @Test
    public void test0146() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,4095,1,25"));
    }

    @Test
    public void test0147() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,26,4095,4095,25"));
    }

    @Test
    public void test0148() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,4095,1,25,26"));
    }

    @Test
    public void test0149() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,4095,25,1,1"));
    }

    @Test
    public void test0150() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,4095,25,1,25"));
    }

    @Test
    public void test0151() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,4095,26,1,1"));
    }

    @Test
    public void test0152() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,4095,26,25,26"));
    }

    @Test
    public void test0153() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,4095,26,26,25"));
    }

    @Test
    public void test0154() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,4095,26"));
    }

    @Test
    public void test0155() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,4095,4095,25,26"));
    }

    @Test
    public void test0156() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,No,4095"));
    }

    @Test
    public void test0157() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,Yes,1,1,25,4095"));
    }

    @Test
    public void test0158() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,Yes,1,26"));
    }

    @Test
    public void test0159() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,Yes,25,25,25,25"));
    }

    @Test
    public void test0160() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,Yes,25,25,26,4095"));
    }

    @Test
    public void test0161() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,Yes,26,1,4095,26"));
    }

    @Test
    public void test0162() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,Yes,26,25,26,26"));
    }

    @Test
    public void test0163() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,Yes,4095,1,26,4095"));
    }

    @Test
    public void test0164() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,Yes,4095,25"));
    }

    @Test
    public void test0165() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Large,Yes"));
    }

    @Test
    public void test0166() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,No,1,25,1,26"));
    }

    @Test
    public void test0167() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,No,25,4095,25,4095"));
    }

    @Test
    public void test0168() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,No,26"));
    }

    @Test
    public void test0169() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,No,4095,4095,4095,26"));
    }

    @Test
    public void test0170() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,No"));
    }

    @Test
    public void test0171() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,1,25,1,4095"));
    }

    @Test
    public void test0172() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,1,25,25,26"));
    }

    @Test
    public void test0173() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,1,4095,26,26"));
    }

    @Test
    public void test0174() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,25,1,25,25"));
    }

    @Test
    public void test0175() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,25,1,26,1"));
    }

    @Test
    public void test0176() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,25,25,25,26"));
    }

    @Test
    public void test0177() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,25,25,4095,1"));
    }

    @Test
    public void test0178() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,25,4095,1,26"));
    }

    @Test
    public void test0179() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,25,4095,26,25"));
    }

    @Test
    public void test0180() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,25"));
    }

    @Test
    public void test0181() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,26,1,25"));
    }

    @Test
    public void test0182() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,26,26,1,26"));
    }

    @Test
    public void test0183() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,26,4095,4095,4095"));
    }

    @Test
    public void test0184() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,4095,25,4095,25"));
    }

    @Test
    public void test0185() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,4095,26,1,26"));
    }

    @Test
    public void test0186() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,4095,26,26"));
    }

    @Test
    public void test0187() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Rectangle,Small,Yes,4095,4095,25,25"));
    }

    @Test
    public void test0188() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,1,34,1,1"));
    }

    @Test
    public void test0189() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,1,4095,4095"));
    }

    @Test
    public void test0190() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,33,34,4095"));
    }

    @Test
    public void test0191() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,33,34"));
    }

    @Test
    public void test0192() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,33,4095,1,1"));
    }

    @Test
    public void test0193() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,34,1,1,1"));
    }

    @Test
    public void test0194() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,34,33,4095,1"));
    }

    @Test
    public void test0195() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,34"));
    }

    @Test
    public void test0196() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,4095,34"));
    }

    @Test
    public void test0197() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No,4095"));
    }

    @Test
    public void test0198() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,No"));
    }

    @Test
    public void test0199() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,Yes,1,33"));
    }

    @Test
    public void test0200() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,Yes,33,1"));
    }

    @Test
    public void test0201() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,Yes,33"));
    }

    @Test
    public void test0202() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Large,Yes,4095,4095,4095,1"));
    }

    @Test
    public void test0203() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Small,No,1"));
    }

    @Test
    public void test0204() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Small,No,33,33"));
    }

    @Test
    public void test0205() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Small,No,34,4095"));
    }

    @Test
    public void test0206() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Small,No,4095,1,4095"));
    }

    @Test
    public void test0207() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Small,No,4095,33,1,1"));
    }

    @Test
    public void test0208() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Small,Yes,1,1,1"));
    }

    @Test
    public void test0209() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Small,Yes,34,34,1,1"));
    }

    @Test
    public void test0210() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Scalene,Small,Yes"));
    }

    @Test
    public void test0211() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,1,25,4095,1"));
    }

    @Test
    public void test0212() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,1,26,1,4095"));
    }

    @Test
    public void test0213() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,1,26,26,1"));
    }

    @Test
    public void test0214() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,1,26,4095,25"));
    }

    @Test
    public void test0215() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,1,26,4095,26"));
    }

    @Test
    public void test0216() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,1"));
    }

    @Test
    public void test0217() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,25,1,1,4095"));
    }

    @Test
    public void test0218() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,25,1,4095"));
    }

    @Test
    public void test0219() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,25,25,1,26"));
    }

    @Test
    public void test0220() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,25,26,26,25"));
    }

    @Test
    public void test0221() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,25,26,4095,25"));
    }

    @Test
    public void test0222() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,25,4095,4095,1"));
    }

    @Test
    public void test0223() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,25"));
    }

    @Test
    public void test0224() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,26,25,4095,4095"));
    }

    @Test
    public void test0225() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,26,26,4095,25"));
    }

    @Test
    public void test0226() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,26,26,4095"));
    }

    @Test
    public void test0227() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,26,4095,25,26"));
    }

    @Test
    public void test0228() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,26,4095,26"));
    }

    @Test
    public void test0229() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,26,4095"));
    }

    @Test
    public void test0230() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,4095,1,25,25"));
    }

    @Test
    public void test0231() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,4095,1"));
    }

    @Test
    public void test0232() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,4095,25,25,4095"));
    }

    @Test
    public void test0233() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,4095,26,25"));
    }

    @Test
    public void test0234() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,4095,26,26,1"));
    }

    @Test
    public void test0235() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,4095,4095,1,4095"));
    }

    @Test
    public void test0236() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,4095,4095,25,1"));
    }

    @Test
    public void test0237() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,4095,4095,26,4095"));
    }

    @Test
    public void test0238() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,No,4095"));
    }

    @Test
    public void test0239() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,Yes,26,25,1"));
    }

    @Test
    public void test0240() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,Yes,26"));
    }

    @Test
    public void test0241() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Large,Yes"));
    }

    @Test
    public void test0242() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,No,1,1,1,26"));
    }

    @Test
    public void test0243() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,No,1,26,25,25"));
    }

    @Test
    public void test0244() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,No,25,1,26,26"));
    }

    @Test
    public void test0245() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,No,25,25"));
    }

    @Test
    public void test0246() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,No,25,26"));
    }

    @Test
    public void test0247() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,No,26,1,26,25"));
    }

    @Test
    public void test0248() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,No,26,25,25,25"));
    }

    @Test
    public void test0249() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,No"));
    }

    @Test
    public void test0250() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,1,1,26,4095"));
    }

    @Test
    public void test0251() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,1,4095,25,25"));
    }

    @Test
    public void test0252() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,25,26,25,1"));
    }

    @Test
    public void test0253() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,26,1,26,1"));
    }

    @Test
    public void test0254() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,26,25,1,1"));
    }

    @Test
    public void test0255() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,26,25,26,1"));
    }

    @Test
    public void test0256() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,26,25,4095,1"));
    }

    @Test
    public void test0257() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,26,26,1,25"));
    }

    @Test
    public void test0258() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,26,4095,26,1"));
    }

    @Test
    public void test0259() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,4095,25,26,26"));
    }

    @Test
    public void test0260() {
        assertEquals("No", new com.asa.ShapeClassifier().evaluateGuess("Square,Small,Yes,4095,26,4095,4095"));
    }

}
