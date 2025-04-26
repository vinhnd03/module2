package ss19_string_regex.thuc_hanh.loc_danh_sach_nhac;


import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

            //Fix 403 Error
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Accept", "text/html");

            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(connection.getInputStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            // regex
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
















//    public static void main(String[] args) {
//        try {
//            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//
//            // Set các header như trình duyệt thật
//            connection.setRequestMethod("GET");
//            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)"
//                    + " AppleWebKit/537.36 (KHTML, like Gecko)"
//                    + " Chrome/122.0.0.0 Safari/537.36");
//            connection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
//            //connection.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
//            //connection.setRequestProperty("Connection", "keep-alive");
//            //connection.setRequestProperty("Referer", "https://www.google.com/");
//
//            // Nếu cần thêm Cookie (bắt buộc nếu server yêu cầu)
//            // connection.setRequestProperty("Cookie", "session=abcd...");
//
//            int responseCode = connection.getResponseCode();
//            System.out.println("Response Code: " + responseCode);
//
//            if (responseCode == HttpURLConnection.HTTP_OK) {
//                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//                StringBuilder contentBuilder = new StringBuilder();
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    contentBuilder.append(line);
//                }
//                reader.close();
//                String content = contentBuilder.toString();
//
//                // remove all new lines
//                content = content.replaceAll("\\n+", "");
//
//                // regex
//                Pattern p = Pattern.compile("name_song\">(.*?)</a>");
//                Matcher m = p.matcher(content);
//                while (m.find()) {
//                    System.out.println(m.group(1));
//                }
//            } else {
//                System.out.println("Failed to fetch page, Response code = " + responseCode);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}

