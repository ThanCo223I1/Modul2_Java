public class NgoiSao {
    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++){
//            for (int j = 1; j<5 ; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < 3 ; i++) {
//            for(int j = i ; j<3; j++){
//                System.out.print("* ");
//            }System.out.println();
//        }

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("- ");
//            }
//            for (int k = i; k < 4; k++) {
//                System.out.print("* ");
//            } System.out.println();
//        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j<=i ; j++){
                System.out.print("  ");
            }
            for (int k = i*2; k < 5 ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
