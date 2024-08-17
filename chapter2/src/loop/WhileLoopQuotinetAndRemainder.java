package loop;

import java.util.Scanner;

public class WhileLoopQuotinetAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数dividend： ");
        int dividend  = sc.nextInt();
        System.out.println("请输入除数 divisor： ");
        int divisor = sc.nextInt();
        int count = 0;
        while(dividend >= divisor){
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("quotinet---商为：" + count);
        System.out.println("remainder---余数为： " + dividend);
    }
}
