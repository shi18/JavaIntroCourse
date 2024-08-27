package sec006_method;

public class RectanglePerimeter {
    public static void main(String[] args) {
        int longSide = 20;
        int shortSide = 10;

        getPerimeter(longSide, shortSide);
    }

    public static void getPerimeter(int a, int b) {
        System.out.println("长方形的周长为：" + 2 * (a + b));
    }
}
