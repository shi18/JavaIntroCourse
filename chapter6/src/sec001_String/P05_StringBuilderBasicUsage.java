package sec001_String;

public class P05_StringBuilderBasicUsage {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("test");
        StringBuilder reversed = sb.reverse();
        System.out.println(reversed);

        StringBuilder appended = reversed.append(" he");
        System.out.println(appended);

        int sbLen = appended.length();
        System.out.println(sbLen);

        StringBuilder last = sb.replace(0, 3, "a");
        System.out.println(last);

        String str = last.toString();
        System.out.println(str);

        for (int i = 0; i < last.length(); i++) {
            System.out.println(last.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }
}
