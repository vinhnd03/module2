package ss1_tong_quan_java.bai_tap.bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadNumber {

    static void tiengViet() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số để chuyển thành chữ: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Số không hợp lệ!");
        } else {
            String[] array = new String[]{"Không", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
            if (num < 10) {
                System.out.println(array[num]);
            } else if (num < 100) {
                int chuc = num / 10;
                int donVi = num % 10;
                if (chuc == 1) {
                    System.out.println("Mười " + array[donVi]);
                } else {
                    if (donVi == 0) {
                        System.out.println(array[chuc] + " Mươi");
                    } else {
                        System.out.println(array[chuc] + " Mươi " + ((donVi == 1) ? "Mốt" : array[donVi]));
                    }
                }
            } else if (num < 1000) {
                int tram = num / 100;
                int chuc = (num % 100) / 10;
                int donVi = ((num % 100) % 10);
                if (num % 100 == 0) {
                    System.out.println(array[tram] + " Trăm");
                } else if ((num % 100) < 10) {
                    System.out.println(array[tram] + " Trăm Lẻ " + array[donVi]);
                } else {
                    if (chuc == 1) {
                        System.out.println(array[tram] + " Trăm Mười " + array[donVi]);
                    } else {
                        if (donVi == 0) {
                            System.out.println(array[tram] + " Trăm " + array[chuc] + " Mươi");
                        } else {
                            System.out.println(array[tram] + " Trăm " + array[chuc] + " Mươi " + ((donVi == 1) ? "Mốt" : array[donVi]));
                        }
                    }
                }
            }
        }
    }

    static void english() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0 - 999): ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Number is invalid!");
        } else {
            String[] array = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            String[] array2 = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
            if (num < 10) {
                System.out.println(array[num]);
            } else if (num < 100) {
                int dozen = num / 10;
                int unit = num % 10;
                if (dozen == 1) {
                    if (unit == 0) {
                        System.out.println("Ten");
                    } else if (unit == 5) {
                        System.out.println("Fifteen");
                    } else if (unit == 1) {
                        System.out.println("Eleven");
                    } else if (unit == 2) {
                        System.out.println("Twelve");
                    } else if (unit == 8) {
                        System.out.println("Eighteen");
                    } else {
                        System.out.println(array[unit] + "Teen");
                    }
                } else if (unit == 0) {
                    System.out.println(array2[dozen]);
                } else {
                    System.out.println(array2[dozen] + " " + array[unit]);
                }
            } else if (num < 1000) {
                int hundred = num / 100;
                int dozen = (num % 100) / 10;
                int unit = ((num % 100) % 10);
                if (num % 100 == 0) {
                    System.out.println(array[hundred] + " Hundred");
                } else if ((num % 100) < 10) {
                    System.out.println(array[hundred] + " Hundred And " + array[unit]);
                } else {
                    if (dozen == 1) {
                        if (unit == 0) {
                            System.out.println(array[hundred] + " Hundred Ten");
                        } else if (unit == 5) {
                            System.out.println(array[hundred] + " Hundred Fifteen");
                        } else if (unit == 1) {
                            System.out.println(array[hundred] + " Hundred Eleven");
                        } else if (unit == 2) {
                            System.out.println(array[hundred] + " Hundred Twelve");
                        } else if (unit == 8) {
                            System.out.println(array[hundred] + " Hundred Eighteen");
                        } else {
                            System.out.println(array[hundred] + " Hundred " + array[unit] + "Teen");
                        }
                    } else if (unit == 0) {
                        System.out.println(array[hundred] + " Hundred " + array2[dozen]);
                    } else {
                        System.out.println(array[hundred] + " Hundred " + array2[dozen] + " " + array[unit]);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        //tiengViet();
        english();
    }
}
