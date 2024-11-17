package sec002_Encapsulation;

import java.util.Arrays;

public class ArraysMethodsUsageTest {
    public static void main(String[] args) {
        int[] tmpArray = {1, 30, 12, 10, 10, 23};
        System.out.println(tmpArray);
        System.out.println(Arrays.toString(tmpArray));
        Arrays.sort(tmpArray);
        System.out.println(Arrays.toString(tmpArray));

        System.out.println(Arrays.binarySearch(tmpArray, 10));
        System.out.println(Arrays.binarySearch(tmpArray, 30));
        // 如果没有找到该值，方法返回一个负数，该负数的绝对值表示插入点（即该值应该插入的位置，以保持数组的有序性）
        // -7， 这意味着在数组中没有找到指定的值，并且该值应该插入到索引 6 的位置（因为 -7 的绝对值减去 1 等于 6）
        System.out.println(Arrays.binarySearch(tmpArray, 100));
        int[] newArray = Arrays.copyOf(tmpArray, 3);
        System.out.println(Arrays.toString(newArray));
    }
}
