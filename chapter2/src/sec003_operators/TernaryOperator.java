package sec003_operators;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        //格式：关系表达式？表达式1：表达式2
        //如果条件成立，返回表达式1，如果条件不成立，返回表达式2
        //三元运算符的结果必须被使用，不能单独写 例如 a > b ? a : b
        //求两个数字中较大的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int numOne = sc.nextInt();
        System.out.println("请输入第二个整数： ");
        int numTwo = sc.nextInt();

        int max = numOne >= numTwo ? numOne : numTwo;
        System.out.println(numOne + " 和 " + numTwo + " 中最大的值为： " + max);
        //思考，如果输入三个数，应该怎样写代码？
    }
}
