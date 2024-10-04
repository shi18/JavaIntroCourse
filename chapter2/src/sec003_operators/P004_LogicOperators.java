package sec003_operators;

public class P004_LogicOperators {
    public static void main(String[] args) {
        /*logic and && */
        System.out.println("-------logic and &&-------");
        boolean testOne = returnFalse() && returnTrue();
        System.out.println("testOne result: " + testOne);
        System.out.println("-------bitwise and &-------");
        boolean testTwo= returnFalse() & returnTrue();
        System.out.println("testOne result: " + testTwo);

        /*logic or || */
        System.out.println("-------logic or ||-------");
        boolean testThree = returnTrue() || returnFalse();
        System.out.println("testThree result: " + testThree);
        System.out.println("-------bitwise or |-------");
        boolean testFour = returnTrue() | returnFalse();
        System.out.println("testFour result: " + testFour);

        System.out.println("开始位运算符展示");
        // 逻辑非
        System.out.println(!true);
        // 逻辑与
        System.out.println(true & false);
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(true & true);
        //逻辑或
        System.out.println(true | false);
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(true | true);
        //逻辑异或
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ true);

    }

    public static boolean returnTrue(){
        System.out.println("enter return True function");
        return true;
    }
    public static boolean returnFalse(){
        System.out.println("enter return False function");
        return false;
    }

}
