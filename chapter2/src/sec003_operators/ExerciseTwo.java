package sec003_operators;

import java.util.Scanner;

public class ExerciseTwo {
    /*键盘输入两个整数，如果其中一个为6，那么最终结果输出true
    如果两个整数是6的倍数，那么最终结果输出true
    其他情况，结果输出false */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int numOne = sc.nextInt();
        System.out.println("请输入第二个整数： ");
        int numTwo = sc.nextInt();
        boolean result = numOne == 6 || numTwo == 6 || (numOne + numTwo)%6 ==0;
        System.out.println(result);
    }
}
