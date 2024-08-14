package operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a is: " + a);
        System.out.println("b is： " + b);
        a += b;
        System.out.println("a += b --> a = " + a);

        System.out.println("a is: " + a);
        System.out.println("b is： " + b);
        a -= b;
        System.out.println("a -= b --> a = " + a);

        System.out.println("a is: " + a);
        System.out.println("b is： " + b);
        a *= b;
        System.out.println("a *= b --> a = " + a);

        System.out.println("a is: " + a);
        System.out.println("b is： " + b);
        a /= b;
        System.out.println("a /= b --> a = " + a);

        System.out.println("a is: " + a);
        System.out.println("b is： " + b);
        a %= b;
        System.out.println("a %= b --> a = " + a);

    }
}
