package serialization;


import java.io.Serial;
import java.io.Serializable;

class Student implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;


    String name;
    String Surname;
    int rollNo;
    int srno;
    int num;
    String location;
    private String password;

    public Student(String name, int rollNo, int srno, int num, String Surname, String location) {
        this.name = name;
        this.rollNo = rollNo;
        this.srno=srno;
        this.num= num;
        this.Surname= Surname;
        this.location= location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", srno=" + srno +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getSrno() {
        return srno;
    }

    public void setSrno(int srno) {
        this.srno = srno;
    }

    public void Show(){
        System.out.println(this.name);
    }

    public void display(){
        System.out.println(this.num);
    }
}