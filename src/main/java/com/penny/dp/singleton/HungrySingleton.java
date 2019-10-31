package com.penny.dp.singleton;

/**
 * 特点：多线程安全；性能较高；不能懒加载
 * @author 0-Vector
 * @date 2019/10/31
 */
public final class HungrySingleton { // 使用final关键字修饰，不允许继承

    /**
     * 直接实例化
     */
    private static HungrySingleton instance = new HungrySingleton();

    /**
     * 私有构造方法
     */
    private HungrySingleton() {
    }

    /**
     * 返回已有实例
     */
    public static HungrySingleton getInstance() {
        return instance;
    }
}
