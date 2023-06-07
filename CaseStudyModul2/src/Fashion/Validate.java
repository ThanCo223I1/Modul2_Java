package Fashion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private Pattern pattern;
    private Matcher matcher;
    public static final String UserName_PATTERN = "^[A-Z][a-z]+\\d*$";//VoThan96
    public static final String PassWord_PATTERN = "^[A-Z][a-z]+\\d*$";//VoThan96
    public static final String ROLE_PATTERN = "^(ADMIN|USER)$";
    public static final String Salary_PETTERN = "^\\d+$";
    public static final String Name_PATTERN = "^[A-Z][a-z]+$"; //VoVuThan
    public static final String Gender_PATTERN = "^(Male|Female)$"; //Male/Female
    public static final String BirthDay_PETTERN = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/\\d{4}$";//(dd/MM/yyyy)
    public static final String Phone_PETTERN = "^0[1-9]\\d{8}$";//0901285682
    public static final String Email_PETTERN = "^[a-z]\\w+@[a-z]+\\.[a-z]+$";//thanvo123@gmail.com
    public static final String WorkDay_PETTERN = "^\\d+$";// Số ngày làm
    public static final String WorkTime_PETTERN = "^\\d+$"; // Số giờ làm
    public static final String DayOff_PETTERN = "^\\d+$"; //Số ngày nghỉ
    // product
    public static final String NameProDuct_PETTERN = "^[A-Z][a-z]+$";//Tên thuốc
    public static final String Trademark_PETTERN = "^[A-Z][a-z]+$"; //thương hiệu
    public static final String Material_PETTERN = "^[A-Z][a-z]+$"; // chất liệu
    public static final String Price_PETTERN = "^[1-9]\\d*\\.\\d+$";//200.0
    public static final String Size_PETTERN = "^[a-z]+$";//s/xs/m
    public static final String Quantity_PETTERN = "^\\d+$";//100 cai

    public Validate() {
    }

    public boolean isValidateInputString(String inputString, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(inputString);
        return matcher.matches();
    }
}
