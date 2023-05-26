package ThucHanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    static List<Integer> numbers = new ArrayList<>();
    public static int timMax(List<Integer> nums) {
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (max < nums.get(i)) {
                max = nums.get(i);
            }
        }
        return max;
    }


    public static void writeFile(List<Integer> nums ) {
        try(PrintWriter printWriter = new PrintWriter("TimMax.txt");) {
            for (Integer a: numbers) {
                printWriter.println(a);
            }
            printWriter.println("Max is: " + timMax(nums));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile() {
        try(FileReader fileReader = new FileReader("TimMax.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String str = "";
            while ((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
       numbers.add(1);
       numbers.add(22);
       numbers.add(5);
       numbers.add(7);
       writeFile(numbers);
       readFile();
    }

}
