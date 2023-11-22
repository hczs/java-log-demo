package fun.powercheng;

import org.slf4j.bridge.SLF4JBridgeHandler;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 * @author hczs8
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        // 安装JUL到SLF4J的桥接器
        // 这一步不 remove 的话，jul 的日志也会打印出来
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        // 不安装的话 桥接器不会生效
        SLF4JBridgeHandler.install();
        Logger logger = Logger.getLogger("fun.powercheng.App");
        new LoggerTest().printLog();
        logger.info(">>>>>>>>> 程序已启动 <<<<<<<<<<");
    }
}
