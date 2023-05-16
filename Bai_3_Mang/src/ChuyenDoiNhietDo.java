import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double doC;
        double doF;
        int luaChon;
        System.out.println("Nhập nhiệt độ: ");
        do {
            System.out.println("1. Độ F sang Độ C");
            System.out.println("2. Độ C sang Độ F");
            System.out.println("0. Thoát ra");
            System.out.println("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1: {
                    System.out.println("Nhập độ F");
                    doF = scanner.nextDouble();
                    System.out.println("Chuyển độ F sang độ C: " + doFToDoC(doF));
                    break;
                }
                case 2: {
                    System.out.println("Nhập độ C: ");
                    doC = scanner.nextDouble();
                    System.out.println("Chuyển độ C sang độ F: " + doCToDoF(doC));
                    break;
                }
                case 0: {
                    System.exit(0);
                }
            }
        } while (luaChon != 0);
    }

    public static double doCToDoF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }

    public static double doFToDoC(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }
}
