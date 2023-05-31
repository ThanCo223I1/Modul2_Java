import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Bài 10: Viết chương trình Java để tìm số hoàn hảo trong khoảng từ 1 đến 1000.
//Một số hoàn hảo là số có tổng các ước bằng chính nó.
//Ví dụ: 6 là một số hoàn hảo vì 1 + 2 + 3 = 6. (edited)
public class Bai10_TimSoHoanHao1_1000 {
    public static List<Integer> tim_so_hoan_hao_trong_khoang(int start, int end) {
        List<Integer> perfectNumbers = new ArrayList<>();

        for (int number = start; number <= end; number++) {
            if (isPerfectNumber(number)) {
                perfectNumbers.add(number);
            }
        }

        return perfectNumbers;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start: ");
        int enterStart = Integer.parseInt(sc.nextLine());
        System.out.println("Enter End: ");
        int enterEnd = Integer.parseInt(sc.nextLine());
        List<Integer> perfectNumbers = tim_so_hoan_hao_trong_khoang(enterStart, enterEnd);
        System.out.println("Các số hoàn hảo trong khoảng từ " + enterStart + " đến " + enterEnd + ":");
        for (int number : perfectNumbers) {
            System.out.println(number);
        }
    }
}
