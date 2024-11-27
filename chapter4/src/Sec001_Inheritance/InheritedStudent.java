package Sec001_Inheritance;

public class InheritedStudent extends SchoolMember {
    String stuId;

    public void takeCourse() {
        System.out.println("听课");
    }

    public InheritedStudent() {
        //对于子类，此处有隐藏起来的super(),此方法会调用父类的无参构造。
        //super();
        System.out.println("学生的无参构造");
    }
}
