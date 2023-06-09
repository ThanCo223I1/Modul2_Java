package Fashion;

public class EmployeePartTime extends Admin {
    private static final double SALARY = 3;
    private int number;
    private static int count;
    private int workTime;


    public EmployeePartTime(String name, String gender, String birthday, String phone, String email, int workTime) {
        super(name, gender, birthday, phone, email);
        this.number = count++;
        this.workTime = workTime;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        EmployeePartTime.count = count;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }
    public double Salary(){
        return SALARY * getWorkTime();
    }
}
