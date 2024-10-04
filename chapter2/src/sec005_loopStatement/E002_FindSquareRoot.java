package sec005_loopStatement;

import java.util.Scanner;

public class E002_FindSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数，按回车键结束：");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++){
            if(i*i < input){
                continue;
            }
            if(i * i == input){
                System.out.println(input + "的整数平方根为：" + i);
                break;
            }
            if(i * i > input){
                System.out.println(input + "整数平方根的整数部分为：" + (i-1));
                break;
            }
        }
        /*for (int i = 0; i < input; i++){
            if(i*i < input){
                continue;
            }else if(i * i == input){
                System.out.println(input + "的整数平方根为：" + i);
                break;
            }else{
                System.out.println(input + "整数平方根的整数部分为：" + (i-1));
                break;
            }
        }*/
    }
}
