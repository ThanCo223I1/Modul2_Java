package ThucHanh;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("element 0: " + listInteger.get(0));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.printf("element 2: " + listInteger.get(2));
        System.out.printf("element 3: " + listInteger.get(3));
        System.out.println("element 4: " + listInteger.get(4));

        listInteger.add(6);
        System.out.println("element: " + listInteger.get(5));
//        listInteger.add(-1);
//        System.out.println("element: " + listInteger.get(-1));


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"than",9));
        students.add(new Student(2,"cuong",9));
        System.out.println(students.get(1).toString());
        System.out.println(students.get(0).toString());
        System.out.println(students.size());


    }
}

class Student {
    private int id;
    private String name;
    private int score;

    public Student() {
    }

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student {" + "id= " + id + ", name= '" + name + '\'' + ", score= " + score + '}';
    }
}
