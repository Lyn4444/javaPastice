//字符串字符判断


import java.util.Scanner;

public class ch5_49 {
    public static void main(String[] args) {
        char ch;
        int num = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String S = in.nextLine();

        for(int i =0 ; i < S.length() ;i ++){
            ch = S.toLowerCase().charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                num ++;
        }

        System.out.println("The number of vowels is " + num);
        System.out.println("The number of consonants is " + (S.length() - num));
    }
}
