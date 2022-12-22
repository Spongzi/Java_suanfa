package com.spongzi;

/**
 * 列表 Api接口
 *
 * @author spong
 * @date 2022/12/22
 */
public interface List<T> {
    /**
     * 清除所有元素
     */
    void clear();

    /**
     * 元素的数量
     *
     * @return int 元素的数量
     */
    int size();


    /**
     * 是否为空
     * 如果为空 --- true
     * 如果不为空 --- false
     *
     * @return boolean
     */
    boolean isEmpty();

    /**
     * 根据下标查找元素
     *
     * @param index 当前要查找的下标
     * @return int 查找到的值
     */
    T get(int index);

    /**
     * 设置指定Index的值
     *
     * @param index   下标
     * @param element 元素
     * @return int 原来的值
     */
    T set(int index, T element);

    /**
     * 找到指定元素在当前列表里面的位置
     *
     * @param element 元素
     * @return 元素下标--如果没有找到返回-1
     */
    int indexOf(T element);

    /**
     * 是否包含元素
     *
     * @param element 要查询的元素
     * @return boolean 存在 -- true 否则 false
     */
    boolean contains(T element);

    /**
     * 添加元素(在尾部)
     *
     * @param element 元素
     */
    void add(T element);

    /**
     * 添加元素(在中间)
     *
     * @param element 元素
     */
    void add(int index, T element);

    /**
     * 删除指定元素
     *
     * @param index 下标
     * @return int 返回删除的数据
     */
    T remove(int index);
}
