package ss19_string_regex.bai_tap.crawl_tin_tuc;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/");
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
            //String regex = "<article class=\"article-hot\">\\s*<article class=\"article-item\"[^>]*>\\w*\\s*<h3 class=\"article-title\">\\s*<a[^>]*>(.*?)</a>";
            String regex = "" +
                    "\\w*\\s*<h3 class=\"article-title\">\\s*<a[^>]*>(.*?)</a>";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
