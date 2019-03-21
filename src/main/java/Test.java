public class Test {
    public static void main(String[] args) {
        ShapeClassifier shapeClassifier = new ShapeClassifier();
        String res = shapeClassifier.evaluateGuess("“Equilateral,Large,Yes,33,33,33,33");
        System.out.println(res);
    }
}
