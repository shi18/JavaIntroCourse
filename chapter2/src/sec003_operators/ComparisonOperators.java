package sec003_operators;

public class ComparisonOperators {
    public static void main(String[] args) {
        // 比较运算符的返回值为布尔值
        int a = 10;
        int b = 20;
        System.out.println("a is: " + a + "\nb is: " + b);
        System.out.println("a == b -->> " + (a == b));
        System.out.println("a != b -->> " + (a != b));
        System.out.println("a  > b -->> " + (a > b));
        System.out.println("a  < b -->> " + (a < b));
        System.out.println("a >= b -->> " + (a >= b));
        System.out.println("a <= b -->> " + (a <= b));
        //注意 + 号的优先级高于 比较符号，所以需要用小括号，斗则会出现如下错误。
        //System.out.println("a <= b -->> " + a <= b);
        //java: 二元运算符 '<=' 的操作数类型错误
        //第一个类型:  java.lang.String
        //第二个类型: int
    }
}
