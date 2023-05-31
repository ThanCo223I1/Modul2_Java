import java.util.HashSet;
import java.util.Set;

//Bài tập 1: Tìm chuỗi con có độ dài lớn nhất không chứa các ký tự lặp lại
//Viết một chương trình để tìm và hiển thị chuỗi con có độ dài lớn nhất trong một chuỗi,
//sao cho chuỗi con đó không chứa bất kỳ ký tự nào bị lặp lại.
// Đầu vào là một chuỗi từ người dùng và
//chương trình sẽ tìm và hiển thị chuỗi con lớn nhất thỏa điều kiện đã cho.
public class Bai11_TimChuoiConCoDoDaiLonNhat {
    public static void main(String[] args) {
        // Nhập chuỗi từ người dùng
        String input = getInputString();

        // Tìm chuỗi con lớn nhất không chứa các ký tự lặp lại
        String result = findMaxNonRepeatingSubstring(input);

        // Hiển thị chuỗi con lớn nhất
        System.out.println("Chuỗi con lớn nhất không chứa các ký tự lặp lại: " + result);
    }

    private static String getInputString() {
        // Đọc chuỗi từ người dùng (hoặc có thể cung cấp trực tiếp)
        // Sử dụng Scanner hoặc các phương thức khác để đọc chuỗi từ người dùng
        // Ví dụ:
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Nhập chuỗi: ");
        // String input = scanner.nextLine();
        // return input;

        // Ví dụ: Chuỗi đã cho trực tiếp
        return "abcbdef";
    }

    private static String findMaxNonRepeatingSubstring(String input) {
        String maxSubstring = "";
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;

        while (end < input.length()) {
            char currentChar = input.charAt(end);

            if (!set.contains(currentChar)) {
                set.add(currentChar);
                end++;

                // Kiểm tra nếu chuỗi con hiện tại dài hơn chuỗi con lớn nhất đã tìm thấy trước đó
                if ((end - start) > maxSubstring.length()) {
                    maxSubstring = input.substring(start, end);
                }
            } else {
                set.remove(input.charAt(start));
                start++;
            }
        }

        return maxSubstring;
    }
}
