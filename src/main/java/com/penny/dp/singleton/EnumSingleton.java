package com.penny.dp.singleton;

/**
 * 特点：线程安全；不能被继承；不能懒加载
 * @author 0-Vector
 * @date 2019/10/31
 */
public enum EnumSingleton {
    /**
     * 实例为枚举值
     */
    INSTANCE;

    EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
