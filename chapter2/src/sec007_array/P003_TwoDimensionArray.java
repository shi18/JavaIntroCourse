package sec007_array;

import java.util.Arrays;

public class P003_TwoDimensionArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        // 返回值为null，代表三个位置指向的空间地址为null，我们还没有给对应的列初始化
        System.out.println(Arrays.toString(arr));
        int[][] arrTwo = new int[3][2];
        //返回值为对应的列所在的地址
        System.out.println(Arrays.toString(arrTwo));
        System.out.println(Arrays.toString(arrTwo[0]));
        System.out.println(Arrays.toString(arrTwo[1]));

        int[][] arrThree = {{1,2},{1,2,3,4},{3}};
        System.out.println(Arrays.toString(arrThree[0]));
        System.out.println(Arrays.toString(arrThree[1]));
        System.out.println(Arrays.toString(arrThree[2]));

        //利用数组存储多个学生的多门成绩
        //每一行代表不同的学生
        //每一列代表不同的科目
        //      数学  英语
        //学生A
        //学生B
        //学生C
        int[][] score = new int[3][2];
        score[0][0] = 90;
        score[0][1] = 95;

        score[1][0] = 90;
        score[1][1] = 95;

        score[2][0] = 90;
        score[2][1] = 95;

        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.toString(score[0]));
        System.out.println(Arrays.toString(score[1]));
        System.out.println(Arrays.toString(score[1]));

    }
}
