package com.yee.andpay.demo.srv.hello;

import com.google.common.util.concurrent.MoreExecutors;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.yee.andpay.demo.api.hello.HelloWorldRespHandler;
import com.yee.andpay.demo.api.hello.HelloWorldResponse;
import com.yee.andpay.demo.api.hello.HelloWorldService;
import com.yee.andpay.demo.api.hello.model.UserMsg;
import com.yee.andpay.demo.api.hello.model.QueryUserMsgCond;
import com.yee.andpay.demo.srv.hello.dao.UserMsgDao;
import me.andpay.ti.lnk.annotaion.Callback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author: RogerYee
 * Create: 8/12/15
 */
public class HelloWorldServiceImpl implements HelloWorldService
{
    static final Logger logger = LoggerFactory.getLogger(HelloWorldServiceImpl.class);
    public static final String DEFAULT_MESSAGE = "Hello World";

    private UserMsgDao userMsgDao;

    public String helloWorld(String name)
    {
        logger.debug("helloWorld starts...");
        return "Hi " + name + "Hello World!";
    }

    public void helloWorld(String name, HelloWorldRespHandler respHandler)
    {
        QueryUserMsgCond condition = new QueryUserMsgCond();
        condition.setName(name);
        UserMsg userMsg = this.userMsgDao.getUnique(condition);

        HelloWorldResponse response = new HelloWorldResponse();
        response.setName(userMsg.getName());
        response.setMessage(userMsg.getMessage());
        respHandler.onSuccess(response);
    }

    @Autowired
    public void setUserMsgDao(UserMsgDao userMsgDao)
    {
        this.userMsgDao = userMsgDao;
    }
}
