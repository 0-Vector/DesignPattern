package com.penny.dp.singleton;

/**
 * 特点：多线程不安全；懒加载
 * @author 0-Vector
 * @date 2019/10/31
 */
public final class LazySingleton {

    private static LazySingleton instance;

    /**
     * 构造方法私有
     */
    private LazySingleton() {
    }

    /**
     * 延迟到使用时实例化
     * @return instance
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
