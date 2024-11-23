package sec001_String;

public class P01_CreateStringDemo {
    public static void main(String[] args) {
        //第一种创建string的方法
        String str = "this is a string, 这是一个字符串";
        //第二种创建string的方法
        String strTwo = new String("this is string two, 这是第二个字符串");
        //第三种创建string的方法
        char[] charArr = {'a', 'b', 'c', '字', '符'};
        String strThree = new String(charArr);
        //第四种创建string的方法
        byte[] byteArr = {97, 98, 99, 100, 101, 102, 103};
        String strFour = new String(byteArr);

        System.out.println("str 1: " + str);
        System.out.println("str 2: " + strTwo);
        System.out.println("str 3: " + strThree);
        System.out.println("str 4: " + strFour);
    }
}
