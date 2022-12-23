package com.spongzi;

/**
 * 链表
 *
 * @author spong
 * @date 2022/12/22
 */
public class LinkedList<T> implements List<T> {
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

    /**
     * 没有找到元素
     */

    @Override
    public void clear() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public int indexOf(T element) {
        return 0;
    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) != ELEMENT_NOT_FOUNT;
    }

    @Override
    public void add(T element) {
        add(size, element);
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("index not in [ 0, " + size + " ]");
        }
        
    }

    @Override
    public T remove(int index) {
        return null;
    }

}
