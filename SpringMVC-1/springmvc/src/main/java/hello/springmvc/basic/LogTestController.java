package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        /**
         * Usage Log
         * X log.debug("data="+data);
         * O log.debug("data={}", data);
         */

        return "ok";
    }
}
/**
 * Advantage Of Log
 * You can view metadata, such as thread information and class names, and control the appearance of the print.
 * Allows you to control the log according to the circumstances.
 * Instead of outputting only to the system out console, logs such as files or networks can be left in a separate location.
 * It also has better performance than regular System.out.
 */