import java.util.Scanner;
public class KiemTraSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số Kiểm Tra: ");
        int a = scanner.nextInt();
        if(a<2){
            System.out.println(a + "Không Là SNT");
        }else {
            boolean check = true;
            for (int i = 2; i<=Math.sqrt(a);i++){
                if(a % i==0){
                    check = false;
                    break;
                }
            }if (check){
                System.out.println(a + " Là SNT");
            }else {
                System.out.println(a + " Không Là SNT");
            }
        }
    }
}