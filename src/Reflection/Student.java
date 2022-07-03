package Reflection;

import java.sql.PreparedStatement;

public class Student {
    private String name, result;
    private int age;

    public Student() {
        this.name = "ADIL";
        this.age = 22;
    }

    public Student(String name , int age , String result) {
        this.name = name;
        this.age = age;
        this.result = result;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private void setResult (String result) {
        this.result = result;
    }
}
