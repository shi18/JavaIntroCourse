package sec001_classAndObject;

import javax.print.DocFlavor;

public class Student {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printStuInfo(){
        System.out.println("打印学生的姓名和年龄");
        System.out.println("name: " + this.name + "  age:" + this.age);
    }
}
