package QuanLiNhanVien26_5;


//Nhan Vien Hanh Chinh.
public class AdministrativeEmployee extends Employee {
    private int daysoff;
    private int id;
    private static int count;

    public AdministrativeEmployee(String name, int age, double salary, int date, int daysoff) {
        super(name, age, salary, date);
        this.id = count++;
        this.daysoff = daysoff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDaysoff() {
        return daysoff;
    }

    public void setDaysoff(int daysoff) {
        this.daysoff = daysoff;
    }

    public double calculateMonthlySalary() {
        return 500 * (getDate() - daysoff);

    }
    @Override
    public String toString() {
        return  "Admin:" + id + super.toString() + daysoff + ".";
    }
}
