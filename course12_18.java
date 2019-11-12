import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class course12_18 {
    public static void main(String[] args) {
        File dir = new File("./srcRootDirectory");
        if (dir.mkdir()) {
            System.out.println("Create directory successfully");
        }else {
            System.out.println("Failed to create directory");
        }
        for (int i = 1 ; i <= 34 ; i ++ ) {
            StringBuilder filePath = new StringBuilder("./srcRootDirectory/chapter");
            filePath.append(i);
            filePath.append(".java");
            StringBuilder packageName = new StringBuilder("package chapter");
            packageName.append(i);
            File file = new File(String.valueOf(filePath));
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try (PrintWriter output = new PrintWriter(file);) {
                output.print(packageName + "\n");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
