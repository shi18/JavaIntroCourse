package sec01_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 0. 创建ArrayList
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        ArrayList<String> strList = new ArrayList<>();
        // 1. 通过add添加元素，返回值为布尔值，一般不使用返回值
        boolean flag = arrList.add(2);
        System.out.println(arrList);
        arrList.add(20);
        arrList.add(12);
        arrList.add(40);
        arrList.add(23);
        arrList.add(44);
        arrList.add(98);
        strList.add("hello");
        strList.add("how");
        strList.add("are");
        strList.add("you");
        System.out.println(arrList);
        System.out.println(strList);

        // 2. 通过元素值内容移除元素
        strList.remove("hello");
        System.out.println("strList: " + strList);
        // 通过索引值移除元素,
        strList.remove(2); // 将[how, are, you] 中的index为2的you移除
        System.out.println("arrList: " + strList);
        int removed;
        removed = arrList.remove(2); // 对于整数元素比较特殊，当参数传入2时，认为删除的是索引值为2的元素
        System.out.println(arrList + " removed value is : " + removed);
        // 如果想要删除index为0的元素2，需要使用Integer.valueOf(2),将元素2传入，
        // 这样就认为删除的事数值2，而不是按照索引去删除元素
        boolean removedFlag = arrList.remove(Integer.valueOf(2));
        System.out.println(arrList + " removed flag is : " + removedFlag);

        //3. 修改元素
        // 通过索引值决定修改的元素的位置，包含两个参数，第一个参数为索引，第二个参数为目标值
        //返回值为修改前索引值所在位置的元素的值
        int old;
        old = arrList.set(0, 33);
        System.out.println(arrList + " updated is : " + old);

        //4. 查询元素
        // 通过索引值来获取元素，返回值为获取到的元素的值。
        int getVal;
        getVal = arrList.get(0);
        System.out.println(getVal);

        //5. 获取ArrayList长度
        System.out.println(arrList.size());

        //6. 遍历元素
        System.out.println("循环遍历ArrayList：");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());

    }
}
