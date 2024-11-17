package sec002_Encapsulation;

public class StringMethodsUsageTest {
    public static void main(String[] args) {
        String str = "This is a string";
        System.out.println("str: " + str);
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.contains("is"));
        System.out.println(str.replace("a", "a short"));
    }
}
