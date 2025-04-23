package ss15_exception_va_debug.thuc_hanh.try_with_resource;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Read {
    public static void main(String[] args) {
        InputStream inputStream = Read.class.getResourceAsStream("text.txt");
        if (inputStream != null) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Không tìm thấy file text.txt");
        }

    }
}
