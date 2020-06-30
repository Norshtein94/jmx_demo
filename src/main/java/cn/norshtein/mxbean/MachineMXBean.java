package cn.norshtein.mxbean;

/**
 * @Date: 2020/6/30
 * @Desc: 声明MXBean接口，接口名必须1.以MXBean结尾 或者 2. = 实现类名 + MBean。
 */
public interface MachineMXBean {
    int getCpuCore();

    long getFreeMemory();

    void shutdown();
}