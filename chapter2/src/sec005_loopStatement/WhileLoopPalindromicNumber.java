package sec005_loopStatement;

import java.util.Scanner;
//palindromic 回文的，复发的
public class WhileLoopPalindromicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数，按回车键结束：");
        int input = sc.nextInt();
        int num = input;
        int result = 0;

        while(num != 0){
            int unit = num % 10;
            num = num / 10;
            result = result * 10 + unit;
//            System.out.println("unit: "+ unit + " num: " + num + " palindromic: " + palindromic);
        }
        if(result == input){
            System.out.println(input+ "是回文数~");
        }else{
            System.out.println(input + "不是回文数！");
        }
    }



}
