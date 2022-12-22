package com.spongzi;

/**
 * 数组列表(手写)
 *
 * @author spong
 * @date 2022/12/21
 */
public class ArrayList {

    /**
     * 元素数量
     */
    private int size = 0;

    /**
     * 所有元素
     */
    private int[] elements;

    /**
     * 默认上限
     */
    private static final int DEFAULT_CAP = 10;

    /**
     * 没有找到元素
     */
    private static final int ELEMENT_NOT_FOUNT = -1;

    /**
     * 自定义初始化大小的ArrayList
     *
     * @param cap 容量大小
     */
    public ArrayList(int cap) {
        // 如果当前输入的容量小于默认的那么就选用默认的大小
        cap = Math.max(cap, DEFAULT_CAP);
        elements = new int[cap];
    }

    public ArrayList() {
        this(DEFAULT_CAP);
    }

    /**
     * 清除所有元素
     * <p>
     * 这里不对elements数组进行清空是因为只要size=0就访问不到数组里的元素
     * 所以我们不再进行对数组清空的操作
     * 并且如果清空元素,那么下次再进行操作的时候还要再次单独申请内存
     * 如果但是数组过于庞大,可以进行判断,分开操作
     */
    public void clear() {
        size = 0;
    }

    /**
     * 元素的数量
     *
     * @return int 元素的数量
     */
    public int size() {
        return size;
    }

    /**
     * 是否为空
     * 如果为空 --- true
     * 如果不为空 --- false
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 根据下标查找元素
     *
     * @param index 当前要查找的下标
     * @return int 查找到的值
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("下标Index" + index + "不存在, Index应该在0-" + size + "之间");
        }
        return elements[index];
    }

    /**
     * 设置指定Index的值
     *
     * @param index   下标
     * @param element 元素
     * @return int 原来的值
     */
    public int set(int index, int element) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("下标Index" + index + "不存在, Index应该在0-" + size + "之间");
        }
        int oldElement = elements[index];
        elements[index] = element;
        return oldElement;
    }

    /**
     * 找到指定元素在当前列表里面的位置
     *
     * @param element 元素
     * @return 元素下标--如果没有找到返回-1
     */
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                return i;
            }
        }
        return ELEMENT_NOT_FOUNT;
    }

    /**
     * 是否包含元素
     *
     * @param element 要查询的元素
     * @return boolean 存在 -- true 否则 false
     */
    public boolean contains(int element) {
        return indexOf(element) != ELEMENT_NOT_FOUNT;
    }

    /**
     * 添加元素(在尾部)
     *
     * @param element 元素
     */
    public void add(int element) {
        add(size, element);
    }

    public void add(int index, int element) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("下标Index" + index + "不存在, Index应该在0-" + size + "之间");
        }
        expansion(size + 1);

        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    /**
     * 删除指定元素
     *
     * @param index 下标
     * @return int 返回删除的数据
     */
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("下标Index" + index + "不存在, Index应该在0-" + size + "之间");
        }
        int returnValue = elements[index];
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        return returnValue;
    }

    /**
     * 扩容操作
     *
     * @param capacity 容量
     */
    private void expansion(int capacity) {
        int oldCapacity = elements.length;
        if (oldCapacity > capacity) {
            return;
        }
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        int[] newElements = new int[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    /**
     * 字符串 -- 格式化输出
     *
     * @return {@link String}
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("size = ").append(size);
        sb.append(", capacity = ").append(elements.length);
        sb.append(", [");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            sb.append(i == size - 1 ? "" : ",");
        }
        sb.append("]");
        return sb.toString();
    }
}
