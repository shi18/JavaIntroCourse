package dataType;

public class BasicDataType {
    public static void main(String[] args) {
        /*整数*/
        // 1.byte ---- 字节型
        byte byteVariable = 127;
        // 2.short ---- 短整型
        short shortVar = 12345;
        // 3.int ----整型
        /*int 为默认整数类型，直接写10时，会默认为int类型*/
        int intVar = 129;
        // 4.long ---- 长整型
        /*长整型在赋值尾部需要添加L或者l，
        为了方便区分小写l 和数字1，我们采取大写L作为结尾*/
        long longVar = 5000L;

        /*浮点数*/
        // 1.float ---- 单精度浮点型
        /*同 长整型 一样， 单精度浮点型也需要在尾部添加标记， F 或者 f*/
        float floatVar = 1.3F;
        float floatVarTwo = 1.3f;
        // 2.double ---- 双精度浮点型（默认数据类型）
        double doubleVar = 12.4;

        /*字符型*/
        //对于字符型数据,需要用 英文单引号。
        char charVar = 'a';
        char charVarTwo = '你';

        /*布尔型*/
        boolean boolVarT = true;
        boolean boolVarF = false;

        System.out.println("byteVariable: " + byteVariable + ", Type: " + getType(byteVariable));
        System.out.println("shortVar: " + shortVar + ", Type: " + getType(shortVar));
        System.out.println("intVar: " + intVar + ", Type: " + getType(intVar));
        System.out.println("longVar: " + longVar + ", Type: " + getType(longVar));
        System.out.println("floatVar: " + floatVar + ", Type: " + getType(floatVar));
        System.out.println("doubleVar: " + doubleVar + ", Type: " + getType(doubleVar));
        System.out.println("charVar: " + charVar + ", Type: " + getType(charVar));
        System.out.println("boolVarT: " + boolVarT + ", Type: " + getType(boolVarT));

    }

    private static String getType(Object a){
        return a.getClass().toString();
    }
}
