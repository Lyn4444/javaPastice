public class course9_9 {
    public static void main(String[] args) {
        RegularPolygon first = new RegularPolygon(6 ,4);
        RegularPolygon second = new RegularPolygon(10 , 4 , 5.6 , 7.8);
//        System.out.println(regularPolygon.getN());
        System.out.print("周长和面积为 ：" + first.getPerimeter() + " , ");
        System.out.printf("%.2f\n",first.getArea());
        System.out.print("周长和面积为 ：" + second.getPerimeter() + " , ");
        System.out.printf("%.2f\n",second.getArea());
    }
}


class RegularPolygon {
    private int n =3;
    private double size = 1;
    private double  x = 0;
    private double  y = 0;

    RegularPolygon() {
    }

    RegularPolygon(int n , double size , double  x , double  y){
        this.n = n;
        this.size = size;
        this.x = x;
        this.y = y;
    }

    RegularPolygon(int n , double size ){
        this.n = n;
        this.size = size;
    }

    public void setN(int N) {
        this.n = N;
    }

    public int getN() {
        return this.n;
    }
    public void setSize(int Size) {
        this.size = Size;
    }

    public double getSize() {
        return this.size;
    }
    public void setX(int X) {
        this.x = X;
    }
    public double getX(){
        return this.x;
    }
    public void setY(int Y) {
        this.y = Y;
    }

    public double getY() {
        return this.y;
    }

    public double getPerimeter(){
        return this.n * this.size;
    }

    public double getArea() {
        return (this.n * this.size * this.size) / (4 * Math.tan(Math.PI / n));
    }

}
