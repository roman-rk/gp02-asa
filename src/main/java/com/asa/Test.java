package com.asa;

public class Test {
    public static void main(String[] args) {
        ShapeClassifier shapeClassifier = new ShapeClassifier();
//        String res = shapeClassifier.evaluateGuess("Line,Large,No,101");
        String res = shapeClassifier.evaluateGuess("Rectangle,Small,No,25,4095,25,4095");
        System.out.println(res);
    }
}
