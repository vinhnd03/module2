package ss9_kiem_thu.thuc_hanh.tim_gia_tri_tuyet_doi;

public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number) {
        //throw new UnsupportedOperationException();
        if (number < 0)
            return -number;
        return number;
    }
}

