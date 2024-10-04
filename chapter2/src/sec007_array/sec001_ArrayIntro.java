package sec007_array;

public class sec001_ArrayIntro {
    public static void main(String[] args) {
        //普通变量
        int i = 10;
        double d =2.5;
        //打印普通变量
        System.out.println("i : "+ i + " d:"+ d);

        //数组定义，以及静态初始化
        int[] intArr = new int[]{10,20,30};
        double[] doubleArr = new double[]{2.5, 4.5, 6.5};
        //根据数组内存放的数据类型来定义数组所属类型。同时，数组内保存的数据类型需要保持一致，不然会报错，见下例
        //int[] test = {1,2, "st"};
        int intArrTwo[] = {1,2,3,4};
        //数据的隐式转化，int类型数据，可以放到double数组中
        double[] doubleArrTwo = new double[]{10,20,30};
        //double类型数据，不可以放入int类型数组中，会报错
        //int[] intArrTwo = new int[]{20.5, 30.4};
        //简写格式
        int[] intArrThree = {10,20,10};
        //数组中存放学生的年龄，姓名，和身高
        double[] score  = {92, 88.5, 90.5};
    }

}
