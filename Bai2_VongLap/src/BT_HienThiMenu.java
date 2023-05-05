import java.util.Scanner;

public class BT_HienThiMenu {
    public static void main(String[] args) {
        int enter = -1;
        Scanner scanner = new Scanner(System.in);
        while (enter != 0) {
            System.out.println("Menu");
            System.out.println("1. Hinh Chu Nhat");
            System.out.println("2. Tam Giac Vuong duoi trai");
            System.out.println("3. Tam Giac Vuong tren trai");
            System.out.println("4. Tam Giac Vuong tren phai");
            System.out.println("5. Tam Giac Vuong duoi phai");
            System.out.println("6. Tam Giac Can Len");
            System.out.println("7. Tam Giac Can xuong");
            System.out.println("Enter your:");
            enter = scanner.nextInt();
            switch (enter) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 6; i >= 1; i--) {
                        for (int j = i; j >= 1; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 6; i > 0; i--) {
                        for (int j = 6; j > i; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k < i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 6; j > i; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k <= i; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 6; j > i; j--) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < i * 2 + 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    for (int i = 6; i > 0; i--) {
                        for (int j = 6; j > i; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 0; k < i * 2 - 1; k++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
