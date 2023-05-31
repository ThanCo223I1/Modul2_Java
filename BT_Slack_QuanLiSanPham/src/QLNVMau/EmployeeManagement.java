package QLNVMau;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int age;
    private double salary;
    private int id;
    private int workingDays;

    public Employee(String name, int age, double salary, int id) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id = id;
        this.workingDays = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void increaseWorkingDays() {
        workingDays++;
    }

    public double calculateMonthlySalary() {
        return salary;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("ID: " + id);
        System.out.println("Working Days: " + workingDays);
    }
}

class AdministrativeEmployee extends Employee {
    private int daysOff;

    public AdministrativeEmployee(String name, int age, double salary, int id, int daysOff) {
        super(name, age, salary, id);
        this.daysOff = daysOff;
    }

    public int getDaysOff() {
        return daysOff;
    }

    @Override
    public double calculateMonthlySalary() {
        return 500 * (getWorkingDays() - daysOff);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Days Off: " + daysOff);
    }
}

class TechnicalEmployee extends Employee {
    private int projects;

    public TechnicalEmployee(String name, int age, double salary, int id, int projects) {
        super(name, age, salary, id);
        this.projects = projects;
    }

    public int getProjects() {
        return projects;
    }

    @Override
    public double calculateMonthlySalary() {
        return 500 * getWorkingDays() + 200 * projects;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Projects: " + projects);
    }
}

class SalesEmployee extends Employee {
    private int sales;

    public SalesEmployee(String name, int age, double salary, int id, int sales) {
        super(name, age, salary, id);
        this.sales = sales;
    }

    public int getSales() {
        return sales;
    }

    @Override
    public double calculateMonthlySalary() {
        return 300 * getWorkingDays() + 50 * sales;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sales: " + sales);
    }
}

public class EmployeeManagement {
    private List<Employee> employees;

    public EmployeeManagement() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println();
        }
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateMonthlySalary();
        }
        return totalSalary;
    }

    public void saveDataToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Employee employee : employees) {
                writer.println("Name: " + employee.getName());
                writer.println("Age: " + employee.getAge());
                writer.println("Salary: " + employee.getSalary());
                writer.println("ID: " + employee.getId());
                writer.println("Working Days: " + employee.getWorkingDays());
                writer.println();
            }
            System.out.println("Data saved to " + fileName + " successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving data to " + fileName);
        }
    }

    public void markAttendance(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                employee.increaseWorkingDays();
                System.out.println("Attendance marked for Employee with ID: " + employeeId);
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();

        AdministrativeEmployee adminEmployee = new AdministrativeEmployee("John", 30, 2000, 30, 5);
        TechnicalEmployee techEmployee = new TechnicalEmployee("Alice", 35, 2500, 20, 3);
        SalesEmployee salesEmployee = new SalesEmployee("Mike", 28, 1800, 30, 10);

        management.addEmployee(adminEmployee);
        management.addEmployee(techEmployee);
        management.addEmployee(salesEmployee);

        management.displayEmployees();
        System.out.println("Total Salary: " + management.calculateTotalSalary());

        management.markAttendance(2);
        management.displayEmployees();

        management.saveDataToFile("employee.txt");
    }
}