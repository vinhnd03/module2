package ss3_mang.thuc_hanh.find_min_element;

public class FindMinElement {

    public static int minValue(int[] array) {
        int min = array[0];
        for (int a : array) {
            if (min > a) {
                min = a;
            }
        }
        return min;
    }

    public static int minIndex(int[] array){
        int min = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 1, 7, 3};
        System.out.println("Min element: " + minValue(numbers));
        System.out.println("Min index: " + minIndex(numbers));
    }
}
