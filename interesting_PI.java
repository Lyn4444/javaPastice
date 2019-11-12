import java.util.Scanner;

public class interesting_PI {
    public static void main (String[] args){
        int num = 0;
        int auto_num;
        double r;
        double PI_num;

        Scanner in = new Scanner(System.in);
        auto_num = in.nextInt();
        for(int i = 0; i < auto_num; i ++){
            double x = Math.random();
            double y = Math.random();
            r = x * x + y * y;
            if(r <= 1.0)
                num ++;
        }
//        System.out.println(x * x + y * y);
//        System.out.println(num);
        PI_num = num * 4.0 / auto_num;
        System.out.println(PI_num);
    }
}
