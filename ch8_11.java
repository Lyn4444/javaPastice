import java.util.Scanner;

public class ch8_11 {
    public static void main(String[] args) {
        int n = 0, temp = 0 , two_num = 0;
        int[][] num = new int[3][3];

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        String s = Integer.toBinaryString(n);
        temp = Integer.valueOf(s);

//        System.out.println(temp);
        for (int i = 2 ; i >= 0 ; i --){
            for(int j = 2 ; j >= 0 ; j --){
                two_num = temp % 10;
                temp = temp / 10;
                num[i][j] = two_num;
            }
        }

        for (int i = 0 ; i <= 2 ; i ++){
            for(int j = 0 ; j <= 2 ; j ++){
                if(num[i][j] == 0)
                    System.out.print("H" + " ");
                else
                    System.out.print("T" + " ");
            }
            System.out.print("\n");
        }
//        System.out.println(num[2][1]);
    }

}

