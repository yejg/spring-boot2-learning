import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.TimeUnit;

/**
 * @author yejingang
 * @since 2020-11-23
 */
public class TestJol {

    public static void main(String[] args) throws InterruptedException {

        // 查看对象内部信息： ClassLayout.parseInstance(obj).toPrintable()
        // 查看对象外部信息：包括引用的对象：GraphLayout.parseInstance(obj).toPrintable()
        // 查看对象占用空间总大小：GraphLayout.parseInstance(obj).totalSize()

        /*
        * 即使偏向锁的特性被打开，出于性能（启动时间）的原因在JVM启动后的的头4秒钟，禁止偏向锁。
        * 在此期间，prototype MarkWord会将它们的bias位设置为0，以禁止实例化的对象被偏向。
        * 4秒钟之后，所有的prototype MarkWord的bias位会被重设为1，如此新的对象就可以被偏向锁定了
        * */
        TimeUnit.SECONDS.sleep(5);

        Object obj = new Object();
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        synchronized (obj) {
            System.out.println(ClassLayout.parseInstance(obj).toPrintable());
        }

    }

}
