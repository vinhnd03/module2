package ss3_mang.bai_tap.count_char_in_string;

public class CountCharInString {
    public static void main(String[] args) {
        String str = "Hello world";
        String chara = "l";
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(String.valueOf(str.charAt(i)).equals(chara)){
                count++;
            }
        }
        System.out.println(count);
    }
}
