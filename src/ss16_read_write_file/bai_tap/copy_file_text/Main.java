package ss16_read_write_file.bai_tap.copy_file_text;

import java.io.*;

public class Main {
    private static void copyFileText(String source, String target) throws IOException {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        reader = new BufferedReader(new FileReader(source));
        writer = new BufferedWriter(new FileWriter(target));

        String line;
        while ((line = reader.readLine()) != null){
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
    public static void main(String[] args) {
        String sourceFile = "src/ss16_read_write_file/bai_tap/copy_file_text/source.txt";
        String targetFile = "src/ss16_read_write_file/bai_tap/copy_file_text/target.txt";
        try {
            copyFileText(sourceFile, targetFile);
            System.out.println("Success");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
