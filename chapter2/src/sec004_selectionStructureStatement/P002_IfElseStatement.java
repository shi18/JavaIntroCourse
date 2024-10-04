package sec004_selectionStructureStatement;

import java.util.Scanner;

/*
请输入一个1-100范围内的整数，
控制台输出： 输入的数字是奇数返回true，是偶数返回false
*/
public class P002_IfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-100范围内的整数：");
        int num = sc.nextInt();
        if(num >= 1 && num <= 100){
            if(num % 2 == 0){
                System.out.println(false);
            }else{
                System.out.println(true);
            }
        }else{
            System.out.println("输入范围错误，请重新运行程序");
        }
    }
}
