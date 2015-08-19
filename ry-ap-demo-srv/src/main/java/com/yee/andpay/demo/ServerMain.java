package com.yee.andpay.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: RogerYee
 * Create: 8/13/15
 */
public class ServerMain
{
    static Logger logger = LoggerFactory.getLogger(ServerMain.class);

    public static void main(String[] args) throws Exception {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "spring-config/ry-ap-demo-srv-config.xml" });

        logger.debug("Demo Server started.");
    }
}
