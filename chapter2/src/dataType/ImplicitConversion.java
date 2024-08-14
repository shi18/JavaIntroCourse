package dataType;

public class ImplicitConversion {
    public static void main(String[] args) {
        /* implicit conversion --- 隐式类型转换 也称 自动类型转换*/
        byte byteVar = 10;
        int intVar = 20;
        int sumOne = intVar + byteVar;
        System.out.println(getType(sumOne));

        short shortVar = 20;
        long longVar = 100L;

        longVar = shortVar + intVar;
        System.out.println(getType(longVar));

        /* short 、 byte 、char 类型进行计算时， 会先转为int类型，然后再进行计算*/
        System.out.println(getType(byteVar + byteVar));
        System.out.println(getType(byteVar + shortVar));

        //英文使用ascii编码表
        char charVar = 'a';
        System.out.println(byteVar);
        int a = (int)charVar;
        System.out.println(a);
        System.out.println(charVar+byteVar);

        double doubleVar = 1.2;
        System.out.println(doubleVar +charVar);

        //中文使用 unicode编码表
        char charVarTwo = '你';
        int sum = charVarTwo +100;
        System.out.println(sum);

    }

    private static String getType(Object a){
        return a.getClass().toString();
    }
}
