package sec001_classAndObject;

public class StudentTest {
    public static void main(String[] args) {
        int age = 18;
        String name = "张三";
        Student stu = new Student(name, age);
        stu.printStuInfo();
        Student stu2 = new Student(name, age);
        stu2.height = 9;
        
    }
}
