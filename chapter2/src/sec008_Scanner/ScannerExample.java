package sec008_Scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 第一种用法，遇到空格，回车，tab键位制表符会停止接受。
        // 如果后面还有sc.next，那么剩下的内容会自动接受到下一次的输入中
        System.out.println("请输入一个整数：");
        sc.nextInt();
        System.out.println("请输入一个浮点数：");
        sc.nextDouble();
        System.out.println("请输入一个字符串：");
        sc.next();

        // 第二种用法，只有遇到回车时才会停止接受
        System.out.println("请输入内容");
        sc.nextLine();

        //不要两种使用方法混用，容易造成不易发现的错误。
    }
}
