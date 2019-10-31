package com.penny.dp.singleton;

/**
 * 推荐使用
 * 特点：懒加载，线程安全
 * @author 0-Vector
 * @date 2019/10/31
 */
public final class SingletonWithHolder {

    /**
     * 私有化构造方法
     */
    private SingletonWithHolder() {
    }

    /**
     * 静态内部类Holder中，持有SingletonWithHolder的实例
     */
    private static class Holder {
        private static SingletonWithHolder instance = new SingletonWithHolder();
    }

    /**
     * Holer被引用时，主动实例化SingletonWithHolder
     * @return instance
     */
    public static SingletonWithHolder getInstance() {
        return Holder.instance;
    }
}
