//import java.util.Scanner;
//
//public class Menu_ChucNang {
//    public static void main(String[] args) {
//        while (true) {
//            SanPham sanPham = new SanPham();
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Mời bạn chọn chức năng: _____________");
//            System.out.println("1. Hiển Thị Danh Sách.");
//            System.out.println("2. Thêm Mới.");
//            System.out.println("3. Cập Nhật.");
//            System.out.println("4. Xóa danh sách.");
//            System.out.println("5. Sắp Xếp danh sách.");
//            System.out.println("6. Tìm Sản Phẩm Có Giá Đắt Nhất.");
//            System.out.println("7. Thoát Chương Trình.");
//            System.out.print("Enter choice : ");
//            String choice = scanner.nextLine();
//
//            switch (choice){
//                case "1":
//                    sanPham.hienThiDanhSach();
//                    break;
//                case "2":
//                    sanPham.themSanPham();
//                    break;
//                case "3":
//                    sanPham.edit();
//                    break;
//                case "4":
//                    sanPham.delete();
//                    break;
//                case "5":
//                    sanPham.sortMenu();
//                    break;
//                case "6":
//                    sanPham.displayMaxPrice();
//                    break;
//                case "7":
//                    System.exit(7);
//                default:
//                    System.out.println("Not found choice!");
//            }
//        }
//    }
//}
