package ss9_kiem_thu.bai_tap.phan_loai_tam_giac;

public class TriangleClassifier {
    public static String checkTriangle(double a, double b, double c){
        boolean isTriangle = a + b > c && a + c > b && b + c > a;
        if(isTriangle){
            boolean isEquilateralTriangle = a == b && a == c;
            if(isEquilateralTriangle){
                return "tam giác đều";
            }else{
                boolean isIsoscelesTriangle = a == b || a == c || b == c;
                if(isIsoscelesTriangle){
                    return "tam giác cân";
                }else{
                    return "tam giác thường";
                }
            }
        }else{
            return "không phải tam giác";
        }
    }
}
