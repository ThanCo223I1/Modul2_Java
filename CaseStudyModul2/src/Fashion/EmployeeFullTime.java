package Fashion;

public class EmployeeFullTime extends Admin {
    private double  SALARY = (10.000000/30);
    private  int number;
    private static int count;
    private int workDay;
    private int dayOff;

    public EmployeeFullTime(String name, String gender, String birthday, String phone, String email, int workDay, int dayOff,double salary) {
        super(name, gender, birthday, phone, email);
        this.number = count++;
        this.workDay = workDay;
        this.dayOff = dayOff;
        this.SALARY = salary ;
    }

    public double getSALARY() {
        return SALARY;
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
        EmployeeFullTime.count = count;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public int getDayOff() {
        return dayOff;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }
    public double Salary(){
        return  SALARY * (getWorkDay() - getDayOff());
    }
}
