package com.spongzi;

/**
 * 链表
 *
 * @author spong
 * @date 2022/12/22
 */
public class LinkedList<T> {
    /**
     * 大小
     */
    private int size = 0;

    /**
     * 头部指针
     */
    private Node<T> head;

    /**
     * 节点
     *
     * @author spong
     * @date 2022/12/22
     */
    private static class Node<T> {
        /**
         * 元素
         */
        T elementE;

        /**
         * 指向下一个指针
         */
        Node<T> next;

        /**
         * 构造函数
         *
         * @param elementE 元素
         * @param next     下一个
         */
        public Node(T elementE, Node<T> next) {
            this.elementE = elementE;
            this.next = next;
        }
    }
}
