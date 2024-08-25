package sec001_basicWritingRule;

/*
public : 类的修饰词
class: 表明这是一个类
CommentDemo: 类的名字，首字母需要大写。
*/
public class CommentDemo {
    /*
    public 方法的修饰词
    static 表明该方法是静态的
    void 函数的返回值为空，也就是不返回任何值
    main 程序的主方法，java程序的入口点 --->>> 对于main方法，要求是一个公共静态的方法，且返回类型为void
    String[] arg : 参数类型为字符串数组（String表示字符串类型）， 变量名为args，用于接受命令行参数
    */
    public static void main(String[] args) {
//        System是Java标准库中的类， 在java.lang包中，不需要显示导入
//        out是System类的静态成员变量，是一个PrintStream对象，用于标准输出
//        println 是PrintStream类的一个方法，用于输出文本且换行
        System.out.println("hello world");
    }

//    /*
//    /* int x = 10;*/
//    int x = 5; */
}
