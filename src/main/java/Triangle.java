public class Triangle {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private double c;


    public boolean isTriangle(){
        boolean isTriangle = false;
        if (getA() + getB() < getC() || a + getC() < getB() ||
                getB() + getC() < getA() || getA() <= 0 ||
                getB() <= 0 || getC() <= 0) {
            throw new IllegalArgumentException("not a triangle");
        } else {
            isTriangle = true;
            System.out.println("Traingle completed");

        }
        return isTriangle;
    }

    public String getType() {

        if (getA() == getB() && getA() == getC()) {

            System.out.println("Traingle is Equilateral");
            return "Equilateral";

        } else if (getA() == getB() || getA() == getC() || getB() == getC()) {
            System.out.println("Traingle is Isosceles");
            return "Isosceles";

        }else
            return "Scalene";
        }


    public double calculateArea(String type) {

        double area = 0;
        if (type.equals("Equilateral")) {
            area = (Math.sqrt(3) / 4) * (getA() * getA());
        } else if (type.equals("Isosceles")) {
            area = (getB() / 4) * Math.sqrt((4 * getA() * getA()) - (getB() * getB()));
        } else if (type.equals("Scalene")) {
            double s4 = (getA() + getB() + getC()) / 2;
            area = Math.sqrt(s4 * (s4 - getA()) * (s4 - getB()) * (s4 - getC()));
        }
        System.out.println("Square is" + " " + area);
        return area;
    }
}
