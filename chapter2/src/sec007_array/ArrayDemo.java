package sec007_array;

public class ArrayDemo {
    public static void main(String[] args) {
        int i = 10;
        double d =2.5;
        //数据定义，以及静态初始化
        int[] intArr = new int[]{10,20,30};
        double[] doubleArr = new double[]{2.5, 4.5, 6.5};

        //数据的隐式转化，int类型数据，可以放到double数组中
        double[] doubleArrTwo = new double[]{10,20,30};
        //double类型数据，不可以放入int类型数组中，会报错
//        int[] intArrTwo = new int[]{20.5, 30.4};

        //简写格式
        int[] intArrThree = {10,20,10};

        //数组中存放学生的年龄，姓名，和身高
        double[] score  = {92, 88.5, 90.5};


    }

}
