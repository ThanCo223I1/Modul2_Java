//
//
//import java.util.Scanner;
//
//public class MainSP {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Qlsp sp = new Qlsp();
//        while (true){
//            System.out.println("Quan Li San Pham: ");
//            System.out.println("__________________________________________");
//            System.out.println("1. Hien Thi San Pham.");
//            System.out.println("2. Them San Pham.");
//            System.out.println("3. Sua San Pham.");
//            System.out.println("4. Xoa San Pham.");
//            System.out.println("5. Sap Xep.");
//            System.out.println("6. Tim San Pham Gia Dac Nhat.");
//            System.out.println("7. Thoat.");
//            String choice = scanner.nextLine();
//            switch (choice){
//                case "1":
//                    sp.hienThi();
//                    break;
//                case "2":
//                    sp.themSanPham();
//                    break;
//                case "3":
//                    sp.suaSanPham();
//                    break;
//                case "4":
//                    sp.xoaSanPham();
//                    break;
//                case "5":
//                    sp.sapXep();
//                    break;
//                case "6":
//                    sp.timSanPhamGiaDacNhat();
//                    break;
//                case "7":
//                    System.exit(7);
//            }
//        }
//    }
//
//    public static class QuanLiSanPham implements Comparable<QuanLiSanPham> {
//        private String maSanPham;
//        private String tenSanPham;
//        private double gia;
//        private int soLuong;
//        private String moTa;
//
//        public QuanLiSanPham(String maSanPham, String tenSanPham, double gia, int soLuong, String moTa) {
//            this.maSanPham = maSanPham;
//            this.tenSanPham = tenSanPham;
//            this.gia = gia;
//            this.soLuong = soLuong;
//            this.moTa = moTa;
//        }
//
//        public String getMaSanPham() {
//            return maSanPham;
//        }
//
//        public void setMaSanPham(String maSanPham) {
//            this.maSanPham = maSanPham;
//        }
//
//        public String getTenSanPham() {
//            return tenSanPham;
//        }
//
//        public void setTenSanPham(String tenSanPham) {
//            this.tenSanPham = tenSanPham;
//        }
//
//        public double getGia() {
//            return gia;
//        }
//
//        public void setGia(double gia) {
//            this.gia = gia;
//        }
//
//        public int getSoLuong() {
//            return soLuong;
//        }
//
//        public void setSoLuong(int soLuong) {
//            this.soLuong = soLuong;
//        }
//
//        public String getMoTa() {
//            return moTa;
//        }
//
//        public void setMoTa(String moTa) {
//            this.moTa = moTa;
//        }
//
//        @Override
//        public int compareTo(QuanLiSanPham o) {
//            return (int) (this.gia - o.getGia());
//        }
//
//        @Override
//        public String toString() {
//            return "QLSP.MainSP.QuanLiSanPham{" +
//                    "maSanPham='" + maSanPham + '\'' +
//                    ", tenSanPham='" + tenSanPham + '\'' +
//                    ", gia=" + gia +
//                    ", soLuong=" + soLuong +
//                    ", moTa='" + moTa + '\'' +
//                    '}';
//        }
//    }
//}
//
