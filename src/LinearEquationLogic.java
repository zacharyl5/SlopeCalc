import java.util.Scanner;

public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in);
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    boolean n = true;


    private int parseInt(String str) {
        return Integer.parseInt(str);
    }


    public void start() {
        System.out.println("Welcome to the linear equation calculator!");
        while (n) {
            getData();
            LinearEquation n1 = new LinearEquation(x1, y1, x2, y2);
            System.out.println(n1.lineInfo());
            System.out.println("\n" + "Enter a value for x: ");
            System.out.println(n1.coordinateForX(scan.nextDouble()));
            scan.nextLine();
            System.out.println("Would you like another pair of coordinates? y/n: ");
            if (scan.nextLine().equals("n")) {
                n = false;
            }
        }
    }


    private void getData() {
        System.out.println("Enter Coordinate 1: ");
        String c1 = scan.nextLine();
        x1 = parseInt(c1.substring(1, c1.indexOf(",")));
        y1 = parseInt(c1.substring(c1.indexOf(",") + 2, c1.length() - 1));
        System.out.println("Enter Coordinate 2: ");
        String c2 = scan.nextLine();
        x2 = parseInt(c2.substring(1, c2.indexOf(",")));
        y2 = parseInt(c2.substring(c2.indexOf(",") + 2, c2.length() - 1));
        System.out.println();
    }
}
