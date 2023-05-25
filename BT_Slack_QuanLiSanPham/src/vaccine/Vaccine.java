package vaccine;

import java.util.Date;

public class Vaccine {
    private int id;
    public int count;
    private String nameVaccine;
    private Date dateVaccine;
    private double price;
    private Date injectVaccine;

    public Vaccine(String nameVaccine, Date dateVaccine, double price, Date injectVaccine) {
        this.id = count++;
        this.nameVaccine = nameVaccine;
        this.dateVaccine = dateVaccine;
        this.price = price;
        this.injectVaccine = injectVaccine;
    }

    public Vaccine() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNameVaccine() {
        return nameVaccine;
    }

    public void setNameVaccine(String nameVaccine) {
        this.nameVaccine = nameVaccine;
    }

    public Date getDateVaccine() {
        return dateVaccine;
    }

    public void setDateVaccine(Date dateVaccine) {
        this.dateVaccine = dateVaccine;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getInjectVaccine() {
        return injectVaccine;
    }

    public void setInjectVaccine(Date injectVaccine) {
        this.injectVaccine = injectVaccine;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "id=" + id +
                ", count=" + count +
                ", nameVaccine='" + nameVaccine + '\'' +
                ", dateVaccine=" + dateVaccine +
                ", price=" + price +
                ", injectVaccine=" + injectVaccine +
                '}';
    }
}