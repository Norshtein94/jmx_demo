package cn.norshtein.mxbean;

/**
 * @Date: 2020/6/30
 * @Desc: 若接口名以MXBean结尾，类名无限制；若接口名以 MBean结尾，则 类名 = 接口名 - MBean
 */
public class Machine implements MachineMXBean {

    public int getCpuCore() {
        return Runtime.getRuntime().availableProcessors();
    }

    public long getFreeMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    public void shutdown() {
        System.exit(0);
    }
}