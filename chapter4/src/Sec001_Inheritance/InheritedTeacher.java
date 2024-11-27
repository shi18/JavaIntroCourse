package Sec001_Inheritance;

public class InheritedTeacher extends SchoolMember {
    String empId;

    public void teaching() {
        System.out.println("教学");
    }

    public InheritedTeacher() {
        //对于子类，此处有隐藏起来的super(),此方法会调用父类的无参构造。
        //super();
        System.out.println("老师的无参构造");
    }
}
