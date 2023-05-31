package QuanLiNhanVien26_5;

//Nhan Vien Ky Thuat.
public class TechnicalEmployee extends Employee{
    private int projects;
    private int id;
    private static int count;

    public TechnicalEmployee(String name, int age, double salary, int date, int projects) {
        super(name, age, salary, date);
        this.id = count++;
        this.projects = projects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    public double calculateMonthlySalary(){
        return (500 * getDate()) + (200 * projects);
    }

    @Override
    public String toString() {
        return "Technical: " + id + ", " + super.toString() + projects + ".";
    }
}
