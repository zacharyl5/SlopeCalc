public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;


    private double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double slope() {
        return roundedToHundredth((double) (y2 - y1) / (x2 - x1));
    }
    public double distance() {
        return roundedToHundredth(Math.sqrt( Math.pow( (x2-x1), 2 ) + Math.pow( (y2-y1), 2) ));
    }
    public double yIntercept() {
        return y1 - (slope() * x1);
    }
    public double num() {
        return (x2 - x1);
    }
    public double den() {
        return (y2 - y1);
    }
    public String makeSlope() {
        if (num() > 0 && den() > 0) {
            return ((int)(den()) + "/" + (int)num());
        } else if (num() > 0 && den() < 0) {
            return ((int)(den()) + "/" + (int)num());
        } else if (num() < 0 && den() > 0) {
            return ("-" + ((int)den()) + "/" + (int)Math.abs(num()));
        } else {
            return ((int) Math.abs(den())) + "/" + (int)Math.abs(num());
        }
    }
    public String equ() {
        if (y1 == y2) {
            return "y = " + y1;
        } else if (slope() == 1.0) {
            return "y = x" + yInter();
        } else if (slope() == -1.0) {
            return "y = -x" + yInter();
        } else if (((den()) / num()) % 1.0 == 0) {
            return "y = " + ((int) slope()) + "x" + yInter();
        } else {
            return "y = " + makeSlope() + "x" + yInter();
        }
    }
    public String yInter() {
        if (yIntercept() > 0) {
            return " + " + yIntercept();
        } else if (yIntercept() < 0) {
            return " " + yIntercept();
        } else return "";
    }
    public String coordinateForX(double x) {
        return  "(" + x + ", " + (slope() * x + yIntercept()) + ")";
    }
    public String lineInfo() {
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" + "\n" +
                "The equation of the line between the two points is: " + equ() + "\n" +
                "The y-intercept of this line is: " + yIntercept() + "\n" +
                "The slope of this line is: " + slope() + "\n" +
                "The distance between these points is: " + distance();
    }
}
