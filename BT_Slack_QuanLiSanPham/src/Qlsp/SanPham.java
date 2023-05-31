//import java.util.*;
//
//public class SanPham {
//    private ArrayList<QuanLiSanPham> quanLiSanPhams = new ArrayList<>();
//    Scanner scanner = new Scanner(System.in);
//
//    public SanPham() {
//    }
//
//    public void hienThiDanhSach(){
//        for (QuanLiSanPham sp : quanLiSanPhams) {
//            System.out.print(sp);
//        }
//    }
//    public QuanLiSanPham createNewProduct() {
//        System.out.print("Enter code : ");
//        String code = scanner.nextLine();
//        System.out.print("Enter Name : ");
//        String name = scanner.nextLine();
//        System.out.print("Enter price : ");
//        double price = Double.parseDouble(scanner.nextLine());
//        System.out.print("Enter quantity : ");
//        int quantity = Integer.parseInt(scanner.nextLine());
//        System.out.print("Enter mota : ");
//        String mota = scanner.nextLine();
//        return new QuanLiSanPham(code, name, price, quantity, mota);
//    }
//    public void themSanPham(){
//        QuanLiSanPham product = createNewProduct();
//        quanLiSanPhams.add(product);
//    }
//
//    public int findIndexByCode(String code) {
//        for (int i = 0; i < quanLiSanPhams.size(); i++) {
//            if (quanLiSanPhams.get(i).getMaSanPham().equals(code)) return i;
//        }
//        return -1;
//    }
//
//    public void edit() {
//        System.out.print("Enter code find :");
//        String code = scanner.nextLine();
//        if (!quanLiSanPhams.isEmpty()) {
//            int index = findIndexByCode(code);
//            if (index != -1) {
//                QuanLiSanPham newProduct = createNewProduct();
//                quanLiSanPhams.set(index,newProduct);
//            }
//        }
//
//    }
//
//    public void delete() {
//        System.out.print("Enter code find :");
//        String code = scanner.nextLine();
//        if (!quanLiSanPhams.isEmpty()) {
//            int index = findIndexByCode(code);
//            if (index != -1) {
//                quanLiSanPhams.remove(index);
//            }
//        }
//    }
//
//    public void sortMenu() {
//        System.out.println("1. Sort Price");
//        System.out.println("2. Sort Name");
//        System.out.println("3. Sort Code");
//        System.out.print("Enter choice : ");
//        int choice = Integer.parseInt(scanner.nextLine());
//        switch (choice) {
//            case 1:
//                Collections.sort(quanLiSanPhams);
//                break;
//            case 2:
////               quanLiSanPhams.sort((sp1, sp2) -> sp1.getTenSanPham().compareTo(sp2.getTenSanPham()));
//                Collections.sort(quanLiSanPhams, new Comparator<QuanLiSanPham>() {
//                    @Override
//                    public int compare(QuanLiSanPham o1, QuanLiSanPham o2) {
//                        return o1.getTenSanPham().compareTo(o2.getTenSanPham());
//                    }
//                });
//                break;
//            case 3:
////               quanLiSanPhams.sort((sp1, sp2) -> sp1.getMaSanPham().compareTo(sp2.getMaSanPham()));
//                Collections.sort(quanLiSanPhams, new Comparator<QuanLiSanPham>() {
//                    @Override
//                    public int compare(QuanLiSanPham o1, QuanLiSanPham o2) {
//                        return o1.getMaSanPham().compareTo(o2.getMaSanPham());
//                    }
//                });
//                break;
//            default: return;
//
//        }
//    }
//
//    public void displayMaxPrice() {
//        Collections.sort(quanLiSanPhams);
//        double maxPrice = quanLiSanPhams.get(quanLiSanPhams.size()-1).getGia();
//        for (QuanLiSanPham sp : quanLiSanPhams) {
//            if (sp.getGia() == maxPrice) System.out.println(sp);
//        }
//    }
//
//
//
//
//}
