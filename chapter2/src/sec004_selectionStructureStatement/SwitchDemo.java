package sec004_selectionStructureStatement;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        /*
        需求：键盘录入数字，显示周几。
        1：周一
        2：周二
        3：周三
        4：周四
        5：周五
        6：周六
        7：周日
        */

        //分析：
        //1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入数字：");
        int num = sc.nextInt();
        //2.利用switch对星期进行匹配
        switch (num) {
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周日");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
