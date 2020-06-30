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
        System.in.read();
    }
}
