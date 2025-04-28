package ss13_thuat_toan_tim_kiem.bai_tap.tim_chuoi_lien_tiep_dai_nhat;

public class Main {
    private static String findLongestString(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            int j = i;
            while (j + 1 <= str.length() - 1) {
                if (str.charAt(j) <= str.charAt(j + 1)) {
                    if (temp.length() == 0) {
                        temp.append(str.charAt(j));
                    }
                    temp.append(str.charAt(j + 1));
                    j++;
                } else {
                    break;
                }
            }
            if (temp.length() > sb.length()) {
                sb = new StringBuilder(temp);
            }
            temp.setLength(0);
            i = j;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abcabcdgabmsxy";
        System.out.println(findLongestString(s));
    }
}
