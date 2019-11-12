import java.util.Scanner;

public class course9_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input x1 and y1");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Please input x2 and y2");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.println("Please input x3 and y3");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.println("Please input x4 and y4");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a = (y2 - y1) / (x2 - x1);
        double b = -1;
        double e = a * x1 - y1;

        double c = (y4 - y3) / (x4 - x3);
        double d = -1;
        double f = c * x3 - y3;

        LinearEquation linearEquation = new LinearEquation(a , b , c , d , e , f );
        System.out.println("两条直线的交点的坐标 ： " + linearEquation.getX() + " , " + linearEquation.getY());
    }
}


class LinearEquation {
    private double a , b , c , d , e , f = 0;
    private boolean solvable = false;
    LinearEquation() {
    }

    LinearEquation(double a , double b , double c , double d , double e , double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    public double getD() {
        return this.d;
    }

    public double getE() {
        return this.e;
    }

    public double getF() {
        return this.f;
    }

    public boolean isSolvable() {
        if ((this.a * this.d - this.b * this.c) != 0)
            solvable = true;

        return solvable;
    }

    public double getX() {
        return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
    }

    public double getY() {
        return (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
    }
}


