package com.asa;

public class Test {
    public static void main(String[] args) {
        ShapeClassifier shapeClassifier = new ShapeClassifier();
        String res = shapeClassifier.evaluateGuess("Line,Large,Yes,210,1,1,1");
        System.out.println(res);
    }
}
