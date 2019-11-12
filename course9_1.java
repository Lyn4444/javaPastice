public class course9_1 {
    public static void main(String[] args) {
        Rectangle FirstArea = new Rectangle(4 , 40);

        Rectangle SecondArea = new Rectangle(3.5 , 35.9);

        System.out.println("The first rectangle : ");
        System.out.println("The width is : "+ FirstArea.getWidth());
        System.out.println("The height is :" + FirstArea.getHeight());
        System.out.println("The area is : " + FirstArea.getArea());
        System.out.println("The Perimeter is : " + FirstArea.getPerimeter());

        System.out.print("\n");

        System.out.println("The second rectangle : ");
        System.out.println("The width is :" + SecondArea.getWidth());
        System.out.println("The height is :" + SecondArea.getHeight());
        System.out.println("The area is : " + SecondArea.getArea());
        System.out.println("The Perimeter is : " + SecondArea.getPerimeter());
    }
}

class Rectangle {
    double width = 0;
    double height = 0;

    Rectangle() {
    }

    Rectangle(double newWidth , double newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }

    void setRectangle(double w , double h) {
        width = w;
        height = h;
    }

    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}
