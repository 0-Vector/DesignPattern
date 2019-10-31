package com.penny.dp.singleton;

/**
 *
 * @author 0-Vector
 * @date 2019/10/31
 */
public class DoubleCheckWithVolatileSingleton {

    /**
     * 使用volatile修饰，禁止指令重排序
     */
    private volatile static DoubleCheckWithVolatileSingleton instance;

    /**
     * 私有化构造方法
     */
    private DoubleCheckWithVolatileSingleton() {
    }

    /**
     * 两次检查，只锁实例化代码
     * @return instance
     */
    public static DoubleCheckWithVolatileSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckWithVolatileSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckWithVolatileSingleton();
                }
            }
        }
        return instance;
    }
}
