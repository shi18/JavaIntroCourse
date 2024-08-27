package sec006_method;
//解释形参和实参的区别
//形参和实参虽然同名，但是互不影响，他们的作用范围仅仅局限于所在的函数中
//如果在函数外声明两个变量a，b，那在函数内对其操作，会影响函数外部定义的变量值
public class FormalAndActualParam {

    public static int c, d;

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        c = 1;
        d = 4;
        System.out.println("初始的值：c = " + c + " d = " + d);
        compareParam(a, b);
        System.out.println("在主函数中，a = " + a + " b = " + b);
        System.out.println("c = " + c + " d = " + d);
    }

    public static void compareParam(int a, int b) {
        a += 2 * b;
        b = a * a;
        System.out.println("在compareParam方法中，a = " + a + "  b = " + b);
        c++;
        d--;
    }
}
