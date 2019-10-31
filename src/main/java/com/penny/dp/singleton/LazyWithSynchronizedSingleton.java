package com.penny.dp.singleton;

/**
 * 特点：线程安全，性能低
 * @author 0-Vector
 * @date 2019/10/31
 */
public final class LazyWithSynchronizedSingleton {

    private static LazyWithSynchronizedSingleton instance;

    /**
     * 构造方法私有
     */
    private LazyWithSynchronizedSingleton() {
    }

    /**
     * 每次获取instance都会锁方法
     * @return instance
     */
    public static synchronized LazyWithSynchronizedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyWithSynchronizedSingleton();
        }
        return instance;
    }
}
