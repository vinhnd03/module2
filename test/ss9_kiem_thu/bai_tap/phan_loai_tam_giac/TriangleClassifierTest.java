package ss9_kiem_thu.bai_tap.phan_loai_tam_giac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testCheckTriangle() {
        double a = 2;
        double b = 2;
        double c = 2;
        String expect = "tam giác đều";

        String result = TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expect, result);
    }

    @Test
    void testCheckTriangle2() {
        double a = 2;
        double b = 2;
        double c = 3;
        String expect = "tam giác cân";

        String result = TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expect, result);
    }

    @Test
    void testCheckTriangle3() {
        double a = 3;
        double b = 4;
        double c = 5;
        String expect = "tam giác thường";

        String result = TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expect, result);
    }

    @Test
    void testCheckTriangle4() {
        double a = 8;
        double b = 2;
        double c = 3;
        String expect = "không phải tam giác";

        String result = TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expect, result);
    }

    @Test
    void testCheckTriangle5() {
        double a = -1;
        double b = 2;
        double c = 1;
        String expect = "không phải tam giác";

        String result = TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expect, result);
    }

    @Test
    void testCheckTriangle6() {
        double a = 0;
        double b = 1;
        double c = 1;
        String expect = "không phải tam giác";

        String result = TriangleClassifier.checkTriangle(a,b,c);
        assertEquals(expect, result);
    }

}