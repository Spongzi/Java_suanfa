package com.spongzi;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具
 *
 * @author spong
 * @date 2022/12/20
 */
public class TimeTool {
    private static final SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss:SSS");

    public interface Task {
        void execute();
    }

    /**
     * 检查时间
     *
     * @param title 标题
     * @param task  任务
     */
    public static void check(String title, Task task) {
        if (task == null) return;
        title = (title == null) ? "" : ("【" + title + "】");
        System.out.println(title);
        System.out.println("开始：" + fmt.format(new Date()));
        long begin = System.currentTimeMillis();
        task.execute();
        long end = System.currentTimeMillis();
        System.out.println("结束：" + fmt.format(new Date()));
        double delta = (end - begin) / 1000.0;
        System.out.println("耗时：" + delta + "秒");
        System.out.println("-------------------------------------");
    }
}
