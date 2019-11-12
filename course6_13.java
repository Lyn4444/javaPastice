import java.util.Scanner;

public class course6_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double i = input.nextInt();

        double m = series(i);

        System.out.println(String.format("%.4f",m));
    }
    public static double series(double n) {
        if(n == 1)
            return (n / (n + 1) );
        else {
            return series((n - 1)) + (n / (n + 1) );
        }
    }
}
