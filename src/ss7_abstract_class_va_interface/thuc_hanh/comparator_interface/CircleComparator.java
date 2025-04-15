package ss7_abstract_class_va_interface.thu_hanh.comparator_interface;

import ss6_ke_thua.thuc_hanh.doi_tuong_hinh_hoc.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        if(o1.getRadius() > o2.getRadius()){
            return 1;
        }else if(o1.getRadius() < o2.getRadius()){
            return -1;
        }else{
            return 0;
        }
    }
}
