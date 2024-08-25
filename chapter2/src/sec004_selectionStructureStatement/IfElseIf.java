package sec004_selectionStructureStatement;
//成绩录入系统判定成绩属于优秀，良好，及格还是不及格
//其他运行场景，例如不同的超市会员级别，在某些物品上的打着程度不一样。
import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入成绩： ");
        int score = sc.nextInt();

        if (score >= 0 && score <= 100) {
            if (score < 60) {
                System.out.println("不及格");
            } else if (score < 80) {
                System.out.println("及格");
            } else if (score < 90) {
                System.out.println("良好");
            } else {
                System.out.println("优秀");
            }
        } else {
            System.out.println("输入成绩范围错误，成绩应该满足 0 <= score <= 100");
        }
    }
}
