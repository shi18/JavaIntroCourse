package sec007_array;

import java.util.Arrays;

public class AccessArray {
    public static void main(String[] args) {
        //思考如何把数组的值打印？
        //普通的数据变量打印如下
        int a = 10;
        System.out.println(a);
        //如果用同样的方式打印数组，得到[I@b4c966a
        //其中[表示这是一个数组
        //I -> Integer,整数类型
        //@ -> 标记符号，表示后面的内容为数组的真实地址
        //b4c966a -> 16进制的表示方法，代表数组在计算机中的地址
        //说明如果我们直接打印数组的变量名字，我们得到的只是数组中的数组在计算机内存中的存放地址
        //那么如何得到数组中的数据呢？
        int[] arr = {10, 20, 5};
        System.out.println(arr);
        //简单的方法,直接调用Java帮我们写好的将数组转化为字符串的包中的方法，然后打印
        System.out.println(Arrays.toString(arr));
        //如果自己访问数组呢？想想在图书馆中怎么找书
        //流程，电脑输入书名，然后返回结果，如果书名存在的话，显示书所在的书架信息
        //第几排，第几行。如果不存在，返回书籍不存在的信息。
        //数组中内容的访问有些类似，只不过对于数组来说，我们通过一个叫做索引的值来访问数组
        //且索引值从0开始，到数组的长度-1结束
        //例如上述数组， 10 -> arr[0] 20 -> arr[1] 5-> arr[2]

        //数组长度为3，索引在2 = 3-1处结束。
        //如果写arr[3]则会报错,Index 3 out of bounds for length 3
        //System.out.println(arr[3]);

        //如何把数据放入数组中，同样通过索引
        arr[0] = 100;
        System.out.println(Arrays.toString(arr));

        //通过循环实现数组值的访问
        System.out.print("[");
        for (int i = 0; i < 3; i++) {
            if (i != 2) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i] + "");
            }
        }
        System.out.println("]");
        //思考如何通过while循环和do-while循环实现数组访问？
        //当数组很大时，不可能去数长度例如[1,23,3,1,3,2,54,5,6,6,7,23,4,32,2,42,4,2,4,23]
        //可以通过系统方法.length 得到数组长度
        int n = arr.length;
        System.out.println("数组的长度为： "+ n);
        int [] arrTwo = {1,23,3,1,3,2,54,5,6,6,7,23,4,32,2,42,4,2,4,23};
        //求数组的和
        System.out.println("数组2： ");
        System.out.println(Arrays.toString(arrTwo));
        int sum = 0;
        for(int i = 0; i < arrTwo.length; i++){
            sum += arrTwo[i];
        }
        System.out.println("数组的和为：" + sum);

        //数组中能被3整除的数字的个数？
        int count = 0;
        for(int i = 0; i < arrTwo.length; i++){
            if(arrTwo[i] % 3 == 0){
                count++;
                System.out.print(arrTwo[i]+" ");
            }
        }
        System.out.println("能被3整除的数字个数为：" + count);

        //遍历数组，若访问到的数组为奇数，乘以2并放入原来数字位置，若为偶数，除以2并放入原来数字位置

        for(int i = 0; i < arrTwo.length; i++){
            if(arrTwo[i] % 2 == 0){
                arrTwo[i] /= 2;
            }else{
                arrTwo[i] *= 2;
            }
        }
        System.out.println("更新后的数组2： ");
        System.out.println(Arrays.toString(arrTwo));

        //数组的交换,交换0和2位置的数字
        int tmp = arr[0];
        arr[0] = arr[2];
        arr[2] = tmp;
        System.out.println(Arrays.toString(arr));

        //数组的动态初始化
        int[] arrThree = new int[30];
        System.out.println(Arrays.toString(arrThree));
        //思考，如何使用scanner，指定数组长度n，随后在控制台输入n个数，初始化数组？

    }
}
