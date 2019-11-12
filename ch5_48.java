//输出字符串中下标为奇数的字符


import java.util.Scanner;

public class ch5_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string ; ");
        String s = input.nextLine();

        int num = 0;
        if(s.length() % 2 == 0)
            num = s.length() /2;
        else num = s.length() / 2 + 1;
        char[] ch = new char[num];

        for(int i = 1; i < s.length() +1 ; i++){
            if(i % 2 != 0)
                ch[(i + 1) / 2 - 1] = s.charAt(i - 1);
        }

        System.out.println(ch);
    }
}
