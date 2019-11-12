import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class course12_15 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("File already exists\n");
        } else {
            System.out.println("File not exists,create it....");
            try {
                file.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        PrintWriter output = new PrintWriter("Exercise12_15.txt");
        int[] index = new int[100];
        for (int i = 0; i < 100; i++) {
            Random r = new Random();
            output.print(r.nextInt());
            output.print(" ");
        }
        output.close();
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            for (int i = 0; i < 100; i++) {
                Random r = new Random();
                index[i] = input.nextInt();
            }

        Arrays.sort(index);
        for (int e : index)
            System.out.println(e);
        }
        input.close();
    }
}



