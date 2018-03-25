import org.jetbrains.annotations.NotNull;

public class Triangle {
    private final double a;
    private final double b;
    private final double c;
    private final String type;
    private final double area;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        validateForTriangle();
        type = getTriangleType();
        area = area();

    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    private void validateForTriangle() {
        if (a + b < c || a + c < b ||
                b + c < a || a <= 0 ||
                b <= 0 || c <= 0) {
            throw new IllegalArgumentException("not a triangle");
        }
    }

    @NotNull
    private String getTriangleType() {
        if (a == b && a == c) {

            System.out.println("Traingle is Equilateral");
            return "Equilateral";

        } else if (a == b || a == c || b == c) {
            System.out.println("Traingle is Isosceles");
            return "Isosceles";

        } else
            System.out.println("Traingle is Scalene");
        return "Scalene";
    }

    private double area() {
        double area = 0;
        if (type.equals("Equilateral")) {
            area = (Math.sqrt(3) / 4) * (a * a);
        } else if (type.equals("Isosceles")) {
            area = (b / 4) * Math.sqrt((4 * a * a) - (b * b));
        } else if (type.equals("Scalene")) {
            double s4 = (a + b + c) / 2;
            area = Math.sqrt(s4 * (s4 - a) * (s4 - b) * (s4 - c));
        }
        System.out.println("Square is" + " " + area);
        return area;
    }
}
