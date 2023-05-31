import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Bai 5: Sắp xếp danh sách chuỗi theo thứ tự từ điển.
//Viết một hàm có tên "sap_xep_theo_tu_dien(danh_sach)"
// nhận đầu vào là một danh sách các chuỗi và
// trả về danh sách đó sau khi được sắp xếp theo thứ tự từ điển.
public class Bai5_SapXepChuoiTheoTuDien {
    public static void sap_xep_theo_tu_dien(List<String> list){
        Collections.sort(list);
    }

    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("ecd");
        list.add("def");
        list.add("cde");
        sap_xep_theo_tu_dien(list);
        System.out.println("Arrays: " + list);
    }
}
