public class course7_23 {
    public static void main(String[] args) {
        boolean[] box = new boolean[101];

        for (int i = 1; i <= 100; i ++) {
            for (int n = 1; n <= 100; n ++) {
                if (n % i == 0)
                    box[n] =!box[n];
            }
        }

        System.out.println("The open box is :");

        for (int i = 1;i <= 100; i ++) {
            if (box[i])
                System.out.printf("%-4d", i);
        }
    }
}
