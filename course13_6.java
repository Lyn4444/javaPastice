public class course13_6 {
    public static void main(String[] args) {
        ComparableCircle first = new ComparableCircle(2);
        System.out.println(first.compareTo(new ComparableCircle(2)));
        System.out.println(first.compareTo(new ComparableCircle(1)));
        System.out.println(first.compareTo(new ComparableCircle(4)));
    }
}


class Circle {
    private double rate = 0;

    Circle() {

    }

    Circle(double rate) {
        this.rate = rate;
    }

    public double getArea() {
        return Math.PI * rate * rate;
    }

}


class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(double rate) {
        super(rate);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

}



