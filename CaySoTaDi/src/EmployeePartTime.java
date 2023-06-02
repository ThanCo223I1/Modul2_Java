public class EmployeePartTime extends Employee {
    private final double SALARY = 3;
    private int number;
    private static int count;
    private int workTime;

    public EmployeePartTime(String name, int age, String phone, String address, String email, int workTime) {
        super(name, age, phone, address, email);
        this.number = count++;
        this.workTime = workTime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
