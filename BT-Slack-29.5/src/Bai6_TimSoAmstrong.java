import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Tìm số Amstrong trong một khoảng.
//Viết một hàm có tên "tim_so_amstrong_trong_khoang(start, end)"
// nhận đầu vào là hai số nguyên dương start và end,
// và trả về danh sách các số Amstrong trong khoảng từ start đến end.
public class Bai6_TimSoAmstrong {
    public static boolean checkAmsTrong(int number) {
        int numberStar = number;
        int result = 0;
        int length = String.valueOf(number).length();
        while (number > 0) {
            int number1 = number % 10;
            result += Math.pow(number1, length);
          number = number / 10;
        }
        numberStar = result;
        return true;
    }

    public static List<Integer> findArmstrongNumbersInRange(int start, int end) {
        List<Integer> amsTrongNumber = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (checkAmsTrong(i)) {
                amsTrongNumber.add(i);
            }
        }
        return amsTrongNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start: ");
        int enterStart = Integer.parseInt(sc.nextLine());
        System.out.println("Enter End: ");
        int enterEnd = Integer.parseInt(sc.nextLine());
        List<Integer> amsTrongNumbers = findArmstrongNumbersInRange(enterStart, enterEnd);
        System.out.println("Armstrong numbers between " + enterStart+ " and " + enterEnd + ":");
        for (int number : amsTrongNumbers) {
            System.out.println(number);
        }
    }
}
