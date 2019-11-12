import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class course12_25 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] work = {"assistant" , "associate" , "full"};
        double assistantPrice = 0;
        int assistantNum = 0;
        double associatePrice = 0;
        int associateNum = 0;
        double fullPrice = 0;
        int fullNum = 0;

        createSalary createTxt = new createSalary();
        createTxt.getSalary();
        File file = new File("Salary.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
            String s = input.next();
            double price = input.nextDouble();
            if (s.equals(work[0])) {
                assistantNum++;
                assistantPrice += price;
            }
            if (s.equals(work[1])) {
                associateNum++;
                associatePrice += price;
            }
            if (s.equals(work[2])) {
                fullNum++;
                fullPrice += price;
            }
        }
        System.out.println("The price of assistant is : " + assistantPrice / assistantNum);
        System.out.println("The price of associate is : " + associatePrice / associateNum);
        System.out.println("The price of full is : " + fullPrice / fullNum);
        input.close();
    }
}

class createSalary {
    private int n = 1000;
    private double price = 0;
    private String firstName = "FirstName";
    private String lastName = "LastName";

    public void getSalary() {
        File file = new File("Salary.txt");
        if (file.exists()) {
            System.out.println("The file had existed.");
        }else {
            try {
                file.createNewFile();
            }catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        try (PrintWriter output = new PrintWriter(file);) {
            int j = 0;
            for (int i = 1 ; i <= n ; i ++ ) {
                output.print(firstName + i + " ");
                output.print(lastName + i + " ");

                j = (int)( Math.random() * 3);
                if (j == 0) {
                    output.print("assistant ");
                    output.printf("%.2f\n" , (Math.random() * 30000  + 50000));
                }
                if (j == 1) {
                    output.print("associate ");
                    output.printf("%.2f\n" , (Math.random() * 50000  + 60000));
                }
                if (j == 2) {
                    output.print("full ");
                    output.printf("%.2f\n" , (Math.random() * 55000  + 75000));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}













