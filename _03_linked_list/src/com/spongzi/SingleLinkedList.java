package com.spongzi;

/**
 * 链表
 *
 * @author spong
 * @date 2022/12/22
 */
public class SingleLinkedList<T> implements List<T> {
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
        T element;

        /**
         * 指向下一个指针
         */
        Node<T> next;

        /**
         * 构造函数
         *
         * @param element 元素
         * @param next    下一个
         */
        public Node(T element, Node<T> next) {
            this.element = element;
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
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index not in [ 0, " + size + " ]");
        }
        return this.node(index).element;
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index not in [ 0, " + size + " ]");
        }
        Node<T> oldNode = this.node(index);
        oldNode.element = element;
        return oldNode.element;
    }

    @Override
    public int indexOf(T element) {
        Node<T> currentNode = this.head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.element == element) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return ELEMENT_NOT_FOUNT;
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
        if (size == 0) {
            this.head = new Node<>(element, null);
            size++;
            return;
        }
        Node<T> curNode = this.node(index);
        Node<T> preNode = this.node(index - 1);
        preNode.next = new Node<>(element, curNode == null ? null : curNode.next);
        size++;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("index not in [ 0, " + size + " ]");
        }
        T returnValue;
        if (index == 0) {
            returnValue = head.element;
            head = head.next;
            return returnValue;
        }
        Node<T> curNode = this.node(index);
        returnValue = curNode.element;
        Node<T> preNode = this.node(index - 1);
        preNode.next = curNode.next;
        return returnValue;
    }

    private Node<T> node(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("index not in [ 0, " + size + " ]");
        }
        Node<T> returnNode = head;
        for (int i = 0; i < index; i++) {
            returnNode = returnNode.next;
        }
        return returnNode;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("[");
        Node<T> node = head;
        while (node != null) {
            string.append(node.element).append(node.next == null ? "" : ", ");
            node = node.next;
        }
        string.append("]");
        return string.toString();
    }
}
