package sec004_selectionStructureStatement;

import java.util.Scanner;

public class P006_simpleCalculartor {
    public static void main(String[] args) {
        // 使用 Scanner 是想键盘输入的功能
        Scanner sc = new Scanner(System.in);
        //打印语句，提示用户输入的两个数字的范围
        System.out.println("请输入0-100以内的两数字");
        //打印语句， 提示用户输入第一个数字
        System.out.println("请输入第一个数字：");
        //真正执行输入的操作代码
        double inputOne = sc.nextDouble();
        //答应语句，提示输入第二个数字
        System.out.println("请输入第二个数字：");
        double inputTwo = sc.nextDouble();
        if((inputOne > 100 || inputOne < 0) || (inputTwo > 100 || inputTwo < 0)){
            System.out.println("输入的两个数字不满足0-100范围要求，请重新执行程序并输入数字");
        }else{
            System.out.println("请输入想要执行的算数运算操作：1：乘法，2：除法 3：减法 4：加法 5：求余");
            //设置算数运算对应的标识符，通过输入的数字判断执行哪一个算数运算操作
            int signal = sc.nextInt();
            // 1：乘法，2：除法 3：减法 4：加法 5：求余

            //条件判断语句，判断signal来得到执行哪个算数运算
            if(signal == 1){
                System.out.println(inputOne + " * " + inputTwo + " = " + inputOne * inputTwo);
            }else if(signal == 2){
                System.out.println(inputOne + " / " + inputTwo + " = " + inputOne / inputTwo);
            }else if(signal == 3){
                System.out.println(inputOne + " - " + inputTwo + " = " + (inputOne - inputTwo));
            }else if(signal ==4){
                System.out.println(inputOne + " + " + inputTwo + " = " + (inputOne + inputTwo));
            } else if (signal == 5) {
                System.out.println(inputOne + " % " + inputTwo + " = " + inputOne % inputTwo);
            }else {
                System.out.println("输入的运算操作代码无效");
            }
        }
    }
}
