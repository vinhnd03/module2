package ss15_exception_va_debug.thuc_hanh.try_with_resource;

import java.io.*;

public class Main {
    private static void readFile() {
        ;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeFile() {
        BufferedWriter writer = null;
        try {
            File file = new File("text.txt"); // sửa path theo đúng package
            writer = new BufferedWriter(new FileWriter(file));
            writer.write("Xin chào file!");
            writer.newLine();
            writer.write("Dòng thứ hai.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        writeFile();
        readFile();
    }
}
