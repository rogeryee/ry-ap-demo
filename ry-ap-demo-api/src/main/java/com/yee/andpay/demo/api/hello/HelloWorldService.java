package com.yee.andpay.demo.api.hello;

import com.yee.andpay.demo.api.ServiceGroup;
import me.andpay.ti.lnk.annotaion.Callback;
import me.andpay.ti.lnk.annotaion.LnkMethod;
import me.andpay.ti.lnk.annotaion.LnkService;
import me.andpay.ti.lnk.annotaion.Sla;

/**
 * Created with IntelliJ IDEA.
 * User: RogerYee
 */
@LnkService(serviceGroup = ServiceGroup.RY_DEMO_SRV)
public interface HelloWorldService
{
    @Sla(avgTime = 1000*10L, timeout = 1000*20L)
    String helloWorld(String name);

    @Sla(avgTime = 1000*10L, timeout = 1000*20L)
    @LnkMethod(async = true)
    void helloWorld(String name, @Callback HelloWorldRespHandler respHandler);
}
