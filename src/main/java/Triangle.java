public class Triangle {
    public double a;
    public double b;
    public double c;


    public boolean checkIfTriangle() {
        boolean isTr = false;
        if (a + b < c || a + c < b || b + c < a || a <= 0 || b <= 0 || c <= 0) {
            System.out.println("not a triangle");
        } else {
            isTr = true;
            System.out.println("Traingle completed");

        }
        return isTr;
    }

    public double checkTringleType() {
        double t = 0;
        if (a == b && a == c) {

            System.out.println("Traingle is Equilateral");
            System.out.println("=====================");
            t = 1;

        } else if (a == b || a == c || b == c) {
            System.out.println("Traingle is Isosceles");
            System.out.println("=====================");
            t = 2;

        } else if (a != b && a != c && b != c) {
            System.out.println("Traingle is Scalene");
            System.out.println("=====================");
            t = 3;

        }
        return t;
    }

    public double calculateSquare(double type) {

        double square = 0;
        if (type == 1) {
            square = (Math.sqrt(3) / 4) * (a * a);
        } else if (type == 2) {
            square = (b / 4) * Math.sqrt((4 * a * a) - (b * b));
        } else if (type == 3) {
            double s4 = (a + b + c) / 2;
            square = Math.sqrt(s4 * (s4 - a) * (s4 - b) * (s4 - c));
        }
        System.out.println("Square is" + " " + square);
        return square;
    }
}
