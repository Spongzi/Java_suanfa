package com.spongzi;

/**
 * 入口程序
 *
 * @author spong
 * @date 2022/12/20
 */
public class Main {
    public static void main(String[] args) {
        int n = 46;
        /*
           执行结果
           【fib1】
            开始：17:14:03:078
            1836311903
            结束：17:14:03:388
            耗时：5.654秒
            -------------------------------------
            【fib2】
            开始：17:14:03:405
            1836311903
            结束：17:14:03:405
            耗时：0.0秒
            -------------------------------------
         */
        TimeTool.check("fib1", () -> System.out.println(fib1(n)));
        TimeTool.check("fib2", () -> System.out.println(fib2(n)));
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
