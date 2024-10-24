package sec004_selectionStructureStatement;

import java.util.Scanner;

public class P007_simpleCalculatorWithSwitch {
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
            switch(signal){
                // 此处的switch语句中，signal会和 case 后面的数字进行比较，如果相等，则执行下面的打印语句。
                // 打印语句执行完毕后，执行break，break代表中断，即停止执行switch语句的剩下的部分。
                //如果输入的signal值为10，所有的case都不满足 == 10，那么就执行default语句，
                //default语句的位置不影响执行结果。
                //default:
                //System.out.println("请输入一个有效的操作代码");
                case 1:
                System.out.println(inputOne + " * " + inputTwo + " = " + inputOne * inputTwo);
                break;
                case 2:
                System.out.println(inputOne + " / " + inputTwo + " = " + inputOne / inputTwo);
                break;
                case 3:
                System.out.println(inputOne + " - " + inputTwo + " = " + (inputOne - inputTwo));
                break;
                case 4:
                System.out.println(inputOne + " + " + inputTwo + " = " + (inputOne + inputTwo));
                break;
                case 5:
                System.out.println(inputOne + " % " + inputTwo + " = " + inputOne % inputTwo);
                break;
                default:
                System.out.println("请输入有效的操作代码");
            }
        }
    }
}
