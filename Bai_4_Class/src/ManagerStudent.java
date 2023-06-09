import java.util.Scanner;

public class ManagerStudent {
    Student[] students = new Student[2];
    Scanner scanner = new Scanner(System.in);

    ManagerStudent() {
        students[0] = new Student(1, "Tuan", 20);
        students[1] = new Student(2, "Hung", 21);
    }

    public void show() {
        for (Student s : students) {
            System.out.println("---------------------------------------------------");
            System.out.println("        " + s.getId() + " - " + s.getName() + " - " + s.getAge());
        }
    }

    public Student createStudent() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập Age");
        int age = Integer.parseInt(scanner.nextLine());

        Student student = new Student(id, name, age);
        return student;
    }

    public void add() {
        Student student = createStudent();
        Student[] newStudents = new Student[students.length + 1];
        newStudents[newStudents.length - 1] = student;
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        students = newStudents;
    }

    public void edit() {
        System.out.println("Nhập id muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Nhập name");
                String name = scanner.nextLine();
                System.out.println("Nhập Age");
                int age = Integer.parseInt(scanner.nextLine());

                s.setName(name);
                s.setAge(age);
                return;
            }
        }
        System.err.println("        Không tìm thấy id cần sửa");
    }

    public void delete() {
        System.out.println("Nhập id muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        int index = findIndexById(id);

        if (index != -1) {
            Student[] newStudents = new Student[students.length - 1];
            for (int i = 0; i < newStudents.length; i++) {
                if (i < index) {
                    newStudents[i] = students[i];
                } else {
                    newStudents[i] = students[i + 1];
                }
            }
            students = newStudents;
        } else {
            System.err.println("        Không tìm thấy id cần xóa");
        }
    }

    public int findIndexById(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void Search() {
        System.out.println("Nhập Tên Cần Tìm: ");
        String Name = scanner.nextLine();
        for (Student student : students) {
            if (Name.equals(student.getName())) {
                System.out.println("        " + student.getId() + " - " + student.getName() + " - " + student.getAge());
            }
        }
    }
    public void SapXep(){
        System.out.println("Sắp xếp theo thứ tự: ");
        Student temp;
        for (int i = 0; i < students.length -1; i++) {
            for (int j = i+1; j < students.length ; j++) {
                if (students[i].getAge() > students[j].getAge() ){
                     temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Danh sách sau khi sắp xếp: " );
        show();
    }
}