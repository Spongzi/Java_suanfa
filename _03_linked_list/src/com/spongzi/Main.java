package com.spongzi;

/**
 * 入口函数
 *
 * @author spong
 * @date 2022/12/22
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.remove(0);
        System.out.println(list);
    }
}
