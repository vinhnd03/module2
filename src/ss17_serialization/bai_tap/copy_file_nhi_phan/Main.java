package ss17_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;

public class Main {
    private static void copyBinaryFile(String source, String target) {
        File sourceFile = new File(source);
        File targetFile = new File(target);
        if (targetFile.exists()) {
            System.out.println("File đã tồn tại");
            return;
        }
        if(source.length() == 0){
            System.out.println("File trống");
            return;
        }
        try (FileOutputStream outputStream = new FileOutputStream(targetFile);
             FileInputStream inputStream = new FileInputStream(sourceFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Sao chép thành công");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String source = "src/ss17_serialization/bai_tap/copy_file_nhi_phan/source.txt";
        String target = "src/ss17_serialization/bai_tap/copy_file_nhi_phan/target2.txt";
        copyBinaryFile(source, target);
    }
}
