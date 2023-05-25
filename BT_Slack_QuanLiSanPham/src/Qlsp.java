import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Qlsp{
    private ArrayList<SP> sps = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void hienThi(){
        for (SP sp: sps) {
            System.out.println(sp);
        }
    }

    public SP taoSanPham(){
        System.out.println("Nhap Ma San Pham: ");
        String maSanPham = scanner.nextLine();
        System.out.println("Nhap Ten San Pham: ");
        String tenSanPham = scanner.nextLine();
        System.out.println("Nhap Gia San Pham: ");
        float giaSanPham = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap So Luong San Pham: ");
        int soLuongSanPham = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Mo Ta: ");
        String moTa = scanner.nextLine();
        return  new SP(maSanPham,tenSanPham,giaSanPham,soLuongSanPham,moTa);
    }
    public void themSanPham(){
        SP sp = taoSanPham();
        sps.add(sp);
    }
    public int timViTriMaSanPham(String maSanPham){
        for (int i = 0; i < sps.size(); i++) {
            if (sps.get(i).getMaSp().equals(maSanPham)){
                return i;
            }
        }
        return -1;
    }
    public void suaSanPham(){
        System.out.println("Nhap Ma San Pham Can Sua: ");
        String maSanPham = scanner.nextLine();
        if (!sps.isEmpty()){ //kiem tra co rong khong
            int index = timViTriMaSanPham(maSanPham);
            if (index != -1){ // check xem index co nam trong hay khong.
                SP sp = taoSanPham();
                sp.setId(sps.get(index).getId());
                SP.idTemp--;
                sps.set(index, sp); // truyen vao index can sua
            }
        }
    }
    public int timViTriTheoTen(String tenSanPham){
        for (int i = 0; i < sps.size(); i++) {
            if (sps.get(i).getNameSp().equals(tenSanPham));{
                return i;
            }
        }return -1;
    }

    public void xoaSanPham(){
        System.out.println("Nhap Ten San Pham Can Xoa: ");
        String tenSanPham = scanner.nextLine();
       if (!sps.isEmpty()){
           int index = timViTriTheoTen(tenSanPham);
           if (index != -1){
               sps.remove(index);
           }
       }
    }
    public void sapXep(){
        System.out.println("1. Sap xep theo gia san pham: ");
        System.out.println("2. Sap xep theo ten san pham: ");
        System.out.println("3. Sap xep theo ma san pham: ");
        System.out.println("4. Thoat.");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                Collections.sort(sps);
                break;
            case 2:
                Collections.sort(sps, new Comparator<SP>() {
                    @Override
                    public int compare(SP o1, SP o2) {
                        return o1.getNameSp().compareTo(o2.getNameSp());
                    }
                });
                break;
            case 3:
                Collections.sort(sps, new Comparator<SP>() {
                    @Override
                    public int compare(SP o1, SP o2) {
                        return o1.getMaSp().compareTo(o2.getMaSp());
                    }
                });
                break;
            case 4:
                System.exit(4);
        }
    }

    public void timSanPhamGiaDacNhat(){
        Collections.sort(sps);
        double timGiaDacNhat = sps.get(sps.size()-1).getGiasp();
        for (SP sp: sps) {
            if (sp.getGiasp() == timGiaDacNhat){
                System.out.println(sp);
            }
        }
    }
}
