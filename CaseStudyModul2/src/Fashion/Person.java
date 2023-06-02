package Fashion;

import java.io.Serializable;

public class Person implements Serializable {
    public static int countIDPerson = 1;
    private int id;
    private String name;
    private String gender;
    private String birthday;
    private String phone;
    private String email;

    public Person(String name, String gender, String birthday, String phone, String email) {
        this.id = countIDPerson++;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
    }

    public static int getCountIDPerson() {
        return countIDPerson;
    }

    public static void setCountIDPerson(int countIDPerson) {
        Person.countIDPerson = countIDPerson;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
