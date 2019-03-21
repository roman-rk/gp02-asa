public class Test {
    public static void main(String[] args) {
        ShapeClassifier shapeClassifier = new ShapeClassifier();
        String res = shapeClassifier.evaluateGuess("Line,Large,Yes,202");
        System.out.println(res);
    }
}
