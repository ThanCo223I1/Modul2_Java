package Manager;

import Fashion.EmployeeFullTime;
import Fashion.EmployeePartTime;
import Fashion.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerPerSon {
    List<Person> personList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void writeDataToFile(List<Person> personList) {
        try {
            FileOutputStream fos = new FileOutputStream("NhanVien.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(personList);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Person> readDataFromFile() {
        List<Person> personList1 = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("NhanVien.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            personList1 = (List<Person>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return personList1;
    }

    public Person creatPerson() {
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter BirthDay: ");
        String birthDay = scanner.nextLine();
        System.out.println("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        Person.countIDPerson--;
        return new Person(name, gender, birthDay, phone, email);
    }

    public Person creatEmployeeFullTime() {
        Person person = creatPerson();
        System.out.println("Enter workDay: ");
        int workDay = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter offDay: ");
        int offDay = Integer.parseInt(scanner.nextLine());
        return new EmployeeFullTime(person.getName(), person.getGender(),
                person.getBirthday(), person.getPhone(), person.getEmail(), workDay, offDay);
    }

    public Person creatEmployeePartTime() {
        Person person = creatPerson();
        System.out.println("Enter TimeWork: ");
        int timeWork = Integer.parseInt(scanner.nextLine());
        return new EmployeePartTime(person.getName(), person.getGender(),
                person.getBirthday(), person.getPhone(), person.getEmail(), timeWork);
    }

    public void AddPerson() {
        List<Person> personList1 = readDataFromFile();
        System.out.println("1. Add Employee FullTime: ");
        System.out.println("2. Add Employee PartTime: ");
        System.out.println("3. Exit.");
        System.out.println("Enter Choice.");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                personList.add(creatEmployeeFullTime());
                writeDataToFile(personList1);
                break;
            case "2":
                personList.add(creatEmployeePartTime());
                writeDataToFile(personList1);
                break;
            case "3":
                return;
            default:
                System.out.println("Not Found Choice!");
        }

    }

    private void showAll() {
        showEmployeeFullTime();
        showEmployeePartTime();
    }

    private void showEmployeeFullTime() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "Full Time: ", "Number", "ID", "Name", "Gender", "BirthDay", "Phone", "Email", "WorkDay", "Day Off \n");
        for (Person person : personList) {
            if (person instanceof EmployeeFullTime) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "", ((EmployeeFullTime) person).getNumber(),
                        person.getId(), person.getName(), person.getGender(),person.getBirthday(), person.getPhone(), person.getEmail(), ((EmployeeFullTime) person).getWorkDay(), ((EmployeeFullTime) person).getDayOff() + "\n");
            }
        }
    }

    private void showEmployeePartTime() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "Part Time: ", "Number", "ID", "Name", "Gender", "BirthDay", "Phone", "Email", "WorkTime \n");
        for (Person person : personList) {
            if (person instanceof EmployeePartTime) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "", ((EmployeePartTime) person).getNumber(),
                        person.getId(), person.getName(), person.getGender(),person.getBirthday(), person.getPhone(), person.getEmail(), ((EmployeePartTime) person).getWorkTime() + "\n");
            }
        }
    }
        public void Display () {
            while (true) {
                System.out.println(" ---------Display Person--------- ");
                System.out.println("1. Show Employee Full Time: ");
                System.out.println("2. Show Employee Part Time: ");
                System.out.println("3. Show All : ");
                System.out.println("4. Exit.");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        showEmployeeFullTime();
                        break;
                    case "2":
                        showEmployeePartTime();
                        break;
                    case "3":
                        showAll();
                        break;
                    case "4":
                        return;
                    default:
                        System.out.println("Not found choice! ");
                }
            }
        }

}
