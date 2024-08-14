package dataType;

public class ExplicitConversion {
    public static void main(String[] args) {
        /*强制类型转换 （数据类型）数据 */
        byte byteVar = 10;
        int intVar;
        intVar= (int)byteVar;
        System.out.println(getType(intVar));

        //范围大 --->>> 范围小 会出现数据损失，具体原理暂时不讲。
        long longVar = 129L;
        byteVar = (byte)longVar;

        System.out.println(byteVar);

        short shortVar = 20;

        byteVar = (byte)(byteVar + shortVar);
        System.out.println(byteVar);

    }

    private static String getType(Object a){
        return a.getClass().toString();
    }
}
