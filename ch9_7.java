import java.util.Scanner;

public class ch9_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please create your id :");
        int account_Id = input.nextInt();

        oldAccount account = new oldAccount();
        account.setId(account_Id);
    }
}



class oldAccount {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    oldAccount() {
    }

    oldAccount(int id , double balance) {
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

}


