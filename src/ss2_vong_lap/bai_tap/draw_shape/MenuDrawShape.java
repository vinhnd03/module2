package ss2_vong_lap.bai_tap.draw_shape;

import java.util.Scanner;

public class MenuDrawShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do{
            System.out.println("========[ Menu ]========");
            System.out.println("1. Print Rectangle.");
            System.out.println("2. Print Triangle.");
            System.out.println("3. Print Isosceles Triangle.");
            System.out.println("4. Exit.");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    for (int i = 0; i < 4; i ++){
                        for(int j = 0; j < 6; j++){
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++){
                        for (int j = 4; j > i; j--){
                            System.out.print("   ");
                        }
                        for (int j = 0; j <= i; j++){
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    int max = 9;
                    for (int i = 0; i < 5; i ++){
                        for(int j = 0; j < max; j++){
                            if (j >= max / 2 - i && j <= max / 2 + i) {
                                System.out.print(" * ");
                            }else{
                                System.out.print("   ");
                            }

                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No Choice!");
            }
        }while (true);
    }
}
