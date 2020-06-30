package cn.norshtein;

import cn.norshtein.mxbean.Machine;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception{
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName mxbeanName = new ObjectName("cn.norshtein.mxbean:type=Machine");
        Machine mxbean = new Machine();
        mbs.registerMBean(mxbean, mxbeanName);
        // 可使用JConsole连接，选择mBean，查看
        System.in.read();
    }
}
