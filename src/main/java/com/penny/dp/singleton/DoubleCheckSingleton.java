package com.penny.dp.singleton;

/**
 * 特点：多线程不安全
 * reorder问题：instance = new DoubleCheckSingleton(); 这句并非一个原子操作，为了完成这个操作，在JVM中大概做了三件事
 * 1.给 instance 分配内存
 * 2.调用 DoubleCheckSingleton 的构造函数来初始化成员变量
 * 3.将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
 * 但是在 JVM 的即时编译器中存在指令重排序的优化。也就是说上面的第二步和第三步的顺序是不能保证的，
 * 最终的执行顺序可能是 1-2-3，也可能是 1-3-2。若是后者，则在 3 执行完毕、2 未执行之前，被线程二抢占了，
 * 这时 instance 已是非 null （但未初始化），所以线程二会直接返回 instance 并使用，然后顺理成章地报错。
 * @author 0-Vector
 * @date 2019/10/31
 */
public final class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    /**
     * 两次检查，只锁实例化代码
     * @return instance
     */
    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
