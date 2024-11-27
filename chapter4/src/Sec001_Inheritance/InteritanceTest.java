package Sec001_Inheritance;

public class InteritanceTest {
    public static void main(String[] args) {
        InheritedStudent stu = new InheritedStudent();
        InheritedTeacher teacher = new InheritedTeacher();
        stu.age = 18;
        stu.name = "zhangsan";
        stu.stuId = "202401101234";

        teacher.age = 50;
        teacher.name = "lisi";
        teacher.empId = "20242024";

        System.out.printf("学生信息如下，年龄： %d，姓名：%s，学号：%s", stu.age, stu.name, stu.stuId);
        System.out.println();
        System.out.printf("教师信息如下，年龄： %d，姓名：%s，学号：%s", teacher.age, teacher.name, teacher.empId);


    }
}
