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
    public String equation() {
        if (y1 == y2) {
            return "y = " + y1;
        } else {
            return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x" + " + " + yIntercept();
        }
    }
    public String coordinateForX(double x) {
        return  "(" + x + ", " + (slope() * x + yIntercept()) + ")";
    }
    public String lineInfo() {
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" + "\n" +
                "The equation of the line between the two points is: " + equation() + "\n" +
                "The y-intercept of this line is: " + yIntercept() + "\n" +
                "The slope of this line is: " + slope() + "\n" +
                "The distance between these points is: " + distance();
    }
}
