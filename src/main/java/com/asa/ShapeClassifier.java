package com.asa;

public class ShapeClassifier {
    private int badGuesses;
    private String[] threeParamGuesses = {"Equilateral", "Isosceles", "Scalene"};
    private String[] fourParamGuesses = {"Rectangle", "Square"};
    private String[] twoParamGuesses = {"Circle", "Ellipse"};

    public ShapeClassifier() {
        badGuesses = 0;
    }

    // return Yes if the guess is correct, No otherwise
    public String evaluateGuess(String arg) {

        String shapeGuessResult = "";
        Integer[] parameters = getParams(arg);
        String shapeGuess = getShapeGuess(arg);
        String sizeGuess = getSizeGuess(arg);
        String evenOddGuess = getEvenOddGuess(arg);

        double calcPerim = 0;

        if (shapeGuess == null)
            shapeGuess = "";

        if (sizeGuess == null)
            sizeGuess = "";

        if (evenOddGuess == null)
            evenOddGuess = "";


        switch (parameters.length) {
            case 1:
                if (shapeGuess.equals("Line")) {
                    shapeGuessResult = shapeGuess;
                    calcPerim = parameters[0];
                }
                break;
            case 2: //params[0] [1]
                shapeGuessResult = classify2Parameters(parameters[0], parameters[1]);
                if (shapeGuessResult.equals("Ellipse")) {
                    calcPerim = calculateEllipsePerimeter(parameters[0], parameters[1]);
                } else {
                    calcPerim = calculateCirclePerimeter(parameters[0]);
                }
                break;
            case 3:
                shapeGuessResult = classify3Parameters(parameters[0], parameters[1], parameters[2]);
                calcPerim = calculateTrianglePerimeter(parameters[0], parameters[1], parameters[2]);
                break;
            case 4:
                shapeGuessResult = classify4Parameters(parameters[0], parameters[1], parameters[2], parameters[3]);
                calcPerim = calculateRectanglePerimeter(parameters[0], parameters[1], parameters[2], parameters[3]);
        }

        Boolean isShapeGuessCorrect = null;
        Boolean isSizeGuessCorrect = null;
        Boolean isEvenOddCorrect = null;

        // check the shape guess
        if (shapeGuessResult.equals(shapeGuess))
            isShapeGuessCorrect = true;
        else
            isShapeGuessCorrect = false;

        // check the size guess
        //Need 100 instead of 200
        if (calcPerim > 100 && sizeGuess.equals("Large")) {
            isSizeGuessCorrect = true;
        } //need <= 100 instead of < 10
        else if (calcPerim <= 100 && sizeGuess.equals("Small")) {
            isSizeGuessCorrect = true;
        } else {
            isSizeGuessCorrect = false;
        }

        int product = 1;
        for (int param : parameters) {
            product *= param;
        }
        boolean evenGuessResult = product % 2 == 0;

        if (evenGuessResult && evenOddGuess.equals("Yes")) {
            isEvenOddCorrect = true;
        } else if (!evenGuessResult && evenOddGuess.equals("No")) {
            isEvenOddCorrect = true;
        } else {
            isEvenOddCorrect = false;
        }

        if (isShapeGuessCorrect && isSizeGuessCorrect && isEvenOddCorrect) {
            badGuesses = 0;
            return "Yes";
        } else {
            // too many bad guesses
            badGuesses++;
            if (badGuesses >= 3) {
                System.out.println("Bad guess limit Exceeded");
                System.exit(1);
            }
            return "No";
        }
    }

    // P = 2 * PI *r
    private double calculateCirclePerimeter(int r) {
        return (Math.PI * r);
    }

    // P = 4 * s
    private int calculateSquarePerimeter(int side) {
        return 4 * side;
    }

    // P = 2l + 2w)
    //side1 * 2 + side2 * 2
    private int calculateRectanglePerimeter(int side1, int side2, int side3, int side4) {
        return side1 * 2 + side2 * 2;
    }

    // P = a + b + c
    private int calculateTrianglePerimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }

    // This is an approximation
    // PI(3(a+b) - sqrt((3a+b)(a+3b))
    private double calculateEllipsePerimeter(int a, int b) {
        double da = a, db = b;
        //use anouther formula (commented)
        return (2 * Math.PI * Math.sqrt((da * da + db * db) / 8));
//		return (int) ((int) Math.PI * (3 * (da+db) - Math.sqrt((3*da+db)*(da+3*db))));
    }

    // Transform a string argument into an array of numbers
    private Integer[] getParams(String args) {
        String[] params = args.split(",");
        Integer[] numParams = null;

        numParams = new Integer[params.length - 3];
        for (int i = 3; i < params.length; i++) {
            numParams[i - 3] = Integer.parseInt(params[i]);
        }
        return numParams;
    }

    // extract the Even/Odd guess
    private String getEvenOddGuess(String args) {
        String[] params = args.split(",");
        return params[2];
    }

    // extract the size guess
    private String getSizeGuess(String args) {
        String[] params = args.split(",");
        return params[1];
    }

    // extract the shape guess
    private String getShapeGuess(String args) {
        String[] params = args.split(",");
        return params[0];
    }

    // classify an two sides
    private String classify2Parameters(int a, int b) {
        if (a == b) {
            return twoParamGuesses[0];
        } else {
            return twoParamGuesses[1];
        }
    }

    // Classify four sides
    private String classify4Parameters(int a, int b, int c, int d) {
        //we should make assumptions about rectanlge
        //by SPECIFICATION a == c && b == d
        if (a == b && b == c && c == d) {
            return fourParamGuesses[1];
        } else if (a == c && b == d) {
            return fourParamGuesses[0];
        }
        return "";
    }

    // Classify a triangle based on the length of its sides
    private String classify3Parameters(int a, int b, int c) {

        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
            if (a == b && b == c) {
                return threeParamGuesses[0]; // Equilateral
            } else if (a == b || b == c || c == a) {
                return threeParamGuesses[1];// Isosceles
            } else {
                return threeParamGuesses[2]; //Scalene
            }
        }
        return "";
    }
}

