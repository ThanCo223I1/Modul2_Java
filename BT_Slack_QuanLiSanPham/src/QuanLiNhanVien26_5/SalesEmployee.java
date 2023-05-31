package QuanLiNhanVien26_5;

//Nhan Vien Sales.
public class SalesEmployee extends  Employee{
    private int id;
    private static  int count;
    private  int sales;

    public SalesEmployee(String name, int age, double salary, int date, int sales) {
        super(name, age, salary,date);
        this.id = count++;
        this.sales = sales;
    }


    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
    public double calculateMonthlySalary(){
        return (300 * getDate()) + (50 * sales);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sales: " + id + ", " + super.toString() + sales + "." ;
    }
}
