package QuanLiNhanVien26_5;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private static int count;
    private int date;

    public Employee(String name, int age, double salary, int date) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void checkId() {
        date++;
    }

//    @Override
//    public String toString() {
//        return  name + ", " + age + ", " + salary + ", " + date + ", ";
//    }
}

