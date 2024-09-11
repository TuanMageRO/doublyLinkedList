/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinkedlist;

/**
 *
 * @author HP
 */
public class Student {
    private String name;
    private int age;
    private int rollname;

    public Student(String name, int age, int rollname) {
        this.name = name;
        this.age = age;
        this.rollname = rollname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollname() {
        return rollname;
    }

    public void setRollname(int rollname) {
        this.rollname = rollname;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", rollname=" + rollname + '}';
    }
    
}
