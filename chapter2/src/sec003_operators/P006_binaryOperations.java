package sec003_operators;

public class P006_binaryOperations {
    public static void main(String[] args) {
        byte a = 77;
        printByteWithBianryFormat(a);
        byte b = 59;
        printByteWithBianryFormat(b);
        byte andRes = (byte) (a & b);
        System.out.print("\n a & b = ");
        printByteWithBianryFormat(andRes);
//        byte andShortRes = (byte)(a && b);
//        System.out.println("\n a && b = ");
        byte orRes = (byte)(a | b);
        System.out.print("\n a | b = ");
        printByteWithBianryFormat(orRes);
        byte xorRes = (byte)(a ^ b);
        System.out.print("\n a ^ b = ");
        printByteWithBianryFormat(xorRes);
        byte notRes = (byte)(~a);
        System.out.print("\n ~a = ");
        //10110010 -> 取反：01001101 -> 加1：01001110 ->表示：78 -> 最开始10110010以1开头表示负数 -> -78
        //-78怎么表示 -> 78：01001110 -> 减1：01001101 -> 取反:10110010 -> -78:10110010
        printByteWithBianryFormat(notRes);
        System.out.println(77 & 59);
        //System.out.println(77 && 59);
        System.out.println(true && false);
        //System.out.println(0 && 1);
        //boolean boolVal = (boolean) 0;
        System.out.println(false & true);
    }

    public static void printByteWithBianryFormat(byte num){
        System.out.println();
        System.out.print("十进制数： " + num);
        /*
        System.out.print("二进制表示：");
        for(int i = 7; i >= 0; i--){
            // java中 << 优先级高于&，此处加上小括号的目的是为了更
            // 直观的看到代码执行的顺序
            if((num & (1 << i)) == 0){
                System.out.print("0");
            }else{
                System.out.print("1");
            }
        }
        System.out.print("\n二进制表示：");
        for(int i = 7; i >= 0; i--){
            char cPrint = (num & 1 << i) == 0 ? '0' : '1';
            System.out.print(cPrint);
        }*/
        System.out.print("    二进制表示：");
        for(int i = 7; i >=0; i--){
            System.out.print((num & 1 << i) == 0 ? "0" : "1");
        }
        /*
        System.out.println();
        char tmp = 0;
        System.out.println(tmp);
        char tmpTwo = '0';
        System.out.println(tmpTwo);
        */
    }
}
