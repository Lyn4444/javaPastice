public class TestPoly {
    public static void main(String[] args) {
        Object object_1 = new CircleFromSimpleGeometricObject(1);
        Object object_2 = new RectangleFromSimpleGeometricObject(1 , 1);

        displayObject(object_1);
        displayObject(object_2);
    }
    public static void displayObject(Object object) {
        if (object instanceof CircleFromSimpleGeometricObject)
            System.out.println("The circle area is " + ((CircleFromSimpleGeometricObject) object).getArea());
        else if (object instanceof RectangleFromSimpleGeometricObject)
            System.out.println("The rectangle area is " + ((RectangleFromSimpleGeometricObject) object).getArea());
    }
}


class CircleFromSimpleGeometricObject {
    double radius = 0;

    CircleFromSimpleGeometricObject() {

    }

    CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}


class RectangleFromSimpleGeometricObject {
    double x = 0;
    double y = 0;

    RectangleFromSimpleGeometricObject() {

    }

    RectangleFromSimpleGeometricObject(double x , double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return this.y * this.x;
    }
}


