import java.util.ArrayList;
import java.util.List;

//Bài 9: Viết chương trình Java để tìm số Armstrong trong khoảng từ 1 đến 1000.
// Một số Armstrong là số có tổng lũy thừa các chữ số bằng chính nó.
// Ví dụ: 153 là một số Armstrong vì 1^3 + 5^3 + 3^3 = 153
public class Bai9_TimAmstrong1_1000 {
    public static List<Integer> tim_so_Armstrong_trong_khoang(int start, int end) {
        List<Integer> armstrongNumbers = new ArrayList<>();

        for (int number = start; number <= end; number++) {
            if (isArmstrongNumber(number)) {
                armstrongNumbers.add(number);
            }
        }

        return armstrongNumbers;
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int result = 0;
        int numDigits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            result += Math.pow(digit, numDigits);
            number /= 10;
        }

        return originalNumber == result;
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 1000;

        List<Integer> armstrongNumbers = tim_so_Armstrong_trong_khoang(start, end);
        System.out.println("Các số Armstrong trong khoảng từ " + start + " đến " + end + ":");
        for (int number : armstrongNumbers) {
            System.out.println(number);
        }
    }
}
