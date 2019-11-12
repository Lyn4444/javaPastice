import java.io.*;
import java.util.Scanner;

public class course12_12 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text.java");
        if (!file.exists()) {
            System.out.println("The file does not exist yet...");
            System.exit(0);
        }
//        try (PrintWriter output = new PrintWriter(file)){
//            output.print("public class Text\n");
//            output.print("{\n");
//            output.print("\tpublic static void main(String[] args)\n");
//            output.print("\t{\n\n");
//            output.print("\t}\n");
//            output.print("}");
//        }
        StringBuilder str = new StringBuilder();
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String p = input.nextLine();
            String s = p.trim();

            if(s.equals("{")) {
                str.insert(str.length() - 2 , "{");
            }
            else {
                str.append(p + "\r\n");
            }
        }
        System.out.print(str.toString());
        PrintWriter output = new PrintWriter(file);
        output.print(str.toString());
        input.close();
        output.close();
    }
}
