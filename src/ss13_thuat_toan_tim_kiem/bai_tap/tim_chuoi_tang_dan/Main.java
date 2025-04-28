package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_tang_dan;

public class Main {
    private static String linearSearch(String str){
        StringBuilder sb = new StringBuilder();
        String temp = String.valueOf(str.charAt(0));
        sb.append(temp);
        for (int i = 1; i < str.length(); i++){
            if(String.valueOf(str.charAt(i)).compareTo(temp) > 0){
                sb.append(str.charAt(i));
                temp = String.valueOf(str.charAt(i));
            }
        }
        if(sb.length() > 0){
            return sb.toString();
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "Welcome";
        System.out.println(linearSearch(str));
    }
}
