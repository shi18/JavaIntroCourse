package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //加减乘除，负号，正号，取模，自增，自减
        //+-*/，-, +，%，++， --
        int a = 10;
        int b = -3;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        double f = a / b;
        int g = 10 % 3;
        System.out.println("a is: " + a);
        System.out.println("b is: " + b);
        System.out.println("c is: " + c);
        System.out.println("d is: " + d);
        System.out.println("e is: " + e);
        System.out.println("f is: " + f);
        System.out.println("g is: " + g);

        System.out.println("old f: " + (f++));
        System.out.println("new f: " + f);
        System.out.println("old g: " + (g--));
        System.out.println("new g: " + g);
        //使用场景：购物车商品的加减
        System.out.println(++f);
        System.out.println(--g);

        // 字符串操作
        System.out.println("hello " + " world");
        // 当 + 操作中出现字符串时，此时 + 是 字符串连接符，而不是算数运算符了。
        // 连续进行 + 操作时， 从左到右依次执行
        System.out.println(99 + 99 + "长命百岁");
        System.out.println(99 + "长命百岁" + 99);
        System.out.println("身体健康" + true);
        int age = 100;
        System.out.println("老头今年" + age + "岁");
        System.out.println("老头今年" + "age" + "岁");

        //字符 操作
        char charOne = 'a';
        System.out.println("字符a对应的整数为： "+(int)charOne);
        System.out.println(charOne+age);
        System.out.println(charOne*age);
    }
}
