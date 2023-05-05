import java.util.Scanner;

public class UocChungMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So a: ");
        int a = scanner.nextInt();

        System.out.println("Nhap so b: ");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b==0){
            System.out.println("Khong co UCLN");
        }
        while (a != b){
            if (a>b){
                a = a-b;
            }else {
                b = b-a;
            }System.out.println("UCLN la: " + a);
        }

    }
}
