package sec006_method;

public class CircleArea {
    public static void main(String[] args) {
        int r = 10;
        double pie = 3.14;
        getArea(r,pie);
        getArea(r);
    }

    public static double PIE = 3.14;

    public static void getArea(int r, double pie) {
        System.out.println("圆的面积为：" + pie * r * r);
    }

    public static void getArea(int r) {
        System.out.println("圆的面积为：" + PIE * r * r);
    }
}
