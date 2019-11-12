import java.util.Scanner;

public class course5_34 {
    public static void main(String[] args) {
        int computer_num = 0, gamer_num = 0;

        System.out.println("Please input : 1、2、3; (1 ——— scissor ，2 ——— rock ， 3 ——— cloth )");

        while (computer_num < 2 && gamer_num < 2) {
            int r = (int) (Math.random() * 3);
            int computer = r + 1;
            String computers = "";

            switch (computer) {
                case 1 : computers = "scissor"; break;
                case 2 : computers = "rock"; break;
                case 3 : computers = "cloth"; break;
            }

            Scanner in = new Scanner(System.in);

            int gamer = in.nextInt();
            String gamers = "";

            switch (gamer) {
                case 1 : gamers = "scissor"; break;
                case 2 : gamers = "rock"; break;
                case 3 : gamers = "cloth"; break;
            }

            if (computer == gamer)
                System.out.println("Computer is " + computers + "，you are " + gamers + "，it is a draw.");

            if (computer == 1 && gamer == 2 || computer == 2 && gamer == 3 || computer == 3 && gamer == 1) {
                System.out.println("Computer is " + computers + "，you are " + gamers + "，you win.");
                gamer_num +=1 ;
            }

            if (computer == 1 && gamer == 3 || computer == 2 && gamer == 1 || computer == 3 && gamer == 2) {
                System.out.println("Computer is " + computers + "，you are " + gamers + "，computer win.");
                computer_num +=1 ;
            }

            if (gamer != 1 && gamer != 2 && gamer != 3)
                System.out.println("Only input ： 1、2、3");

            System.out.println("The game score ---- computer : " + computer_num + "     you : " + gamer_num );
        }
    }
}