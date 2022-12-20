package com.spongzi;

/**
 * 入口程序
 *
 * @author spong
 * @date 2022/12/20
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(fib2(64));
    }

    /**
     * fib1
     * 有问题,当n大于一定的值的时候会计算的非常慢甚至计算不出来
     *
     * @param n n
     * @return int
     */
    public static int fib1(int n) {
        if (n <= 1) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    /**
     * fib2
     * 第二种实现方式,解决第一种出现的情况
     *
     * @param n n
     * @return int
     */
    public static int fib2(int n) {
        if (n <= 1) {
            return n;
        }

        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
}
