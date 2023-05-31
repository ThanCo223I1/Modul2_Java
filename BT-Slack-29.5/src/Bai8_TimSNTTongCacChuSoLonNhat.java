//Bài tập 8: Tìm số nguyên tố có tổng các chữ số lớn nhất. SNT < 100.
//Viết một hàm có tên "tim_so_nguyen_to_tong_chu_so_lon_nhat()"
// nhận đầu vào không có gì và trả về số nguyên tố có tổng các chữ số lớn
public class Bai8_TimSNTTongCacChuSoLonNhat {
    public static int timTongMaxSNT() {
        int maxSum = 0;
        int primeNumber = 0;

        for (int number = 2; number < 100; number++) {
            if (isPrimeNumber(number)) {
                int sum = calculateDigitSum(number);
                if (sum > maxSum) {
                    maxSum = sum;
                    primeNumber = number;
                }
            }
        }

        return primeNumber;
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int primeNumber = timTongMaxSNT();
        System.out.println("Số nguyên tố có tổng các chữ số lớn nhất dưới 100 là: " + primeNumber);
    }
}


