package ss7_abstract_class_va_interface.thuc_hanh.comparable_interface;

import ss6_ke_thua.thuc_hanh.doi_tuong_hinh_hoc.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }


    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, Boolean filled, double radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(getRadius() > o.getRadius()){
            return 1;
        }else if(getRadius() == o.getRadius()){
            return 0;
        }else{
            return -1;
        }
    }
}
