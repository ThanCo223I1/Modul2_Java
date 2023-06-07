package Manager;

import Fashion.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerPerSon {
    List<Person> personList = new ArrayList<>();
    List<EmployeeFullTime> employeeFullTimes = new ArrayList<>();
    List<EmployeePartTime> employeePartTimes = new ArrayList<>();
    Validate validate = new Validate();

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

    // Tạo đối tượng chung cho full and part time.
    public Person creatPerson() {
        String name;
        while (true) {
            System.out.println("Enter name : ");
            String inputName = scanner.nextLine();
            if (validate.isValidateInputString(inputName, Validate.Name_PATTERN)) {
                name = inputName;
                break;
            } else System.out.println("Not validate!");
        }
        String gender;
        while (true) {
            System.out.println("Enter Gender: ");
            String inputGender = scanner.nextLine();
            if (validate.isValidateInputString(inputGender, Validate.Gender_PATTERN)) {
                gender = inputGender;
                break;
            } else System.out.println("Not validate!");
        }
        String birthDay;
        while (true) {
            System.out.println("Enter BirthDay: ");
            String inputBirthDay = scanner.nextLine();
            if (validate.isValidateInputString(inputBirthDay, Validate.BirthDay_PETTERN)) {
                birthDay = inputBirthDay;
                break;
            } else System.out.println("Not validate!");
        }
        String phone;
        while (true) {
            System.out.println("Enter Phone: ");
            String inputPhone = scanner.nextLine();
            if (validate.isValidateInputString(inputPhone, Validate.Phone_PETTERN)) {
                phone = inputPhone;
                break;
            } else System.out.println("Not validate!");
        }
        String email;
        while (true) {
            System.out.println("Enter Email: ");
            String inputEmail = scanner.nextLine();
            if (validate.isValidateInputString(inputEmail, Validate.Email_PETTERN)) {
                email = inputEmail;
                break;
            } else System.out.println("Not validate!");
        }
        Person.countIDPerson--;
        return new Person(name, gender, birthDay, phone, email);
    }

    // Tạo đối tượng thêm thuộc tính cho nhân viên fulltime.
    public Person creatEmployeeFullTime() {
        Person person = creatPerson();
        int workDay;
        while (true) {
            System.out.println("Enter workDay: ");
            int inputWorkDay = Integer.parseInt(scanner.nextLine());
            if (validate.isValidateInputString(String.valueOf(inputWorkDay), Validate.WorkDay_PETTERN)) {
                workDay = inputWorkDay;
                break;
            } else System.out.println("Not validate!");
        }

        int dayOff;
        while (true) {
            System.out.println("Enter DayOff: ");
            int inputDayOff = Integer.parseInt(scanner.nextLine());
            if (validate.isValidateInputString(String.valueOf(inputDayOff), Validate.DayOff_PETTERN)) {
                dayOff = inputDayOff;
                break;
            } else System.out.println("Not validate!");
        }
//       double salary;
//        while (true) {
//            System.out.println("Enter Salary: ");
//            double inputSalary = Double.parseDouble(scanner.nextLine());
//            if (validate.isValidateInputString(String.valueOf(inputSalary), Validate.Salary_PETTERN)) {
//                salary = inputSalary;
//                break;
//            } else System.out.println("Not validate!");
//        }
        return new EmployeeFullTime(person.getName(), person.getGender(),
                person.getBirthday(), person.getPhone(), person.getEmail(), workDay, dayOff);
    }

    // Tạo đối tượng thêm thuộc tính cho nhân viên parttime.
    public Person creatEmployeePartTime() {
        Person person = creatPerson();
        int timeWork;
        while (true) {
            System.out.println("Enter TimeWork: ");
            int inputTimeWork = Integer.parseInt(scanner.nextLine());
            if (validate.isValidateInputString(String.valueOf(inputTimeWork), Validate.WorkTime_PETTERN)) {
                timeWork = inputTimeWork;
                break;
            } else System.out.println("Not validate!");
        }
//        double salary;
//        while (true) {
//            System.out.println("Enter Salary: ");
//            double inputSalary = Double.parseDouble(scanner.nextLine());
//            if (validate.isValidateInputString(String.valueOf(inputSalary), Validate.Salary_PETTERN)) {
//                salary = inputSalary;
//                break;
//            } else System.out.println("Not validate!");
//        }
        return new EmployeePartTime(person.getName(), person.getGender(),
                person.getBirthday(), person.getPhone(), person.getEmail(), timeWork);
    }

    //1. Thêm nhân viên Full Time và PartTime.
    public void AddPerson() {
        while (true) {
            List<Person> personList1 = readDataFromFile();
            System.out.println("1. Add Employee FullTime: ");
            System.out.println("2. Add Employee PartTime: ");
            System.out.println("3. Exit.");
            System.out.println("Enter Choice.");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    personList1.add(creatEmployeeFullTime());
                    writeDataToFile(personList1);
                    break;
                case "2":
                    personList1.add(creatEmployeePartTime());
                    writeDataToFile(personList1);
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Not Found Choice!");
            }
        }
    }

    // 2. Hiển thị danh sách nhân viên FullTime và PartTime.
    private void showAll() {
        showEmployeeFullTime();
        showEmployeePartTime();
    }

    private void showEmployeeFullTime() {
        List<Person> personList1 = readDataFromFile();
        System.out.printf("%-10s%-10s%-8s%-10s%-10s%-15s%-15s%-20s%-15s%s", "Full Time: ", "Number", "ID", "Name", "Gender", "BirthDay", "Phone", "Email", "WorkDay", "Day Off \n");
        for (Person person : personList1) {
            if (person instanceof EmployeeFullTime) {
                System.out.printf("%-11s%-10s%-8s%-10s%-10s%-15s%-15s%-20s%-15s%s", " ", ((EmployeeFullTime) person).getNumber(),
                        person.getId(), person.getName(), person.getGender(), person.getBirthday(), person.getPhone(), person.getEmail(), ((EmployeeFullTime) person).getWorkDay(), ((EmployeeFullTime) person).getDayOff() + "\n");
            }
        }
    }

    private void showEmployeePartTime() {
        List<Person> personList1 = readDataFromFile();
        System.out.printf("%-10s%-10s%-8s%-10s%-10s%-15s%-15s%-20s%s", "Part Time: ", "Number", "ID", "Name", "Gender", "BirthDay", "Phone", "Email", "WorkTime \n");
        for (Person person : personList1) {
            if (person instanceof EmployeePartTime) {
                System.out.printf("%-11s%-10s%-8s%-10s%-10s%-15s%-15s%-20s%s", "", ((EmployeePartTime) person).getNumber(),
                        person.getId(), person.getName(), person.getGender(), person.getBirthday(), person.getPhone(), person.getEmail(), ((EmployeePartTime) person).getWorkTime() + "\n");
            }
        }
    }

    public void DisplayPerson() {
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

    //3. Điểm danh nhân viên FullTime Và PartTime
    public void CheckInEmployee() {
        while (true) {
            System.out.println("--------Check In Employee---------");
            System.out.println("1. Check In Employee Full Time: ");
            System.out.println("2. Check In Employee Part Time: ");
            System.out.println("3. Exit.");
            System.out.println("Enter Choice.");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    checkInEmployeeFullTime();
                    break;
                case "2":
                    checkInEmployeePartTime();

                    break;
                case "3":
                    return;
                default:
                    System.out.println("Not Found Choice!");
            }
        }
    }

    public void checkInEmployeeFullTime() {
        List<Person> personList1 = readDataFromFile();
        boolean check = false;
        int workDay;
        System.out.println("Enter Id Check In Full Time: ");
        int employeeId = Integer.parseInt(scanner.nextLine());
        for (Person person : personList1) {
            if (person instanceof EmployeeFullTime) {
                if (person.getId() == employeeId) {
                    check = true;
                    workDay = ((EmployeeFullTime) person).getWorkDay();
                    ((EmployeeFullTime) person).setWorkDay(++workDay);
                }
                writeDataToFile(personList1);
            }
        }
        if (check) {
            System.out.println("Attendance marked for Employee with ID: " + employeeId);
            // cham cong duoc danh dau cho nhan vien cos id la:

        } else {
            System.out.println("Employee with ID //Nhan vien co ID: " + employeeId + " not found//Khong Tim Thay.");
        }

    }

    public void checkInEmployeePartTime() {
        List<Person> personList1 = readDataFromFile();
        boolean check = false;
        int workTime;
        System.out.println("Enter Id Check In Part Time: ");
        int employeeId = Integer.parseInt(scanner.nextLine());
        for (Person person : personList1) {
            if (person instanceof EmployeePartTime) {
                if (person.getId() == employeeId) {
                    check = true;
                    workTime = ((EmployeePartTime) person).getWorkTime();
                    ((EmployeePartTime) person).setWorkTime(++workTime);
                }
            }
        }
        if (check) {
            System.out.println("Attendance marked for Employee with ID: " + employeeId);
            // chấm công được đánh dấu cho nhân viên có ID là:
        } else {
            System.out.println("Employee with ID //Nhan vien co ID: " + employeeId + " not found//Khong Tim Thay.");
        }
        writeDataToFile(personList1);
    }

    //4. Sửa Nhân viên FullTime Và PartTime Theo ID.
    public int findIndexById(int id) {
        List<Person> personList1 = readDataFromFile();
        if (!personList1.isEmpty()) {
            for (int i = 0; i < personList1.size(); i++) {
                if (personList1.get(i).getId() == id) return i;
            }
        }
        writeDataToFile(personList1);
        return -1;
    }

    public void EditPerson() {
        List<Person> personList1 = readDataFromFile();
        while (true) {
            System.out.println("--------Edit Employee---------");
            System.out.println("1. Edit Employee Full Time: ");
            System.out.println("2. Edit Employee Part Time: ");
            System.out.println("3. Exit");
            System.out.println("Enter Choice");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    editEmployeeFullTime();
                    writeDataToFile(personList1);
                    break;
                case "2":
                    editEmployeePartTime();
                    writeDataToFile(personList1);
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Not Found Choice!");
            }
        }
    }

    public void editEmployeeFullTime() {
        List<Person> personList1 = readDataFromFile();
        if (personList.isEmpty()) {
            System.out.println("EmployeeFullTime is Empty!");
        } else {
            System.out.print("Enter ID Full Time: ");
            int idFullTime = Integer.parseInt(scanner.nextLine());
            EmployeeFullTime employeeFullTime = (EmployeeFullTime) creatEmployeeFullTime();
            int checkID = findIndexById(idFullTime);
            if (checkID != -1) {
                employeeFullTime.setId(personList.get(checkID).getId());
                personList.set(checkID, employeeFullTime);
            } else System.out.println("Not found ID!");
        }
        writeDataToFile(personList1);
    }

    public void editEmployeePartTime() {
        List<Person> personList1 = readDataFromFile();
        if (personList1.isEmpty()) {
            System.out.println("EmployeePartTime is Empty!");
        } else {
            System.out.print("Enter ID Part Time: ");
            int idPartTime = Integer.parseInt(scanner.nextLine());
            EmployeePartTime employeePartTime = (EmployeePartTime) creatEmployeePartTime();
            int checkID = findIndexById(idPartTime);
            if (checkID != -1) {
                employeePartTime.setId(personList1.get(checkID).getId());
                personList1.set(checkID, employeePartTime);
            } else System.out.println("Not found ID!");
        }
        writeDataToFile(personList1);
    }

    public void DeleteProductByID() {
        List<Person> personList1 = readDataFromFile();
        if (personList1.isEmpty()) {
            System.out.println("Employee is Empty!");
        } else {
            System.out.print("Enter ID : ");
            int idFullTime = Integer.parseInt(scanner.nextLine());
            int checkID = findIndexById(idFullTime);
            if (checkID != -1) {
                personList1.remove(checkID);
            } else System.out.println("Not found ID!");
        }
        writeDataToFile(personList1);
    }

    //Tính lương nhân viên.
    public double salaryEmployeeFullTime() {
        List<Person> personList1 = readDataFromFile();
        double salaryFullTime = 0;
        for (Person person : personList1) {
            if (person instanceof EmployeeFullTime)
                salaryFullTime += ((EmployeeFullTime) person).Salary();
        }
        System.out.println("Salary Employee Full Time: " + salaryFullTime);
        writeDataToFile(personList1);
        return salaryFullTime;
    }

    public double salaryEmployeePartTime() {
        List<Person> personList1 = readDataFromFile();
        double salaryPartTime = 0;
        for (Person person : personList1) {
            if (person instanceof EmployeePartTime)
                salaryPartTime += ((EmployeePartTime) person).Salary();
        }
        System.out.println("Salary Employee Part Time: " + salaryPartTime);
        writeDataToFile(personList1);
        return salaryPartTime;
    }

    public void totalSalaryEmployee() {
        double total;
        total = salaryEmployeeFullTime() + salaryEmployeePartTime();
        System.out.println("Total Salary Employee is: " + total);
    }

    public void Salary() {
        List<Person> personList1 = readDataFromFile();
        while (true) {
            System.out.println("------Salary Employee------");
            System.out.println("___________________________");
            System.out.println("1. SalaryEmployeeFullTime: ");
            System.out.println("2. SalaryEmployeePartTime: ");
            System.out.println("3. TotalSalaryEmployee: ");
            System.out.println("4. Exit.");
            System.out.println("Enter Choice.");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    salaryEmployeeFullTime();
                    writeDataToFile(personList1);
                    break;
                case "2":
                    salaryEmployeePartTime();
                    writeDataToFile(personList1);
                    break;
                case "3":
                    totalSalaryEmployee();
                    writeDataToFile(personList1);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Not Found Choice!");
            }
        }
    }
}
