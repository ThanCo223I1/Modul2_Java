public class hienThi100SNT {
    public static void main(String[] args) {

        for (int j = 2; j < 100; j++) {
            boolean check = true;
            for (int k = 2; k <= Math.sqrt(j); k++) {
                if (j % k == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("SNT la: " + j);
            }
        }
    }
}
