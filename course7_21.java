import java.util.Scanner;

public class course7_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of balls to drop : ");
        int numBall = input.nextInt();
        System.out.println("Enter the number of slots in the bean machine : ");
        int numRoom = input.nextInt();

        int[] slots = new int[numRoom];

        for(int i = 0; i < numBall; i ++)
            run(slots);

        int max = max(slots);

        display(max , slots);
    }

    /*球的路径*/
    private static void run(int[] slots) {
        char i;
        String s = "";
        int num = 0;

        for (int n = 0; n < slots.length - 1; n ++) {
            double temp = Math.random();

            if (temp >= 0.5)
                i = 'R';
            else
                i = 'L';

            s = s + i;
            if (i == 'R')
                num ++;
        }
        System.out.println(s);
        slots[num] ++;
    }

    /*槽里最多多少个球*/
    private static int max(int[] slots) {
        int max = 0;
        for(int i = 0; i < slots.length; i ++) {
            if(slots[i] > max)
                max = slots[i];
        }
        return max;
    }

    /*打印条形图*/
    private static void display(int max, int[] slots) {
        for(int i = max; i > 0; i --) {
            for(int k = 0; k < slots.length; k ++) {
                if(slots[k] == i) {
                    System.out.print("0");
                    slots[k] --;
                }
                else
                    System.out.print(" ");
            }
            System.out.print(" ");
            System.out.println("");
        }
    }
}