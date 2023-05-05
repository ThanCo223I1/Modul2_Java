import java.util.Scanner;

public class hienThi20SNT {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap SNT: ");
//        int number = scanner.nextInt();
        int count = 0;
            for (int j = 2; j > 0 ; j++) {
                boolean check = true;
                for (int k = 2; k <= Math.sqrt(j) ; k++) {
                    if (j%k==0){
                        check = false;
                        break;
                    }
                }if (check){
                    System.out.println("SNT la: " + j);
                    count++;
            }if (count == 20){
                    break;
                }
        }
    }
}
