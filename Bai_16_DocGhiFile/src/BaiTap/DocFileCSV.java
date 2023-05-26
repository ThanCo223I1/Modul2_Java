package BaiTap;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DocFileCSV {
    private static File file = new File("QuocGia.csv");

    static {
        try {
            if (!file.exists()) file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void docFile() {
        try (FileReader fileReader = new FileReader("QuocGia.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        docFile();

    }
}
