package sec003_operators;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        //将一个三位数，拆分为个位，十位，百位，然后分别在控制台上显示
        int num = 321;
        int unit = num % 10;
        int ten = num / 10 % 10;
        int hundred = num / 100 % 10;

        System.out.println("个位是： " + unit);
        System.out.println("十位是： " + ten);
        System.out.println("百位是： " + hundred);

        //对于输入的任意的数字怎么处理呢？
        //设置一个offset，初始值为1，每求余一次，offset乘以10，一直到求余之后的数字小于1,则结束
        // x / 1 % 10 -> 个位数字
        // x / 1 * 10 % 10 -> 十位数字
        // x / 1 * 10 * 10 % 10 -> 百位数字
        // 上述内容需要用到后面章节讲到的知识点，此处可以先做了解
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int offset = 1;
        int count = 0;
        int val;
        while(true){
            val = inputNum / (offset * (int)Math.pow(10, count)) % 10;
            if(val >= 1 ){
                count++;
                System.out.println(val + " ");
            }else{
                break;
            }

        }
    }
}
