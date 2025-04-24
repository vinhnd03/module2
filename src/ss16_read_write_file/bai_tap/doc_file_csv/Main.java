package ss16_read_write_file.bai_tap.doc_file_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Country> readCountryCSV(String path) throws IOException {
        List<Country> countries = new ArrayList<>();
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(path));
        String line = "";
        while ((line = reader.readLine()) != null){
            String[] arr = line.split(",");
            countries.add(new Country(Integer.parseInt(arr[0]), arr[1], arr[2]));
        }
        return countries;
    }

    public static void main(String[] args) {
        String path = "src/ss16_read_write_file/bai_tap/doc_file_csv/country.csv";
        try {
            List<Country> countries = readCountryCSV(path);
            for (Country c : countries){
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
