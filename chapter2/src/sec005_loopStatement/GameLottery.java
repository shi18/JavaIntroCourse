package sec005_loopStatement;

import java.util.Scanner;

public class GameLottery {
    public static void main(String[] args) {
        int range = 8;
        //math.random -->> [0,) 左闭右开区间
        int randomNum = (int)(Math.random() * range) + 1;
        System.out.println("生成的随机数为："+randomNum);
        int count = 0;
        while(true){
            System.out.println();
            System.out.println("请输入一个整数抽奖，按回车结束：");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if(input == randomNum){
                System.out.println("恭喜你中奖了！");
                break;
            }else{
                if(count == 3 ){
                    System.out.println("虽然没中大奖，给你一个鼓励奖！");
                }else{
                    System.out.println("可惜了，再接再厉！");
                }

            }
            count++;
        }
    }
}
