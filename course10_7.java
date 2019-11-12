import java.util.Scanner;

public class course10_7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        while (true) {
            System.out.print("Enter an id : ");

            int id = input.nextInt();
            Account createAccount = new Account(id , 100);
            boolean flag = true;

            while (flag) {
                createAccount.menu();
                int choice = input.nextInt();

                if (choice == 1)
                    System.out.printf("The balance is %.1f\n" , createAccount.getBalance());

                if (choice == 2) {
                    System.out.print("Enter an account to withdraw: ");
                    double balance = input.nextDouble();
                    createAccount.withDraw(balance);
                    System.out.print("\n");
                }

                if (choice == 3) {
                    System.out.print("Enter an account to deposit: ");
                    double balance = input.nextDouble();
                    createAccount.deposit(balance);
                    System.out.print("\n");
                }

                if (choice == 4){
                    flag = false;
                    System.out.print("\n");
                }
            }
        }
    }
}


class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    Account() {
    }

    Account(int id , double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void SetAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public void withDraw(double balance) {
        this.balance -= balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void menu() {
        System.out.println("\nMain menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        System.out.print("Enter a choice: ");
    }

}