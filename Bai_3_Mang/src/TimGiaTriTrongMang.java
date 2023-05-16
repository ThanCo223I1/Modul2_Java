import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] name = {"Tuấn", "Hưng","Nam","Nhân"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm: ");
        String ten = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(ten)){
                System.out.println("Vị trí tên: " + ten + " Cần tìm là: " + i);
                check = true;
                break;
            }
        }if (!check){
            System.out.println("Không tìm thấy tên: " + ten + " Trong mảng" );
        }
    }
}
