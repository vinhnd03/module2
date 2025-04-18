package ss9_kiem_thu.bai_tap.tinh_ngay_tiep_theo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCalculatorTest {

    @Test
    void testNextDay() {
        String date = "01-01-2018";
        String expect = "02-01-2018";

        String result = NextDayCalculator.nextDay(date);
        assertEquals(result, expect);
    }

    @Test
    void testNextDay2() {
        String date = "31-01-2018";
        String expect = "01-02-2018";

        String result = NextDayCalculator.nextDay(date);
        assertEquals(result, expect);
    }

    @Test
    void testNextDay3() {
        String date = "30-04-2018";
        String expect = "01-05-2018";

        String result = NextDayCalculator.nextDay(date);
        assertEquals(result, expect);
    }

    @Test
    void testNextDay4() {
        String date = "01-01-2018";
        String expect = "02-01-2018";

        String result = NextDayCalculator.nextDay(date);
        assertEquals(result, expect);
    }

    @Test
    void testNextDay5() {
        String date = "28-02-2018";
        String expect = "01-03-2018";

        String result = NextDayCalculator.nextDay(date);
        assertEquals(result, expect);
    }

    @Test
    void testNextDay6() {
        String date = "29-02-2020";
        String expect = "01-03-2020";

        String result = NextDayCalculator.nextDay(date);
        assertEquals(result, expect);
    }

    @Test
    void testNextDay7() {
        String date = "31-12-2018";
        String expect = "01-01-2019";

        String result = NextDayCalculator.nextDay(date);
        assertEquals(result, expect);
    }
}