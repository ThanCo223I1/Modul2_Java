import javax.xml.namespace.QName;
import java.util.Scanner;

public class ManagerStudent {
    Student[] students = new Student[2];
    Scanner scanner = new Scanner(System.in);

    ManagerStudent() {
        students[0] = new Student(1, "Nam", 20);
        students[1] = new Student(2, "Nhan", 21);
    }

    public void show() {
        for (Student s : students) {
            System.out.println(s.getId() + " - " + s.getName() + " - " + s.getAge());
        }
    }

    public void add(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập Age");
        int age = Integer.parseInt(scanner.nextLine());

        Student student = new Student(id,name,age);

        Student[] newStudents = new Student[students.length + 1];
        newStudents[newStudents.length -1] = student;
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        students = newStudents;
    }

    public void Edit() {
        System.out.println("Nhap id can sua: ");
        int id1= Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < students.length ; i++) {
            if (id1 == students[i].getId()){
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("ID khong dung");
        }else {
            for (int i = 0; i < students.length; i++) {
                if (id1 == students[i].getId()){
                    System.out.println("Nhap ten can sua: ");
                    String name = scanner.nextLine();
                    students[i].setName(name);
                    System.out.println("Nhap tuoi can sua: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    students[i].setAge(age);
                }
            }
        }
    }
    public  void Xoa(){
        System.out.println("Nhap id can xoa: ");
        int id2 = Integer.parseInt(scanner.nextLine());
        Student[] students1 = new Student[students.length - 1];
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id2){
                check = true;
                break;
            }
        }
        if (!check)
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id2){
                for (int j = 0; j < students1.length; j++) {
                    if (j < i){
                        students1[j] = students[j];
                    }else {
                        students1[j] =students[j + 1];
                    }
                }
                students = students1;
            }else {
                System.out.println("Khong thay id can xoa:");
                break;
            }
        }
    }
}