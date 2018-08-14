package cn.mastc.demo3;

import java.util.Arrays;

/**
 * @Author: XuJin_L
 * @Description: 数组的工具类, 包含数组的操作
 *                   java.util.Arrays
 * @Date: Created in 13:32 2018/8/14
 * @Modified By:
 */
public class ArraysDemo {
    public static void main(String[] args) {
        function();
        function_1();
        function_2();
    }

    /**
     * static void sort(数组)
     * 对数组升序排列
     */
    public static void function() {
        int[] arr = {1, 6, 4, 8, 3, 3, 1, 9, 2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    /**
     * static int binarySearch(数组, 被查找的元素)
     * 数组的二分搜索法
     * 返回元素在数组中出现的索引
     * 如果元素不存在,返回的是 -(传入点-1)
     */
    public static void function_1() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        int index = Arrays.binarySearch(arr, 8);
        System.out.println(index);
    }

    /**
     * static String toString(数组)
     * 将数组变成字符串
     */
    public static void function_2() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        String s = Arrays.toString(arr);
        System.out.println(s);
    }
}
