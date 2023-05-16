import java.util.Scanner;

//        4. Viết chương trình để kiểm tra xem một chuỗi ký tự nhập từ bàn phím có phải là chuỗi đối xứng hay không.
public class Bai_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() -i -1) ){
                check = false;
                break;
            }
        }if (check){
            System.out.println(str + " la chuoi doi xung");
        }else {
            System.out.println(str + " Khong la chuoi doi xung");
        }
    }
}
