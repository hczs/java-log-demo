package fun.powercheng;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author hczs8
 */
public class LoggerTest {

    public void printLog() {
        Logger logger = Logger.getLogger("fun.powercheng.LoggerTest");
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.scheduleWithFixedDelay(() -> {
            logger.info("这是 info 日志");
            logger.warning("这是 warning 日志");
            logger.severe("这是 severe（error） 日志");
        }, 1, 2, TimeUnit.SECONDS);
    }
}
