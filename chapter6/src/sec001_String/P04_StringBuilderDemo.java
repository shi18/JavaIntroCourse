package sec001_String;

public class P04_StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("abc");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("45678910124567890");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("123456789012345");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1111111111111111111111111111111111111111111111111111");
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
    }
}
