package variable;

public class VariableDemo {
    public static void main(String[] args) {
        /* 定义变量
        数据类型  变量名 = 数据值；
        */
        int a = 10;
        int b = 5;

        /*输出打印*/
        System.out.println(a);
        System.out.println(b);

        /*参与计算*/
        System.out.println(a+b);
        int c = a + b;
        System.out.println(c);

        /*修改记录的值*/
        a = 12;
        b = 13;
        System.out.println(a);
        System.out.println(b);

        /*一个变量只能存储一个值*/
//        int d = 12 14;
        /*一个变量名只能被定义一次*/
//        int c = 10;
        /*变量使用之前需要赋值*/
//        int e;
//        System.out.println(e);
        /*一条语句可以定义多个变量, 使用较少*/
//        int f = 1, g = 2, h = 3;

    }
}
