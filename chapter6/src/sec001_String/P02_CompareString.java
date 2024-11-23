package sec001_String;

import java.util.Scanner;

public class P02_CompareString {
    public static void main(String[] args) {
        // create two string
        String strOne = "abc";
        String strTwo = new String("abc");
        //1. compare string
        //基本数据类型，比较的为数据的值
        //引用数据类型，比较的是地址值
        System.out.println(strOne == strTwo);
        //2. compare string
        //比较字符串中的内容
        String strThree = "Abc";

        System.out.println(strOne.equals(strTwo));
        System.out.println(strOne.equalsIgnoreCase(strThree));
        //3. 比较定义的字符串和scaner输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串 abc：");
        // sc.next() 产生的字符串是通过new String()得到的，如果相比较，需要使用.equals()
        String strInput = sc.next();
        System.out.println(strInput.equals(strOne));
    }
}
