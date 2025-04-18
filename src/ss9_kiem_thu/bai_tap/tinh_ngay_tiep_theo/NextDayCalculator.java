package ss9_kiem_thu.bai_tap.tinh_ngay_tiep_theo;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator {
    public static String nextDay(String dayInput) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(dayInput, formatter);
        LocalDate nextDay = localDate.plusDays(1);
        return nextDay.format(formatter);
    }

}
