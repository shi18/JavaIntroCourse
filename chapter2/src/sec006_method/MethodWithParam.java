package sec006_method;

public class MethodWithParam {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        twoSum(a, b);
        float c = 30.5f;
        float d = 10.8f;
//        twoSum(c,d);
//        twoSum(a);
    }

    public static void twoSum(int i, int j) {
        int sum = i + j;
        System.out.println("sum of " + i + " and " + j + " is: " + sum);
    }
//    public static void twoSum(float i, float j) {
//        float sum = i + j;
//        System.out.println("sum of " + i + " and " + j + " is: " + sum);
//    }

}
