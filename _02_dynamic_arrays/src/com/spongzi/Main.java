package com.spongzi;

/**
 * 入口函数
 *
 * @author spong
 * @date 2022/12/21
 */
public class Main {
    public static void main(String[] args) {
        /* 只能是固定的长度,长度不可以修改
           现在我们希望可以创建一个类可以有一下功能
           添加元素
           删除元素
           修改元素
           在指定位置上添加元素
           且不指定容器大小
           等等一些列方法
         */
        int[] array = new int[]{22, 33, 44};

        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(1, 1);
        System.out.println(list);
        int remove = list.remove(1);
        System.out.println("remove value: " + remove);
        remove = list.remove(1);
        System.out.println("remove value: " + remove);
        System.out.println(list);
    }
}
