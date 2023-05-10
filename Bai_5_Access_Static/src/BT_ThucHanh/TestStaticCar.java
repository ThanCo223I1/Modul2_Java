package BT_ThucHanh;
public class TestStaticCar {
    public static void main(String[] args) {
        Car car = new Car("Mazda 3", "Skyactiv 3");
        System.out.println(Car.SoLuongOTo );
        Car car1 = new Car("Mazda 6", "Skyactiv 6");
        System.out.println(Car.SoLuongOTo);
        Car car2 = new Car("Mazda CX5", "Skyactiv cx5");
        System.out.println(Car.SoLuongOTo);
    }
}
