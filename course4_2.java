import java.util.Scanner;

public class course4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees : ");
//        String s1 = input.nextLine();
//        int s1_num = s1.indexOf(',');
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.println("Enter point 2 (latitude and longitude) in degrees : ");
//        String s2 = input.nextLine();
//        int s2_num = s2.indexOf(',');
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

//        System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
        double d = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 -y2)) );
        System.out.println("The distance between the two points is " + d + " KM");
    }
}
