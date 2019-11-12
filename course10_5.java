import java.util.Scanner;

public class course10_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        StackOfIntegers stackOfIntegers = new StackOfIntegers(m);
        stackOfIntegers.setN();
        stackOfIntegers.getNumber();
    }
}


class StackOfIntegers {
    private int n = 2;
    private int prime = 2;
    private int i = 0;
    private int[] number = new int[100005];

    StackOfIntegers() {
    }

    StackOfIntegers(int n) {
        this.n = n;
    }

    public void setN() {
        if (this.n >= 2) {
            while(n != prime) {
                if (n % prime == 0) {
                    n = n / prime;
                    number[i] = prime;
                    i ++;
                }
                else {
                    if (prime == 2)
                        prime = 3;
                    else
                        prime += 2;
                }
            }
            number[i] = prime;
        }
    }

    public void getNumber() {
        int j = 0;
        while (number[j] != 0) {
            int temp = number[j];
            j ++;
            System.out.printf("%-4d",temp);
        }
    }

}

