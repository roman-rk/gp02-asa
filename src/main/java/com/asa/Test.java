package com.asa;

public class Test {
    public static void main(String[] args) {
        ShapeClassifier shapeClassifier = new ShapeClassifier();
//        String res = shapeClassifier.evaluateGuess("Line,Large,No,101");
        String res = shapeClassifier.evaluateGuess("Circle,Small,Yes,16,16");
        System.out.println(res);
    }
}
