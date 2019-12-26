package com.tl.conf;

import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.function.Supplier;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConfApplicationTests {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {

        //日志的级别，以下是由低到高
        //可以调整日志输出级别;日志就只会输出这个级别之上的日志
        logger.trace("这是跟踪轨迹日志");
        logger.debug("这是debug日志");
        //springboot默认指定日志输出级别为info,如果没有指定级别就会使用默认
        logger.info("这是自定义日志");
        logger.warn("这是警告日志");
        logger.error("这是错误日志");
    }
}
