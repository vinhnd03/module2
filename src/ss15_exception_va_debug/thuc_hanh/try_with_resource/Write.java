package ss15_exception_va_debug.thuc_hanh.try_with_resource;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try {
            // Đường dẫn đến file text.txt trong cùng thư mục chạy với class
            File file = new File("text.txt"); // Điều chỉnh theo package thực tế
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write("Xin chào file!");
                writer.newLine();
                writer.write("Dòng thứ hai.");
            }
            System.out.println("Đã ghi file thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
